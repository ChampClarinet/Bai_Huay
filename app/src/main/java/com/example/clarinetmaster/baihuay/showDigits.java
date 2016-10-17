package com.example.clarinetmaster.baihuay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class showDigits extends AppCompatActivity {

    Bundle extras = getIntent().getExtras();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_digits);
        int digits = extras.getInt("Digits");
        TextView label = (TextView) findViewById(R.id.label);
        label.setText(R.string.labelFront+digits+R.string.labelRear);
        TextView result = (TextView) findViewById(R.id.result);
        String text = null;
        if(digits==2) text = getRandomTwoDigits();
        else if(digits==3) text = getRandomThreeDigits();
        result.setText(text);
    }

    protected String getRandomTwoDigits(){
        Random r = new Random();
        String result = Integer.toString(r.nextInt(100));
        if(result.length() < 2) result = addZero(result, 2 - result.length());
        return result;
    }

    protected String getRandomThreeDigits(){
        Random r = new Random();
        String result = Integer.toString(r.nextInt(1000));
        if(result.length() < 3) result = addZero(result, 3 - result.length());
        return result;
    }

    protected String addZero(String s, int diff){
        for(int i=0;i<diff;++i) s = "0" + s;
        return s;
    }
}
