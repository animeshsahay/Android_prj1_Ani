package com.example.animesh.anicalc1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by animesh on 20/6/15.
 */
public class OpenedClass extends Activity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener{
    TextView question,test;
    Button reset;
    RadioGroup selectionList;
    String setData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);
        initialize();

        SharedPreferences getData = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        String et = getData.getString("name","Animesh is....");
        String values = getData.getString("list","4");
        if(values.contentEquals("1")){
            question.setText(et);
        }
        //Bundle gotBasket = getIntent().getExtras();
         //gotBread = gotBasket.getString("key");
        //question.setText(gotBread);
    }

    private void initialize() {
        question = (TextView) findViewById(R.id.tvQuestion);
        test = (TextView) findViewById(R.id.tvtest);
        reset = (Button) findViewById(R.id.bReturn);
        selectionList = (RadioGroup) findViewById(R.id.rgAnswer);
        reset.setOnClickListener(this);
        selectionList.setOnCheckedChangeListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent person = new Intent();
        Bundle backpack = new Bundle();
        backpack.putString("answer",setData);
        person.putExtras(backpack);
        setResult(RESULT_OK,person);
        finish();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
    switch(checkedId){
        case R.id.rAwesome:
            setData = "Probably Right!!!!";
            break;
        case R.id.rHot:
            setData = "Definitely Right!!!";
            break;
        case R.id.rBoth:
            setData = "Spot ON!!!";
            break;
    }
        test.setText(setData);

    }
}
