package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {


    Button button2;
    Button button3;
    LinearLayout layout;
    LinearLayout layout2;
    Switch sswitch;
    Chronometer chronometer;
    EditText t1;
    EditText t2;
    EditText t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){

        layout = (LinearLayout) findViewById(R.id.layout);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        sswitch =  (Switch) findViewById(R.id.switch1);
        chronometer = (Chronometer) findViewById(R.id.chronometer2);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        t1 = (EditText) findViewById(R.id.editText);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);


        layout.setVisibility(View.GONE);
        layout2.setVisibility(View.GONE);


        sswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    layout.setVisibility(View.VISIBLE);
                    chronometer.start();
                }
                else{
                    layout.setVisibility(View.GONE);
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calc(1);
            }
        });


    }
    private void calc(int a){
        if(t1.getText().length() == 0 || t2.getText().length() == 0 || t3.getText().length())
    }
}
