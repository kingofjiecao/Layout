package com.example.kingofjiecao.layout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RelativeLayoutActivity extends AppCompatActivity {
    private Button rl_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        rl_btn = findViewById(R.id.rl_btn4);
        rl_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayoutActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
