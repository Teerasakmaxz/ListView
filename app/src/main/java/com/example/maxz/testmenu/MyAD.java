package com.example.maxz.testmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by maxz on 9/8/2016 AD.
 */
public class MyAD extends BaseAdapter {

    //ประกาศตัวใน class MyAD
    private Context ojdContext;
    private String[] dataStrings;
    private int[] iconInts;


    public MyAD(Context ojdContext, String[] dataStrings, int[] iconInts) {
        this.ojdContext = ojdContext;
        this.dataStrings = dataStrings;
        this.iconInts = iconInts;

    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) ojdContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View ojdView = layoutInflater.inflate(R.layout.activity_detail, viewGroup, false);

        TextView dataTextView = (TextView) ojdView.findViewById(R.id.textView);
        dataTextView.setText(dataStrings[i]);

        ImageView imageView = (ImageView) ojdView.findViewById(R.id.imageView);
        imageView.setImageResource(iconInts[i]);


        return ojdView;
    }
}
