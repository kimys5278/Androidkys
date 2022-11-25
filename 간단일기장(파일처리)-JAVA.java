package com.cookandroid.homefile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker dp1;
    Button btn1;
    EditText ed1;
    String filename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("간단한 일기장");

        dp1 = findViewById(R.id.dp1);
        btn1 = findViewById(R.id.btn1);
        ed1 = findViewById(R.id.ed1);

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        dp1.init(year, mon, day, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
                filename = Integer.toString(year)+"_"+Integer.toString(monthOfYear)+"_"+Integer.toString(dayOfMonth)+".txt";
                String str = readDiary(filename);
                ed1.setText(str);
                btn1.setEnabled(true);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    FileOutputStream outFs = openFileOutput(filename, Context.MODE_PRIVATE);
                    String str = ed1.getText().toString();
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), filename+"이 저장됨", Toast.LENGTH_SHORT).show();
                } catch (IOException e){}
            }
        });


    }
    String readDiary(String fName) {
        String diaryStr = null;
        FileInputStream inFs;
        try {
            inFs = openFileInput(fName);
            byte[] txt = new byte[500];
            inFs.read(txt);
            inFs.close();
            diaryStr = (new String(txt)).trim();
            btn1.setText("수정하기");
        } catch (IOException e) {
            ed1.setHint("일기 없음");
            btn1.setText("새로 저장");
        }
        return diaryStr;
    }

}