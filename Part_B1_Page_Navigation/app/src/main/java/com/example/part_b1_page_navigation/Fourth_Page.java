package com.example.part_b1_page_navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fourth_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth__page);

        Button btn_previous=(Button)findViewById(R.id.btn_p4_previous);
        Button btn_home=(Button)findViewById(R.id.btn_p4_home);

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_previous=new Intent(Fourth_Page.this,Third_Page.class);
                startActivity(in_previous);
            }
        });
        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_home=new Intent(Fourth_Page.this,MainActivity.class);
                startActivity(in_home);
            }
        });
    }
}