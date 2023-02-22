package com.example.part_b2_layouts_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    String[] arr_layouts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        arr_layouts=getResources().getStringArray(R.array.array_layouts);

        //Creating the ArrayAdapter instance having the layout list
        ArrayAdapter aa = new
                ArrayAdapter(this,android.R.layout.simple_spinner_item,arr_layouts);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String s=((TextView)view).getText().toString();
        if(s.equals("Linear Layout Demo"))
            startActivity(new Intent(view.getContext(), Linear_Layout_Demo.class));
        if(s.equals("Table Layout"))
            startActivity(new Intent(view.getContext(), Table_Layout.class));
        if(s.equals("Frame Layout"))
            startActivity(new Intent(view.getContext(), Frame_Layout_Demo.class));
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}