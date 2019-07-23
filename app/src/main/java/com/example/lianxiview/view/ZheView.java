package com.example.lianxiview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.blankj.utilcode.util.ScreenUtils;
import com.example.lianxiview.R;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/23
 *@Time:17:27
 *@Description:作用:
 * */public class ZheView extends View {
     private Paint linePain;
    public int height;
    private int width;


    public ZheView(Context context) {
        this(context,null);
    }

    public ZheView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ZheView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initv(context,attrs);
    }

    private void initv(Context context,AttributeSet attrs) {
        linePain=new Paint();
        linePain.setColor(Color.YELLOW);
        linePain.setStrokeWidth(10);
        linePain.setAntiAlias(true);
        linePain.setDither(true);
        height = ScreenUtils.getScreenHeight();
        width = ScreenUtils.getAppScreenWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(20,height-200,width-20,height-200,linePain);
        canvas.drawLine(20,height-200,20,0,linePain);
    }
}
