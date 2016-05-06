package com.example.minimac2.multiplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    TextView text, text1;
    EditText edit_view, edit1_view;
    Button button,button1,button2,button3;

    int num1,num2,sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = (TextView) findViewById(R.id.text);
        text1 = (TextView) findViewById(R.id.text1);
        edit_view = (EditText) findViewById(R.id.edit_view);
        edit1_view = (EditText) findViewById(R.id.edit1_view);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);



//        Integer value convert toString value
//        OnclickListener is used click the button
//       
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
              readData();
                sum = num1 + num2;
                text1.setText(Integer.toString(sum));
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                readData();
                sum = num1 - num2;
                text1.setText(Integer.toString(sum));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                readData();
                sum = num1 * num2;

                text1.setText(Integer.toString(sum));
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                readData();
                if(num2==0){
                    //Displaying Toast with cant divided by zero message

                    Toast.makeText(MainActivity.this,"cant divided by zero",Toast.LENGTH_LONG).show();
                    return;
                }
                sum = num1 / num2;
                text1.setText(Integer.toString(sum));
            }
        });

    }
    private void readData(){
        num1=Integer.parseInt(edit_view.getText().toString());
        num2=Integer.parseInt(edit1_view.getText().toString());
    }

}
