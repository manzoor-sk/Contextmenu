package com.example.minimac2.myexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccessActivity extends AppCompatActivity implements View.OnClickListener{
    Button ok_btn, cancel_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        ok_btn = (Button) findViewById(R.id.Ok_btn);
        cancel_btn = (Button) findViewById(R.id.Cancel_btn);

        ok_btn.setOnClickListener(this);
        cancel_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        this.finish();
    }
}
