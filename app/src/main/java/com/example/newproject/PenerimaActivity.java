package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PenerimaActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penerima);
        textView = findViewById(R.id.HIya);

        MyBiodata biodata = getIntent().getParcelableExtra("biodata");
        textView.setText("nama saya"+ biodata.getNama() + "umur saya"+ biodata.getUmur());




    }
}
