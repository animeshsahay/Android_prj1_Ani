package com.example.animesh.anicalc1;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.Random;

/**
 * Created by animesh on 17/6/15.
 */
public class text extends Activity implements View.OnClickListener{
    Button chkCmmd;
    ToggleButton passTogg;
    EditText input;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);
        chickenBiriyani();
        passTogg.setOnClickListener(this);
        chkCmmd.setOnClickListener(this);

    }

    private void chickenBiriyani() {
        chkCmmd = (Button) findViewById(R.id.bResult);
        passTogg = (ToggleButton) findViewById(R.id.tbPassword);
        input = (EditText) findViewById(R.id.editview1);
        display = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.bResult:
                String check = input.getText().toString();
                display.setText(check);
                if(check.contentEquals("left")){
                    display.setGravity(Gravity.LEFT);
                }else if(check.contentEquals("center")){
                    display.setGravity(Gravity.CENTER);
                }else if (check.contentEquals("right")){
                    display.setGravity(Gravity.RIGHT);
                }else if (check.contentEquals("blue")) {
                    display.setTextColor(Color.BLUE);
                }else if(check.contains("WTF")) {
                    Random crazy = new Random();
                    display.setText("WTF!!!!!");
                    display.setTextSize(crazy.nextInt(75));
                    display.setTextColor(Color.rgb(crazy.nextInt(265),crazy.nextInt(265),crazy.nextInt(265)));
                    switch(crazy.nextInt(3)){
                        case 0:
                            display.setGravity(Gravity.LEFT);
                            break;
                        case 1:
                            display.setGravity(Gravity.CENTER);
                            break;
                        case 2:
                            display.setGravity(Gravity.RIGHT);
                            break;
                    }
                }else{
                    display.setText("Invalid");
                    display.setGravity(Gravity.CENTER);
                    display.setTextColor(Color.BLACK);
                }
              break;
            case R.id.tbPassword:
                if(passTogg.isChecked()){
                    input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }else{
                    input.setInputType(InputType.TYPE_CLASS_TEXT);
                }
                break;
        }

    }
}
