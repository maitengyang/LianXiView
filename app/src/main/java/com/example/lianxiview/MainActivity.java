package com.example.lianxiview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.lianxiview.view.BView;
import com.example.lianxiview.view.ZheView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * 手指滑动小球
     * @param view
     */
    public void ball(View view) {
    }

    /**
     * 圆形圆角图
     * @param view
     */
    public void circle(View view) {

    }

    /**
     * 流式布局
     * @param view
     */
    public void flowLayout(View view) {

    }

    public void add(View view) {

        BView bView  = findViewById(R.id.bview);
        bView.addA();

    }

    public void clear(View view) {
        BView bView  = findViewById(R.id.bview);
        bView.cleA();
    }

    public void tiao(View view) {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
}
