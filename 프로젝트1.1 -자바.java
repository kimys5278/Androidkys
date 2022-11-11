package com.cookandroid.homepractice07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class AndroidAtivity extends AppCompatActivity {
    Switch Asw1;
    RadioButton Arb1, Arb2, Arb3;
    RadioGroup Arg1;
    Button Abtn1 ,Abtn2,Abtn3;
    ImageView Aim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_ativity);
        Asw1= (Switch)findViewById(R.id.Asw1);
        Arb1= (RadioButton) findViewById(R.id.Arb1);
        Arb2= (RadioButton)findViewById(R.id.Arb2);
        Arb3= (RadioButton)findViewById(R.id.Arb3);
        Abtn1= (Button) findViewById(R.id.Abtn1);
        Abtn2= (Button)findViewById(R.id.Abtn2);
        Abtn3= (Button)findViewById(R.id.Abtn3);
        Aim1= (ImageView) findViewById(R.id.Aim1);
        Arg1= (RadioGroup) findViewById(R.id.Arg1);
        setTitle("안드로이드 버전 선택");

        Asw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(Asw1.isChecked()==true){
                    Arg1.setVisibility(View.VISIBLE);
                    Abtn1.setVisibility(View.VISIBLE);
                    Abtn2.setVisibility(View.VISIBLE);
                    Abtn3.setVisibility(View.VISIBLE);
                    Aim1.setVisibility(View.VISIBLE);
                }
                else{
                    Arg1.setVisibility(View.INVISIBLE);
                    Abtn1.setVisibility(View.INVISIBLE);
                    Abtn2.setVisibility(View.INVISIBLE);
                    Abtn3.setVisibility(View.INVISIBLE);
                    Aim1.setVisibility(View.INVISIBLE);
                }
            }
        });
        Abtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (Arg1.getCheckedRadioButtonId()){
                    case R.id.Arb1:
                        Aim1.setImageResource(R.drawable.q10);
                        break;
                    case R.id.Arb2:
                        Aim1.setImageResource(R.drawable.r11);
                        break;
                    case R.id.Arb3:
                        Aim1.setImageResource(R.drawable.s12);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "버전을 선택하세요", Toast.LENGTH_SHORT).show();

                }
            }
        });

        Abtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish(); }
        });
        Abtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {Asw1.setChecked(false);}
        });


    }
}