package com.example.ptsgenap10rpl122;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailPage extends AppCompatActivity {
    Bundle bundle;
    String name;
    String recomend;
    TextView textnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        textnama = (TextView)findViewById(R.id.textnama);
        bundle = getIntent().getExtras();
        if (bundle != null){
            name = bundle.getString("nama");
            recomend = bundle.getString("recomend");

        }
        textnama.setText("nama : "+name);
    }
}