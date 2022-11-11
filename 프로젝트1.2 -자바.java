package com.cookandroid.homepractice07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity implements View.OnClickListener {

    TextView Ttext1 , Ttext2;
    EditText Ted1,Ted2;
    Button Tbtn1, Tbtn2, Tbtn3, Tbtn4, Tbtn5;
    int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Ttext1 = (TextView) findViewById(R.id.Ttext1);
        Ttext2 = (TextView) findViewById(R.id.Ttext1);
        Ted1 = (EditText) findViewById(R.id.Ted1);
        Ted2 = (EditText) findViewById(R.id.Ted2);
        Tbtn1 = (Button) findViewById(R.id.Tbtn1);
        Tbtn2 = (Button) findViewById(R.id.Tbtn2);
        Tbtn3 = (Button) findViewById(R.id.Tbtn3);
        Tbtn4 = (Button) findViewById(R.id.Tbtn4);
        Tbtn5 = (Button) findViewById(R.id.Tbtn5);

        Tbtn1.setOnClickListener(this);
        Tbtn2.setOnClickListener(this);
        Tbtn3.setOnClickListener(this);
        Tbtn4.setOnClickListener(this);
        Tbtn5.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        String num1 = Ted1.getText().toString();
        String num2 = Ted1.getText().toString();

        if (Ted1.getText().toString().equals("")||Ted2.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "값을 입력하세요!", Toast.LENGTH_SHORT).show();
        } else{
            switch (view.getId()){

                case R.id.Tbtn1:
                    result = Integer.parseInt(num1)+Integer.parseInt(num2);
                    break;
                case R.id.Tbtn2:
                    result = Integer.parseInt(num1)-Integer.parseInt(num2);
                    break;
                case R.id.Tbtn3:
                    result = Integer.parseInt(num1)*Integer.parseInt(num2);
                    break;
                case R.id.Tbtn4:
                    result = Integer.parseInt(num1)/Integer.parseInt(num2);
                    break;
                case R.id.Tbtn5:
                    result = Integer.parseInt(num1)%Integer.parseInt(num2);
                    break;

            }
            Ttext2.setText("계산결과 : "+ result);


        }

    }
}