package com.example.animesh.anicalc1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by animesh on 25/6/15.
 */
public class GFXSurface extends Activity{
    AnimeshSurface ourSurface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourSurface = new AnimeshSurface(this);
        setContentView(ourSurface);
    }
}
