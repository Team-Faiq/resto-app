package com.teamfaiq.restoapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class RickyCustom extends ArrayAdapter<String>{
    private  String[] foodname;
    private  String[] desc;
    private  Integer[] imgid;
    private Activity context;

    public RickyCustom(Activity context, String[] foodname, String[] desc, Integer[] imgid) {
        super(context, R.layout.listview_ricky, foodname);

        this.context = context;
        this.foodname = foodname;
        this.desc = desc;
        this.imgid = imgid;
}

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View r=convertView;
        ViewHolder viewHolder = null;
        if(r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.listview_ricky , null,true);
            viewHolder=new ViewHolder(r);
            r.setTag(viewHolder);
        }
        else {
            viewHolder=(ViewHolder) r.getTag();
        }
        viewHolder.ivw.setImageResource(imgid[position]);
        viewHolder.tvw1.setText(foodname[position]);
        viewHolder.tvw2.setText(desc[position]);
        return r;

    }

    class ViewHolder {
        TextView tvw1;
        TextView tvw2;
        ImageView ivw;

        ViewHolder(View v) {

            tvw1 = (TextView) v.findViewById(R.id.tvfoodname);
            tvw2 = (TextView) v.findViewById(R.id.tvdescription);
            ivw = (ImageView) v.findViewById(R.id.imageView);
        }
    }

}