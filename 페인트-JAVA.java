package com.cookandroid.grahpic1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MygraphicView(this));
    }
    private static class MygraphicView extends View {
        public  MygraphicView(Context context){
            super(context);
        }
        protected void onDraw(Canvas canvas){
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(Color.RED);
            paint.setStrokeWidth(10);
            canvas.drawLine(20,20,600,20,paint);

            paint.setColor(Color.BLUE);
            canvas.drawLine(20,60,600,60,paint);

            paint.setColor(Color.GREEN);
            Rect rect1 = new Rect(20,100,20+200,100+200);
            canvas.drawRect(rect1,paint);

            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.STROKE);
            Rect rect2 = new Rect(260,100,460,300);
            canvas.drawRect(rect2,paint);

            paint.setColor(Color.GRAY);
            RectF rect3 = new RectF(500,100,700,300);
            canvas.drawRoundRect(rect3,40,40,paint);

            paint.setColor(Color.MAGENTA);
            canvas.drawCircle(120,450,100,paint);

            paint.setColor(Color.BLACK);
            paint.setStrokeWidth(5);
            Path path1 = new Path();
            path1.moveTo(20,550);
            path1.lineTo(120,650);
            path1.lineTo(220,550);
            path1.lineTo(320,650);
            path1.lineTo(420,550);
            canvas.drawPath(path1,paint);

            paint.setStyle(Paint.Style.FILL);
            paint.setStrokeWidth(0);
            paint.setTextSize(60);
            canvas.drawText("안드로이드",20,750,paint);

        }
    }

}