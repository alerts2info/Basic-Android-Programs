package com.example.part_a1_textboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button reset = (Button)findViewById(R.id.btn_rest);
        Button Submit=(Button)findViewById(R.id.btn_submit);

        final EditText Fname=(EditText)findViewById(R.id.txt_fname);
        final EditText Lname=(EditText)findViewById(R.id.txt_lname);
        final EditText Email=(EditText)findViewById(R.id.txt_email);
        final EditText Phone=(EditText)findViewById(R.id.txt_mobile);
        final EditText Address=(EditText)findViewById(R.id.txt_address);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fname.setText("");
                Lname.setText("");
                Email.setText("");
                Phone.setText("");
                Address.setText("");
            }
        });

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,SecondPage.class);
                startActivity(in);
            }
        });
    }
}
