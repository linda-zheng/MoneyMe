package com.example.mybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.*;

public class Activity_2 extends AppCompatActivity {
    String money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        money = getIntent().getStringExtra("MONEY");

        Button btnHat = findViewById(R.id.btnHat);
        btnHat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickHat(view);
            }
        });

        Button btnJacket = findViewById(R.id.btnJacket);
        btnJacket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickJacket(view);
            }
        });
    }

    public void clickHat (View view) {
       Intent intent = new Intent(this, Main2Activity.class);
       intent.putExtra("MONEY", Integer.toString(Integer.valueOf(money) - 15) );
       getSharedPreferences("Settings", this.MODE_PRIVATE).edit().putString("score",money).apply();
       startActivity(intent);
    }
    public void clickJacket(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("MONEY", Integer.toString(Integer.valueOf(money) - 25) );
        getSharedPreferences("Settings", this.MODE_PRIVATE).edit().putString("score",money).apply();
        startActivity(intent);
    }
}
