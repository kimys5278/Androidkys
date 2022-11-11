package com.cookandroid.androidpro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.security.acl.Group;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    ImageView img;
    RelativeLayout base;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.Edit1);
        img = (ImageView) findViewById(R.id.imgView);
        base = (RelativeLayout) findViewById(R.id.base);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, "그림회전");

        SubMenu sub = menu.addSubMenu("그림선택");
        sub.add(0, 2, 0, "제주1");
        sub.add(0, 3, 0, "제주2");
        sub.add(0, 4, 0, "제주3");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                img.setRotation(Integer.parseInt(edit1.getText().toString()));
                break;
            case 2:
                item.setChecked(true);
                img.setImageResource(R.drawable.horse);
                img.setVisibility(View.VISIBLE);
                break;
            case 3:
                item.setChecked(true);
                img.setImageResource(R.drawable.dog);
                img.setVisibility(View.VISIBLE);
                break;

            case 4:
                item.setChecked(true);
                img.setImageResource(R.drawable.rabbit);
                img.setVisibility(View.VISIBLE);
                break;

        }
        return true;
    }
}
