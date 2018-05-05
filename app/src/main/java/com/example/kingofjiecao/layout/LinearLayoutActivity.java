package com.example.kingofjiecao.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearLayoutActivity extends AppCompatActivity {
    private Button[] btn = new Button[4];
    private Intent[] intent = new Intent[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        btn[0] = findViewById(R.id.ll_btn0);
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[0] = new Intent(LinearLayoutActivity.this,LinearLayoutActivity.class);
                startActivity(intent[0]);
            }
        });

        btn[1] = findViewById(R.id.ll_btn1);
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[1] = new Intent(LinearLayoutActivity.this,LinearLayout2Activity.class);
                startActivity(intent[1]);
            }
        });

        btn[2] = findViewById(R.id.ll_btn2);
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[2] = new Intent(LinearLayoutActivity.this,LinearLayout3Activity.class);
                startActivity(intent[2]);
            }
        });

        btn[3] = findViewById(R.id.ll_btn3);
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent[3] = new Intent(LinearLayoutActivity.this,MainActivity.class);
                startActivity(intent[3]);
            }
        });

    }
}
