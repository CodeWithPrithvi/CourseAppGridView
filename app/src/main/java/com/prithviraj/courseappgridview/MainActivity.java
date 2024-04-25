package com.prithviraj.courseappgridview;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView=findViewById(R.id.gridView);
        ArrayList<courseitems> list =new ArrayList<courseitems>();
        list.add(new courseitems("The Complete BlockChain Course",R.drawable.course1));
        list.add(new courseitems("The Complete DSA Course",R.drawable.course2));
        list.add(new courseitems("The Complete Python Course",R.drawable.couerse3));
        list.add(new courseitems("The Complete JAVA Course",R.drawable.course4));
        list.add(new courseitems("The Complete Android App Development Course",R.drawable.course5));
        list.add(new courseitems("The Complete Full Stack Web Dev Course",R.drawable.course6));

        customApdapter cs=new customApdapter(this,list);
        gridView.setAdapter(cs);

    }
}