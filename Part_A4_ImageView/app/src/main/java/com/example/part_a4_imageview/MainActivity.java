package com.example.part_a4_imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView Img_center=(ImageView)findViewById(R.id.imageView1);
        ImageView Img_center_inside=(ImageView)findViewById(R.id.imageView2);
        ImageView Img_fit_center=(ImageView)findViewById(R.id.imageView3);
        ImageView Img_fit_end=(ImageView)findViewById(R.id.imageView4);
        ImageView Img_fit_start=(ImageView)findViewById(R.id.imageView5);

        Img_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scale Type Center", Toast.LENGTH_SHORT).show();
            }
        });

        Img_center_inside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scale Type Center Inside", Toast.LENGTH_LONG).show();
            }
        });

        Img_fit_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scale Type Fit Center", Toast.LENGTH_LONG).show();
            }
        });

        Img_fit_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scale Type Fit End", Toast.LENGTH_LONG).show();
            }
        });

        Img_fit_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Scale Type Fit Start", Toast.LENGTH_LONG).show();
            }
        });

    }
}
