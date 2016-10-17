package com.example.clarinetmaster.baihuay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = (Button) findViewById(R.id.twoDigits);
        Button b2 = (Button) findViewById(R.id.threeDigits);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this, showDigits.class);
        if(v.getId()==R.id.twoDigits){
            i.putExtra("Digits", 2);
        }else if(v.getId()==R.id.threeDigits){
            i.putExtra("Digits", 3);
        }
        startActivity(i);
    }
}
