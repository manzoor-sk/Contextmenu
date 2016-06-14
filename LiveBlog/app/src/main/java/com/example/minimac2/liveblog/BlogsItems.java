package com.example.minimac2.liveblog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class BlogsItems extends AppCompatActivity {

    private RecyclerView recyclerView;
    private String[] blogs = {"game 5,game 4, game 3, game 2, game 1"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogs_items);


        recyclerView = (RecyclerView) findViewById(R.id.blogs_rv);

        BlogsAdapter blogsAdapter = new BlogsAdapter(this, blogs);
       RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(blogsAdapter);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//        layoutManager.scrollToPosition(0);
//        recyclerView.setLayoutManager(layoutManager);


    }
}
