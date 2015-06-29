package com.example.animesh.anicalc1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/**
 * Created by animesh on 24/6/15.
 */
public class Animesh extends View {
    Bitmap gball;
    int changingY;
    public Animesh(Context context) {
        super(context);
        gball = BitmapFactory.decodeResource(getResources(),R.drawable.pink_button2);
        changingY = 0;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        canvas.drawBitmap(gball,(canvas.getWidth()/2),changingY,null);
        if(changingY<canvas.getHeight()){
            changingY += 10;
        }else{
            changingY = 0;
        }
        Rect middleRect = new Rect();
        middleRect.set(0,400,canvas.getWidth(),550);
        Paint p = new Paint();
        p.setColor(Color.BLUE);
        canvas.drawRect(middleRect,p);
        invalidate();
    }
}

