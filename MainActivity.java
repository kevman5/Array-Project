package com.example.project_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double[] amts;
    String[] itemDesc;
    int currentIndex = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        amts = new Double[5];
        itemDesc = new String[5];
    }
    public void sum_amts()
    {
        TextView tv2;
        double salestax;


    }
    public void btn_Add_Click(View v)
    {
        TextView tv_1, tv2;
        EditText ed1, ed2;
        double total, itemAmt, salestax;
        String itemAmtString;

        tv_1 = (TextView) findViewById(R.id.tv_total);
        ed1 = (EditText) findViewById(R.id.ed_item);
        tv2 = (TextView) findViewById(R.id.tv_total2);

        itemAmtString = ed1.getText().toString();
        if (itemAmtString != "") {
            itemAmt = Double.parseDouble(ed1.getText().toString());

            currentIndex = currentIndex + 1;
            amts[currentIndex] = itemAmt;

            sum_amts();
            total = Double.parseDouble(tv_1.getText().toString());
            total = total + itemAmt;
            salestax = .010;
            tv_1.setText(String.valueOf(total));
            ed1.setText("");
            salestax = total * salestax;
            tv2.setText(String.valueOf(salestax));
        }


    }

    }
