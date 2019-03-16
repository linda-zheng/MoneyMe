package com.example.mybuttons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_3 extends AppCompatActivity {
    String money;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        money = getIntent().getStringExtra("MONEY");
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });
    }

    public void click (View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("MONEY", Integer.toString((int)Math.round(Integer.valueOf(money)*0.7)));
        getSharedPreferences("Settings", this.MODE_PRIVATE).edit().putString("score",money).apply();
        startActivity(intent);
    }
}
