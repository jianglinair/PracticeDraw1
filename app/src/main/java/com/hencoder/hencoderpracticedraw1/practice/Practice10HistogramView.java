package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint = new Paint();
    float[] pts = new float[]{130, 80, 130, 550, 130, 550, 920, 550};

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        paint.setColor(Color.WHITE);
        paint.setStrokeWidth(2);
        canvas.drawLines(pts, paint);

        paint.setColor(Color.parseColor("#72b916"));
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(140, 548, 240, 550, paint);
        canvas.drawRect(250, 530, 350, 550, paint);
        canvas.drawRect(360, 530, 460, 550, paint);
        canvas.drawRect(470, 330, 570, 550, paint);
        canvas.drawRect(580, 200, 680, 550, paint);
        canvas.drawRect(690, 100, 790, 550, paint);
        canvas.drawRect(800, 400, 900, 550, paint);

        paint.setColor(Color.WHITE);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTextSize(25);
        canvas.drawText("Froyo", 190, 575, paint);
        canvas.drawText("GB", 300, 575, paint);
        canvas.drawText("IC S", 410, 575, paint);
        canvas.drawText("JB", 520, 575, paint);
        canvas.drawText("KitKat", 630, 575, paint);
        canvas.drawText("L", 740, 575, paint);
        canvas.drawText("M", 850, 575, paint);

        paint.setTextSize(50);
        canvas.drawText("直方图", 525, 700, paint);
    }
}
