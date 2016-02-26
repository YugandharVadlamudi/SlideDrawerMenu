package com.example.kiran.slidedrawermenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kiran on 21-12-2015.
 */
public class CustomAdapter extends BaseAdapter {
    Context context;
    List<RowItem> list;
    LayoutInflater layoutInflater;

    public CustomAdapter(List<RowItem> list, Context context) {
        this.list = list;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder;
        if(convertView==null)
        {
            holder = new Holder(convertView);
            convertView=layoutInflater.inflate(R.layout.list_ite,null);
            convertView.setTag(holder);
        }
        else
        {
         holder=(Holder)convertView.getTag();
        }
        RowItem rowItem=list.get(position);
        holder.im.setImageResource(rowItem.getIcon());
        holder.tv.setText(rowItem.getTitle());
        return convertView;
    }
    class Holder
    {
        TextView tv;
        ImageView im;

        public Holder(View view) {
            tv=(TextView)view.findViewById(R.id.title);
            im=(ImageView)view.findViewById(R.id.icon);
        }
    }
}
