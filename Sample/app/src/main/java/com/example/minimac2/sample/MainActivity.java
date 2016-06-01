package com.example.minimac2.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edit_text;
    TextView text_view;
    Button button;
    int n=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text = (EditText) findViewById(R.id.edit_text);
        text_view = (TextView) findViewById(R.id.text_view);
        button =(Button) findViewById(R.id.button);

    }
    public void Result(View view)

    {
     int numberGuessed = Integer.parseInt(edit_text.getText().toString());
     if (numberGuessed == n) {
         text_view.setText("Correct");
     } else if (numberGuessed < n) {
         text_view.setText("Low value");
     } else  {
         text_view.setText("High value");
     }

 }
}
