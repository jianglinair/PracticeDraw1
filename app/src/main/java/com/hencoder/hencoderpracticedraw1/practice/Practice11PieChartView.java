package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    float[] pts = {150, 100, 300, 100, 300, 100, 430, 360};
    float[] pts1 = {830, 250, 750, 250, 750, 250, 450, 380};
    float[] pts2 = {830, 385, 730, 385};
    float[] pts3 = {830, 430, 780, 430, 780, 430, 760, 405, 760, 405, 450,380};
    float[] pts4 = {830, 475, 780, 475, 780, 475, 760, 450, 760, 450, 450, 380};
    float[] pts5 = {830, 600, 700, 600, 700, 600, 450, 380};
    float[] pts6 = {150, 650, 280, 650, 280, 650, 450, 380};

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        paint.setColor(Color.parseColor("#bbbbbb"));
        paint.setStrokeWidth(3);
        canvas.drawLines(pts, paint);
        canvas.drawLines(pts1, paint);
        canvas.drawLines(pts2, paint);
        canvas.drawLines(pts3, paint);
        canvas.drawLines(pts4, paint);
        canvas.drawLines(pts5, paint);
        canvas.drawLines(pts6, paint);

        paint.setColor(Color.parseColor("#fefefe"));
        paint.setTextSize(25);
        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Lollipop", 140, 100, paint);
        canvas.drawText("KitKat", 140, 650, paint);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText("Marshmallow", 840, 250, paint);
        canvas.drawText("Froyo", 840, 385, paint);
        canvas.drawText("Gingerbread", 840, 430, paint);
        canvas.drawText("Ice Cream Sandwich", 840, 475, paint);
        canvas.drawText("Jelly Bean", 840, 600, paint);
        paint.setTextSize(50);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText("饼图", 450, 740, paint);

        paint.setColor(Color.parseColor("#ffc107"));
        canvas.drawArc(170, 120, 730, 640, -60, 60, true, paint);
        paint.setColor(Color.parseColor("#9c27b0"));
        canvas.drawArc(170, 120, 730, 640, 2, 6, true, paint);
        paint.setColor(Color.parseColor("#9e9e9e"));
        canvas.drawArc(170, 120, 730, 640, 10, 6, true, paint);
        paint.setColor(Color.parseColor("#009688"));
        canvas.drawArc(170, 120, 730, 640, 18, 60, true, paint);
        paint.setColor(Color.parseColor("#2196f3"));
        canvas.drawArc(170, 120, 730, 640, 80, 100, true, paint);
        paint.setColor(Color.parseColor("#f44336"));
        canvas.drawArc(150, 100, 710, 620, -180, 120, true, paint);
    }

}
