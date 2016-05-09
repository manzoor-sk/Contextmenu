package com.example.minimac2.contextmenu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list_view;
    List<String> list=new ArrayList<String>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_view = (ListView) findViewById(R.id.list_view);
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Sapota");
        list.add("Grapes");
        list.add("pineapple");

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,list);
        list_view.setAdapter(adapter);
        registerForContextMenu(list_view);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);

    }

    @Override
   public boolean onContextItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        AdapterContextMenuInfo aInfo = (AdapterContextMenuInfo) item.getMenuInfo();
        list.remove(aInfo.position);
        adapter.notifyDataSetChanged();
        return true;
    }
    void sum(){}
}
