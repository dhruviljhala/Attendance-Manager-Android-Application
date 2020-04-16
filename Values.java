package com.example.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class Values extends AppCompatActivity {

    String value,value1,value2,value3,value4;
    Button con;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values);

        NumberPicker np = (NumberPicker) findViewById(R.id.np);
        NumberPicker np1 = (NumberPicker) findViewById(R.id.np1);
        NumberPicker np2 = (NumberPicker)findViewById(R.id.np2);
        NumberPicker np3 = (NumberPicker)findViewById(R.id.np3);
        NumberPicker np4 = (NumberPicker)findViewById(R.id.np4);
        con = findViewById(R.id.con);




        np.setMinValue(0);
        np.setMaxValue(75);
        np.setWrapSelectorWheel(true);

        np.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                float val;

                val = (7500 - (100 * newVal)) / 75;

                value = String.valueOf(val);

            }
        });






        np1.setMinValue(0);
        np1.setMaxValue(75);
        np1.setWrapSelectorWheel(true);
        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                float val;
                final float eg1 = 100;

                val = (7500 - (100 * newVal)) / 75;

                //tv1[0].setText("Attendance is:" + val);
                value1 = String.valueOf(val);
                //eg = String.valueOf(eg1);
            }
        });






        np2.setMinValue(0);
        np2.setMaxValue(75);
        np2.setWrapSelectorWheel(true);

        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                float val;
                //final float eg1 = 100;

                val = (7500 - (100 * newVal)) / 75;

                //tv1[0].setText("Attendance is:" + val);
                value2 = String.valueOf(val);
                //eg = String.valueOf(eg1);
            }
        });





        np3.setMinValue(0);
        np3.setMaxValue(75);
        np3.setWrapSelectorWheel(true);

        np3.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                float val;

                val = (7500 - (100 * newVal)) / 75;

                value3 = String.valueOf(val);

            }
        });





        np4.setMinValue(0);
        np4.setMaxValue(75);
        np4.setWrapSelectorWheel(true);

        np4.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {

                float val;

                val = (7500 - (100 * newVal)) / 75;

                value4 = String.valueOf(val);

            }
        });





        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), test.class);
                intent.putExtra("val1", value1);
                intent.putExtra("val2",value2);
                intent.putExtra("val3",value);
                intent.putExtra("val4",value3);
                intent.putExtra("val5",value4);
                //intent.putExtra("eg1", eg);
                startActivity(intent);
            }
        });
    }
}
