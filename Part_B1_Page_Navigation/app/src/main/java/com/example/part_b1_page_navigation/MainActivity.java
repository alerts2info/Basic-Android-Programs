package com.example.part_b1_page_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_nxt=(Button)findViewById(R.id.btn_p1_next);
        Button btn_last=(Button)findViewById(R.id.btn_p1_last);

        btn_nxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_nxt=new Intent(MainActivity.this, Second_Page.class);
                startActivity(in_nxt);
            }
        });

        btn_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_last=new Intent(MainActivity.this,Fourth_Page.class);
                startActivity(in_last);
            }
        });
    }
}