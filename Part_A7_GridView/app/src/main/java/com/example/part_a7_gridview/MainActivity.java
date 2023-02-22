package com.example.part_a7_gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] emoji_desc=getResources().getStringArray(R.array.emoji_desc);
        GridView gv=(GridView)findViewById(R.id.GridViewDemo);
        gv.setAdapter(new ImageAdapter(this));

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clicked on emoji: " + emoji_desc[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}