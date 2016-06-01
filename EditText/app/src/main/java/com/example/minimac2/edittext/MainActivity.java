package com.example.minimac2.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edit_text;
    TextView text;
    Button button;
    int i = 1;
    int total;
    double avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edit_text = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);


        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if(i<=5){
                    total = total + (Integer.parseInt((edit_text.getText().toString())));
                    i++;
                    edit_text.setText("");
                }else {
                    text.setText(total+"");

                    edit_text.setText("");
                }

            }
        });

    }



}


