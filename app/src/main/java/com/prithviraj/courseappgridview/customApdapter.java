package com.prithviraj.courseappgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class customApdapter extends ArrayAdapter<courseitems> {
    public customApdapter(@NonNull Context context, ArrayList<courseitems> courseitemsArrayList) {
        super(context,0, courseitemsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listitems=convertView;
        if (listitems == null)
        {
            listitems= LayoutInflater.from(getContext()).inflate(R.layout.grid_item,parent,false);
        }
        courseitems cm=getItem(position);
        TextView a= listitems.findViewById(R.id.CourseTxt);
        ImageView b= listitems.findViewById(R.id.courseImg);
        a.setText(cm.getCourseName());
        b.setImageResource((cm.getCourseImg()));
        return listitems;
    }
}
