package com.example.animesh.anicalc1;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by animesh on 20/6/15.
 */
public class prefs extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.prefs);

    }
}
