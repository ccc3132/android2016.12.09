package com.example.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button5;
    Button button6;

    LinearLayout layout;
    LinearLayout layout2;
    Switch sswitch;
    Chronometer chronometer;
    ImageView imageView;
    EditText t1;
    EditText t2;
    EditText t3;
    TextView t4;
    TextView t5;
    TextView t6;
    RadioButton c1;
    RadioButton c2;
    RadioButton c3;
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
        imageView = (ImageView) findViewById(R.id.imageView);
        chronometer = (Chronometer) findViewById(R.id.chronometer2);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        t1 = (EditText) findViewById(R.id.editText);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);
        t4 = (TextView) findViewById(R.id.textView5);
        t5 = (TextView) findViewById(R.id.textView6);
        t6 =  (TextView) findViewById(R.id.textView7);
        c1 = (RadioButton) findViewById(R.id.radioButton);
        c2 = (RadioButton) findViewById(R.id.radioButton2);
        c3 = (RadioButton) findViewById(R.id.radioButton3);



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





        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                calc(1);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                si(1);
            }
        });

    }

    private void calc(int a){
        if(t1.getText().length() == 0 || t2.getText().length() == 0 || t3.getText().length() == 0){
            Toast.makeText(getApplicationContext(),"인원을 입력하세요",Toast.LENGTH_SHORT).show();
            return;
        }

        int sum = 0;
        int ha;
        int result = 0;
        int num1 = Integer.getInteger(t1.getText().toString());
        int num2 = Integer.getInteger(t2.getText().toString());
        int num3 = Integer.getInteger(t3.getText().toString());

        switch (a) {
            case 1:
            result = (num1 * 15000) + (num2 * 12000) * (num3 * 8000);
                sum = num1 + num2 + num3;
                break;
        }

        t4.setText("총 명수 :"+ sum);

        if(c1.isChecked()){
            imageView.setImageResource(R.drawable.noil);
            ha = result/5;
            t5.setText("할인금액:"+ ha);
            result = result - ha;
            t6.setText("결제금액:"+ result);

        }
        else if(c2.isChecked()){
            imageView.setImageResource(R.drawable.noli2);
            ha = result/10;
            t5.setText("할인금액"+ ha);
            result = result - ha;
            t6.setText("결제금액:"+ result);
        }
        else if (c3.isChecked()){
            imageView.setImageResource(R.drawable.noli3);
            ha = result/20;
            t5.setText(+ ha);
            result = result - ha;
            t6.setText("결제금액:"+ result);
        }
        else
        {
            t6.setText("계산결과"+ result);
        }
    }

    private void si(int a){

        switch (a){
            case 1:
                layout.setVisibility(View.GONE);
                layout2.setVisibility(View.VISIBLE);
        }
    }

}
