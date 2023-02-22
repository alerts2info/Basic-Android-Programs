package com.example.part_b1_page_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Third_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__page);

        Button btn_home=(Button)findViewById(R.id.btn_p3_home);
        Button btn_previous=(Button)findViewById(R.id.btn_p3_previous);
        Button btn_next=(Button)findViewById(R.id.btn_p3_next);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_home=new Intent(Third_Page.this,MainActivity.class);
                startActivity(in_home);
            }
        });
        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_previous=new Intent(Third_Page.this,Second_Page.class);
                startActivity(in_previous);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_next=new Intent(Third_Page.this,Fourth_Page.class);
                startActivity(in_next);
            }
        });
    }
}