package com.example.kingofjiecao.layout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class FrameLayoutActivity extends AppCompatActivity {
    private Button btn;
    private int[] names = new int[]{R.id.gl_iv0,R.id.gl_iv1,R.id.gl_iv2,R.id.gl_iv3,R.id.gl_iv4};
    private ImageView[] iv = new ImageView[5];
    private int current = 0;
    private int[] image = new int[]{
            R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5
    };

    Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 0x123) {
                for (int i = 0; i < names.length; i++) {

                    iv[i].setBackgroundResource(image[(i + current) % names.length]);
                }
                current++;
            }
            super.handleMessage(msg);
        }

        ;
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);
        btn = findViewById(R.id.gl_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FrameLayoutActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        for(int i=0;i<names.length;i++) {
            iv[i] = findViewById(names[i]);
        }
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                handler.sendEmptyMessage(0x123);
            }
        },0,200);
    }

}
