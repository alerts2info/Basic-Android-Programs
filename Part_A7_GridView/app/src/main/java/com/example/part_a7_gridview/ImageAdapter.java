package com.example.part_a7_gridview;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return thumbImages.length;
    }
    public Object getItem(int position) {
        return null;
    }
    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        //imageView.setPadding(8, 8, 8, 8);

        imageView.setImageResource(thumbImages[position]);//Working
        return imageView;
    }
    //Working
    public Integer[] thumbImages = {
            R.drawable.emoji_a, R.drawable.emoji_b,
            R.drawable.emoji_c, R.drawable.emoji_d,
            R.drawable.emoji_e, R.drawable.emoji_f,
            R.drawable.emoji_g, R.drawable.emoji_h,
            R.drawable.emoji_i, R.drawable.emoji_j,
    };
}
