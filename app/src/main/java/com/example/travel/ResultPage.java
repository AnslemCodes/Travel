package com.example.travel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class ResultPage extends AppCompatActivity {


    RecyclerView mRecyclerView;
    ResultAdapter mResultAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_page);


        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomsheet = new BottomSheetDialog();
                bottomsheet.show(getSupportFragmentManager(), "bottom sheet");


            }
        });


        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mResultAdapter = new ResultAdapter(this, getMyList());
        mRecyclerView.setAdapter(mResultAdapter);


    }

    private ArrayList<ResultData> getMyList() {

        ArrayList<ResultData> resultData = new ArrayList<>();

        ResultData m = new ResultData();
        m.setItemName("Kallada Transport");
        m.setItemFromTime("8.00");
        m.setItemFrom("Chennai");
        m.setItemPrice("$ 20");
        m.setItemTo("Banglore");
        resultData.add(m);


        m = new ResultData();
        m.setItemName("KPN Transport");
        m.setItemFromTime("9.00");
        m.setItemFrom("Coimbatore");
        m.setItemPrice("$ 18");
        m.setItemTo("Banglore");
        resultData.add(m);


        m = new ResultData();
        m.setItemName("SRM Transport");
        m.setItemFromTime("8.00");
        m.setItemFrom("Chennai");
        m.setItemPrice("$ 23");
        m.setItemTo("Karur");
        resultData.add(m);


        m = new ResultData();
        m.setItemName("SRM Transport");
        m.setItemFromTime("8.00");
        m.setItemFrom("Chennai");
        m.setItemPrice("$ 23");
        m.setItemTo("Karur");
        resultData.add(m);

        return resultData;
    }


}



