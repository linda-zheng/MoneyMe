package com.example.mybuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.*;


public class MainActivity extends AppCompatActivity {
    EditText edU, edP;
    TextView tV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = findViewById(R.id.textView);
        edU = findViewById(R.id.edUsername);
        edP = findViewById(R.id.edPassword);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(edU.getText().toString().equals("admin") &&
                        edP.getText().toString().equals("admin")) {
                    click(view);
                }else{
                    tV.setText("Login failed, please retry.");
                }
            }
        });
    }

    public void click (View view) {

        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("MONEY", getSharedPreferences("Settings", this.MODE_PRIVATE).getString("score", "1000"));
        startActivity(intent);
    }
}
