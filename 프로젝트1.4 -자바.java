package com.cookandroid.homepractice07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3;
    RadioGroup rg1;
    Switch sw1;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.text1);
        sw1 = (Switch) findViewById(R.id.sw1);
        rg1 = (RadioGroup) findViewById(R.id.rg1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mintent = new Intent(MainActivity.this,DogAtivity.class);
                startActivity(Mintent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mintent = new Intent(MainActivity.this,AndroidAtivity.class);
                startActivity(Mintent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Mintent = new Intent(MainActivity.this,Calculator.class);
                startActivity(Mintent);
            }
        });



        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (sw1.isChecked()== true){
                    rg1.setVisibility(View.VISIBLE);
                }
                else {
                    rg1.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}