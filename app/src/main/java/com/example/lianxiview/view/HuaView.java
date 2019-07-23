package com.example.lianxiview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import com.example.lianxiview.R;

/*
 *@Auther:苏格拉没有底
 *@Date: 2019/7/23
 *@Time:14:31
 *@Description:作用:
 * */public class HuaView extends View {
     private Paint cri_paint;
     private float x,y;
    public HuaView(Context context) {
        this(context,null);
    }

    public HuaView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public HuaView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initv(context,attrs);
    }

    private void initv(Context context, AttributeSet attrs) {
        cri_paint = new Paint();
        cri_paint.setAntiAlias(true);
        cri_paint.setStyle(Paint.Style.STROKE);
        cri_paint.setStrokeWidth(10);
        cri_paint.setDither(true);
        cri_paint.setColor(ContextCompat.getColor(getContext(),R.color.colorAccent));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(x+100,y+100,100,cri_paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_POINTER_DOWN:
                x = event.getX()-100;
                y = event.getY()-100;

                break;
            case MotionEvent.ACTION_MOVE:

                x = event.getX()-100;
                y = event.getY()-100;

                break;
            case MotionEvent.ACTION_UP:
                x = 0;
                y = 0;
                break;

        }
        postInvalidate();
        return true;
    }
}
