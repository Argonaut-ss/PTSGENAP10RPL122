package com.example.ptsgenap10rpl122;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BahanAdapter adapter;
    private ArrayList<JenisBahan> bahanArrayList;
    ImageButton button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = (RecyclerView) findViewById(R.id.rvdata);
        getSupportActionBar().hide();

        button3 = (ImageButton)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(Back);
            }
        });


        addData();

        adapter = new BahanAdapter(bahanArrayList, new BahanAdapter.Callback() {
            @Override
            public void onClick(int position) {
                Toast.makeText(MainActivity2.this, "cek klik", Toast.LENGTH_SHORT).show();
            }
        });


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData(){
        bahanArrayList = new ArrayList<>();
        bahanArrayList.add(new JenisBahan("Baju","Recomendasi : 20"));
        bahanArrayList.add(new JenisBahan("Celana", "Recomendasi : 10"));



    }
}