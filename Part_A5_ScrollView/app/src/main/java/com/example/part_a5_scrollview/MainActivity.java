package com.example.part_a5_scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_horizontal=(Button)findViewById(R.id.button9);

        btn_horizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nxt_page=new Intent(MainActivity.this, Horizontal_Scroll.class);
                startActivity(nxt_page);
            }
        });
    }
}
