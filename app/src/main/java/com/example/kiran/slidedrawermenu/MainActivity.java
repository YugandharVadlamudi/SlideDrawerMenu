package com.example.kiran.slidedrawermenu;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
String[] menuTitles;
    TypedArray menuIcons;
    List<RowItem> list;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuTitles=getResources().getStringArray(R.array.titles);
        menuIcons=getResources().obtainTypedArray(R.array.icons);
        for(int i=0;i<menuTitles.length;i++)
        {
            RowItem r=new RowItem(menuIcons.getResourceId(i,0),menuTitles[i]);
            list.add(r);
        }
        lv=(ListView)findViewById(R.id.list_item);
        CustomAdapter c=new CustomAdapter(list,getApplicationContext());
        lv.setAdapter(c);
    }
}
