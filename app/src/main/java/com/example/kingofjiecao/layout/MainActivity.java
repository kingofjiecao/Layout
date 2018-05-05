package com.example.kingofjiecao.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    private Button[] btn = new Button[5];
    private Intent[] intent = new Intent[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn[0] = findViewById(R.id.main_btn0);
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent[0]);
            }
        });
        btn[1] = findViewById(R.id.main_btn1);
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[1] = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent[1]);
            }
        });
        btn[2] = findViewById(R.id.main_btn2);
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[2] = new Intent(MainActivity.this, FrameLayoutActivity.class);
                startActivity(intent[2]);
            }
        });
        btn[3] = findViewById(R.id.main_btn3);
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[3] = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent[3]);
            }
        });
        btn[4] = findViewById(R.id.main_btn4);
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[4] = new Intent(MainActivity.this, GridLayoutActivity.class);
                startActivity(intent[4]);
            }
        });




    }
}
