package com.example.part_a6_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView_cities=(ListView)findViewById(R.id.listview_cities);

        final String[] cities=getResources().getStringArray(R.array.array_cities);
        // ArrayAdapter is a bridge between data source and UI components
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1 ,cities);

        listView_cities.setAdapter(adapter);

        listView_cities.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Clicked "+cities[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}