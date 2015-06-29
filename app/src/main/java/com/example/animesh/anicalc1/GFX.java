package com.example.animesh.anicalc1;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by animesh on 24/6/15.
 */
public class GFX extends Activity {
    Animesh ourView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ourView = new Animesh(this);
        setContentView(ourView);
    }

}
