package com.example.minimac2.switchstate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =(Button) findViewById(R.id.button);
        button1 =(Button) findViewById(R.id.button1);

        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch(id) {
            case R.id.button:
                Toast.makeText(getBaseContext(), "Hiii", Toast.LENGTH_LONG).show();
                break;

            case R.id.button1:
                Toast.makeText(getBaseContext(), "Good", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
