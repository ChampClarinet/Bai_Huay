package com.example.clarinetmaster.baihuay;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showDigits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_digits);

        Bundle extras = getIntent().getExtras();

        int digits = extras.getInt("Digits");

        TextView label = (TextView) findViewById(R.id.label);
        String s = getString(R.string.labelFront)+" "+Integer.toString(digits)+" "+getString(R.string.labelRear);
        label.setText(s);

        TextView result = (TextView) findViewById(R.id.result);
        String text = new Huay(digits).getResult();
        result.setText(text);
    }
}
