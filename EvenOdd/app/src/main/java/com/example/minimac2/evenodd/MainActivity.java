package com.example.minimac2.evenodd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


   EditText editText;
   Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);


//     OnClick is used click the button
//     Toast means information message

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = Integer.valueOf(editText.getText().toString());
                if (value % 2 == 0)
                    Toast.makeText(MainActivity.this, "EVEN NUMBER", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this, "ODD NUMBER", Toast.LENGTH_LONG).show();
            }

        });


    }

}
