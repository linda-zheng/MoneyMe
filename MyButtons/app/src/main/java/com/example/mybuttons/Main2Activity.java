package com.example.mybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.*;
import java.util.Random;

public class Main2Activity extends AppCompatActivity {
    String money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        money = getIntent().getStringExtra("MONEY");
        /*if (money == null) {
            money = "1000";
        }*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = findViewById(R.id.textView);
        textView.setText("Money: " + money);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });
    }

    public void click (View view) {
        Random rand = new Random();
        Intent intent;
        int n = rand.nextInt(12);
        if (n<5) {//shopping mall
            intent = new Intent(this, Activity_2.class);
        } else if (n<6) {//family emergency
            intent = new Intent(this, Activity_3.class);
        } else {//pay day
            intent = new Intent(this, Activity_4.class);
        }
        intent.putExtra("MONEY", money);
        FileHelper.saveToFile(money);
        startActivity(intent);
    }


}
