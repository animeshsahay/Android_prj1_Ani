package com.example.animesh.anicalc1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.animesh.anicalc1.R;

/**
 * Created by animesh on 17/6/15.
 */
public class Menu extends ListActivity{
    String classes[] = {"MainActivity","text","Email","Camera","Data","GFX","GFXSurface","slider"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Full Screen method
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l,v,position,id);
        String biriyani = classes[position];
        try {
            Class ourClass = Class.forName("com.example.animesh.anicalc1." + biriyani);
            Intent ourIntent = new Intent(Menu.this, ourClass);
            startActivity(ourIntent);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater blowUp = getMenuInflater();
        blowUp.inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.aboutUs:
                Intent i = new Intent("com.example.animesh.anicalc1.ABOUTUS");
                startActivity(i);
                break;
            case R.id.preferences:
                Intent p = new Intent("com.example.animesh.anicalc1.PREFS");
                startActivity(p);
                break;
            case R.id.exit:
                finish();
                break;
        }return false;
    }
}
