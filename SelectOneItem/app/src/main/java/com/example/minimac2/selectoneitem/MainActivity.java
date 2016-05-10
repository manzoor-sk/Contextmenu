package com.example.minimac2.selectoneitem;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list_item;
    ArrayList<String> list =new ArrayList<String>();
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_item =(ListView) findViewById(R.id.list_item);
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        adapter = new ArrayAdapter<String>(this,R.layout.list_item,list);

       list_item.setAdapter(adapter);
        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adpterView, View view, int position, long id) {

                for (int i = 0; i < list_item.getChildCount(); i++) {
                    if (position == i) {
                        list_item.getChildAt(i).setBackgroundColor(Color.GREEN);
                    }
                    else {
                        list_item.getChildAt(i).setBackgroundColor(Color.WHITE);
                    }
                }
            }
        });



                    }
                }

