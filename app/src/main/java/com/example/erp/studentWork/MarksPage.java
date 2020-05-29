package com.example.erp.studentWork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;

import com.example.erp.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MarksPage extends AppCompatActivity {

    String student;
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String,List<String >> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks_page);

        listView =(ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter =new ExpandableListAdapter(this,listDataHeader,listHash);
        listView.setAdapter(listAdapter);

    }

    private void initData() {

        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Hello1");
        listDataHeader.add("Hello2");
        listDataHeader.add("Hello3");
        listDataHeader.add("Hello4");

        List<String> ayush = new ArrayList<>();
        ayush.add("This is the Expandable list");

        List<String> hello2 = new ArrayList<>();
        hello2.add("item is best thing");
        hello2.add("item1 is best thing");
        hello2.add("item2 is best thing");
        hello2.add("item3 is best thing");

        List<String> hello3 = new ArrayList<>();
        hello3.add("item is best thing");
        hello3.add("item1 is best thing");
        hello3.add("item2 is best thing");
        hello3.add("item3 is best thing");

        List<String> hello4 = new ArrayList<>();
        hello4.add("item is best thing");
        hello4.add("item1 is best thing");
        hello4.add("item2 is best thing");
        hello4.add("item3 is best thing");

        listHash.put(listDataHeader.get(0),ayush);
        listHash.put(listDataHeader.get(1),hello2);
        listHash.put(listDataHeader.get(2),hello3);
        listHash.put(listDataHeader.get(3),hello4);




    }
}
