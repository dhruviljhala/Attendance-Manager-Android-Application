package com.example.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class os extends AppCompatActivity {

    EditText et2;
    TextView tv3;
    Button con;
    Button apply;
    TextView tv4;

    int aay;
    int val;
    String str;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static String editTextString = "";

    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bundle app = getIntent().getExtras();

        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        et2 = (EditText) findViewById(R.id.et2);
        con = (Button) findViewById(R.id.con);
        apply = (Button) findViewById(R.id.apply);

        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv3.setText(et2.getText().toString());

            }

        });

        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadData();
                saveData();
                try {
                    str = et2.getText().toString();
                    aay = Integer.parseInt(str);
                    val = (7500 - (100 * aay)) / 75;
                    tv4.setText("Attendance is: " + val);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        loadData();
        updateViews();

    }

    public void saveData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString(TEXT, tv3.getText().toString());


        editor.apply();


    }

    public void loadData() {
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        text = sharedPreferences.getString(TEXT, "");

    }

    public void updateViews() {
        tv3.setText(text);

    }

}