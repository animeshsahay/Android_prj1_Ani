package com.example.animesh.anicalc1;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.concurrent.ForkJoinWorkerThread;

/**
 * Created by animesh on 25/6/15.
 */
public class AnimeshSurface extends SurfaceView implements Runnable {

   SurfaceHolder ourHolder;
    boolean isRunning  = true;
    Thread thread = null;
    public AnimeshSurface(Context context) {
      super(context);
     ourHolder = getHolder();
     thread = new Thread(this);
     thread.start();
    }

    @Override
    public void run() {
        while(isRunning){
            if(!ourHolder.getSurface().isValid())
                continue;

            Canvas canvas = ourHolder.lockCanvas();
            canvas.drawRGB(02,02,150);
            ourHolder.unlockCanvasAndPost(canvas);
        }

    }
}
