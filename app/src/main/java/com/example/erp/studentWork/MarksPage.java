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

        listDataHeader.add("Internal 1");
        listDataHeader.add("Internal 2");
        listDataHeader.add("Internal 3");
        listDataHeader.add("Event 1");
        listDataHeader.add("Event 2");

        List<String> first = new ArrayList<>();
        first.add("Computer Architecture 27");
        first.add("Agile 29");
        first.add("Web Technology 30");


        List<String> second = new ArrayList<>();
        second.add("Computer Architecture 24");
        second.add("Agile 23");
        second.add("Web Technology 26");


        List<String> hello3 = new ArrayList<>();
        hello3.add("Computer Architecture 29");
        hello3.add("Agile 21");
        hello3.add("Web Technology 28");


        List<String> hello4 = new ArrayList<>();
        hello4.add("Computer Architecture 29");
        hello4.add("Agile 27");
        hello4.add("Web Technology 30");

        List<String> hello5 = new ArrayList<>();
        hello5.add("Computer Architecture 26");
        hello5.add("Agile 27");
        hello5.add("Web Technology 28");


        listHash.put(listDataHeader.get(0),first);
        listHash.put(listDataHeader.get(1),second);
        listHash.put(listDataHeader.get(2),hello3);
        listHash.put(listDataHeader.get(3),hello4);
        listHash.put(listDataHeader.get(4),hello5);




    }
}
