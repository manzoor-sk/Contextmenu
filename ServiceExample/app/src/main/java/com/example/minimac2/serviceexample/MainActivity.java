package com.example.minimac2.serviceexample;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ThemedSpinnerAdapter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private TextView textView1;
    private ImageButton image_but;
    private Button button,button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textView1 = (TextView) findViewById(R.id.textView1);
    image_but = (ImageButton) findViewById(R.id.image_but);
    button = (Button) findViewById(R.id.button);
    button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View arg0) {

           Toast.makeText(getApplicationContext(),"Button is clicked", Toast.LENGTH_LONG).show();

       }

   });
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,Main2Activity.class);
             startActivity(intent);
         }
     });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }
}
