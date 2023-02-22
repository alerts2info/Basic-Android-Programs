package com.example.part_b1_page_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__page);

        Button btn_previous=(Button)findViewById(R.id.btn_p2_previous);
        Button btn_next=(Button)findViewById(R.id.btn_p2_next);
        Button btn_last=(Button)findViewById(R.id.btn_p2_last);

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_previous=new Intent(Second_Page.this,MainActivity.class);
                startActivity(in_previous);
            }
        });

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_next=new Intent(Second_Page.this,Third_Page.class);
                startActivity(in_next);
            }
        });

        btn_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_last=new Intent(Second_Page.this,Fourth_Page.class);
                startActivity(in_last);
            }
        });
    }
}