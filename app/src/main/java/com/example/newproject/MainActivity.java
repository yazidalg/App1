package com.example.newproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button Wazelow = findViewById(R.id.Wazelow);
        Wazelow.setOnClickListener(this);

        Button Wezantuy = findViewById(R.id.Wezantuy);
        Wezantuy.setOnClickListener(this);

        Button Waman = findViewById(R.id.Waman);
        Waman.setOnClickListener(this);

        Button wazek = findViewById(R.id.wazek);
        wazek.setOnClickListener(this);




    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {


            case R.id.Wazelow:
                Intent moveIntent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(moveIntent);
                break;

            case R.id.Wezantuy:
                Intent MoveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                MoveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Whats Up Boi");
                MoveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
                startActivity(MoveWithDataIntent);
                break;

            case R.id.wazek:
                MyBiodata biodata = new MyBiodata("yazidal", 14);
                Intent kePenerimaActivity = new Intent(MainActivity.this,PenerimaActivity.class);
                MyBiodata biodataYazid = new MyBiodata("yazidal",14);
                kePenerimaActivity.putExtra("biodata",biodataYazid);

                startActivity(kePenerimaActivity);
                break;


            case R.id.Waman:
                String phonenumber = "082251947241";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phonenumber));
                startActivity(dialPhoneIntent);
                break;













        }
    }
}
