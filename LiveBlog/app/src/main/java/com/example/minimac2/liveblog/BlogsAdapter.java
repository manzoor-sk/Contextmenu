package com.example.minimac2.liveblog;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class BlogsAdapter extends RecyclerView.Adapter<BlogsAdapter.MyViewHolder> {
    private Context mcontext;
    private String[] blogs;

    public BlogsAdapter(Context context, String[] blogs) {
        this.mcontext = context;
        this.blogs = blogs;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_blog_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(blogs[position]);
    }


    @Override
    public int getItemCount() {
        return blogs.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.blog_name);
        }
    }
}
