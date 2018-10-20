package com.example.mashal.test3lv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    int bhira;
    EditText et1,et2;
    RadioButton rb1,rb2;
    Intent MoveActivity;
    String st1;
    Double num, D;
    Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        btn = (Button) findViewById(R.id.btn);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
    }

    public void ahmad (View view) {
        st1 = et1.getText().toString();
        num = Double.parseDouble(st1);
        st1 = et2.getText().toString();
        D = Double.parseDouble(st1);
        if(rb1.isChecked()){
            bhira=1;
        }
        if(rb2.isChecked()){
            bhira=2;
        }
        MoveActivity = new Intent(this, Main2Activity.class);
        MoveActivity.putExtra("bhira" , bhira);
        MoveActivity.putExtra("num", num);
        MoveActivity.putExtra("D", D);
        startActivity( MoveActivity);

    }
}