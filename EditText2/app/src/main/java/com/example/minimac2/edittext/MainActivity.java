package com.example.minimac2.edittext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edit_text;
    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_text = (EditText) findViewById(R.id.edit_text);
        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(edit_text.getText().toString()+activity(Integer.parseInt(edit_text.getText().toString())));

            }
        });


}


    public static String activity(int num) {
        if (num == 100) {
            return "th";
        }
        int lastDigit = num % 10;
        switch (lastDigit) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";

        }
    }

}

