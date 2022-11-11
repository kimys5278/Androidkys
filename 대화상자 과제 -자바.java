package com.cookandroid.homework_8;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView img1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("동물 선택 대화상자");
        final String array []= new String[]{"강아지","고양이","말","토끼"};
        Button btn1 = findViewById(R.id.btn1);
        img1 = findViewById(R.id.img1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dig = new AlertDialog.Builder(MainActivity.this);
                dig.setTitle("좋아하는 동물은?");
                dig.setIcon(R.mipmap.ic_launcher_round);
                dig.setItems(array, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        switch (which){
                            case 0:
                                img1.setImageResource(R.drawable.dog);
                                break;
                            case 1:
                                img1.setImageResource(R.drawable.cat);
                               break;
                            case 2:
                                img1.setImageResource(R.drawable.horse);
                                break;
                            case 3:
                                img1.setImageResource(R.drawable.rabbit);
                                break;

                        }

                        }
                });
                dig.setNegativeButton("닫기",null);
                dig.show();

            }

        });


    }
}