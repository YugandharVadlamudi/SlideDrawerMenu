package com.example.kiran.slidedrawermenu;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Kiran on 21-12-2015.
 */
public class fb_fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View roo_element=inflater.inflate(R.layout.fragment_fb,container,false);
        return roo_element;
    }
}
