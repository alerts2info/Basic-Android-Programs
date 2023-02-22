package com.example.checkbox_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double qty,price,unit_price;
    String temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String str_cb1_result="Price per unit Qty ";
        final String str_cb2_result="Price per unit Qty ";

        final EditText item1_qty=(EditText)findViewById(R.id.cb1qty);
        final EditText item1_price=(EditText)findViewById(R.id.cb1price);

        final EditText item2_qty=(EditText)findViewById(R.id.cb2qty);
        final EditText item2_price=(EditText)findViewById(R.id.cb2price);

        final CheckBox item1=(CheckBox)findViewById(R.id.checkBox1);
        final CheckBox item2=(CheckBox)findViewById(R.id.checkBox2);

        final TextView txt_cb1_result=(TextView)findViewById(R.id.txtcb1result);
        final TextView txt_cb2_result=(TextView)findViewById(R.id.txtcb2result);

        Button btn_compare=(Button)findViewById(R.id.btn_compare);


        btn_compare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(item1.isChecked()){
                    qty=0;
                    price=0;
                    unit_price=0;
                    temp=item1_qty.getText().toString();
                    qty=Double.parseDouble(temp);

                    temp=item1_price.getText().toString();
                    price=Double.parseDouble(temp);

                    unit_price=price/qty;

                    String str_final=str_cb1_result+Double.toString(unit_price);
                    txt_cb1_result.setText(str_final);
                }
                if(item2.isChecked()){
                    qty=0;
                    price=0;
                    unit_price=0;
                    temp=item2_qty.getText().toString();
                    qty=Double.parseDouble(temp);

                    temp=item2_price.getText().toString();
                    price=Double.parseDouble(temp);

                    unit_price=price/qty;

                    String str_final=str_cb2_result+Double.toString(unit_price);
                    txt_cb2_result.setText(str_final);
                }
                if(!item1.isChecked()){
                    txt_cb1_result.setText("");
                }
                if(!item2.isChecked()){
                    txt_cb2_result.setText("");
                }
            }
        });
    }
}
