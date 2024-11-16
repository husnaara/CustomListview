package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdaptr extends BaseAdapter {
    Context context;
    String[] listVegetable;
    int[] listImages;
    LayoutInflater inflater;
    public CustomBaseAdaptr(Context ctx, String[] vegetableList, int[] images) {
        this.context = ctx;
        this.listVegetable = vegetableList;
        this.listImages = images;
        this.inflater = LayoutInflater.from(ctx);
    }
    @Override
    public int getCount() {
        return listVegetable.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      convertView=inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView txtView=(TextView) convertView.findViewById(R.id.textView);
        ImageView vegetableImg=(ImageView) convertView.findViewById(R.id.imageIcon);
        txtView.setText(listVegetable[position]);
        vegetableImg.setImageResource(listImages[position]);
        return convertView;
    }
}
