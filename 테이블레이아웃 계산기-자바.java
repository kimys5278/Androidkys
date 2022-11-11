package com.cookandroid.homepractice13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    TextView text;
    Button add,sub,mul,div,nam;
    String num1,num2;

    Button [] numbtn = new Button[10];
    int [ ] numbtnid = {R.id.btn0,R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4
            ,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("테이블레이아웃 계산기");

        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        nam = findViewById(R.id.nam);
        text = findViewById(R.id.text);



        //숫자버튼10개 대입
        for(int i =0; i<numbtnid.length;++i){
            numbtn[i] = findViewById(numbtnid[i]);
        }
        //숫자버튼10개 클릭처리
        for(int i = 0; i<numbtnid.length;++i){
            final int index = i ;
            numbtn[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(ed1.isFocused()==true){
                        num1 = ed1.getText().toString()
                                +numbtn[index].getText().toString();
                        ed1.setText(num1);
                    }else if(ed2.isFocused()==true){
                        num2=ed2.getText().toString()
                                +numbtn[index].getText().toString();
                        ed2.setText(num2);
                    }else{
                        Toast.makeText(getApplicationContext(), "먼저 에디트텍스트를 선택하세요.", Toast.LENGTH_SHORT).show();
                    }

                }
            });

        }

        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                int result = Integer.parseInt(num1)+Integer.parseInt(num2);
                text.setText("계산결과 : "+ result);
                return false;
            }
        });

        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                int result = Integer.parseInt(num1)-Integer.parseInt(num2);
                text.setText("계산결과 : "+ result);
                return false;
            }
        });

        mul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                int result = Integer.parseInt(num1)*Integer.parseInt(num2);
                text.setText("계산결과 : "+ result);
                return false;
            }
        });

        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                int result = Integer.parseInt(num1)/Integer.parseInt(num2);
                text.setText("계산결과 : "+ result);
                return false;
            }
        });

        nam.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1 = ed1.getText().toString();
                num2 = ed2.getText().toString();
                int result = Integer.parseInt(num1)%Integer.parseInt(num2);
                text.setText("계산결과 : "+ result);
                return false;
            }
        });
    }

    }
