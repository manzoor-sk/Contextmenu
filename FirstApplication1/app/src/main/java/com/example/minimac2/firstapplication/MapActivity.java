package com.example.minimac2.firstapplication;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MapActivity extends AppCompatActivity {

    Button button1,button2;
    ImageButton button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapActivity.this, FindEvents.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        button3 =(ImageButton)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {


            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(), "No Events match your search ,please try again" , Toast.LENGTH_SHORT ).show();
            }
        });

  }
  }