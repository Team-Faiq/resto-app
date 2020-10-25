package com.teamfaiq.restoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class RickyActivity extends AppCompatActivity {
    ListView lst;
    Button buttonpesan;
    String[] foodname={"Sop Buntut Sapi","Iga Sapi Bakar", "Nila Bakar Madu", "Ayam Geprek Krispy", "Nasi Goreng Special", "Mie Goreng Jawa", "Jus Buah Naga", "Jus Strowberry", "Jus Alpukat", "Es campur", "Boba Drink"};
    String[] desc={"Rp27.000", "Rp30.000", "Rp22.000", "Rp17.000", "Rp18.000", "Rp17.000", "Rp12.000", "Rp8.000", "Rp12.000", "Rp14.000", "Rp11.000"};
    Integer[] imgid={R.drawable.sopbuntut, R.drawable.igabakar, R.drawable.nilabakarmadu, R.drawable.ayamgeprek, R.drawable.nasigoreng, R.drawable.miegoreng,R.drawable.buahnaga, R.drawable.jusstrowberry, R.drawable.alpukat, R.drawable.escampur, R.drawable.boba};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ricky);
        getActionBar().hide();

        lst=(ListView) findViewById(R.id.listview);
        buttonpesan = (Button) findViewById(R.id.ButtonPesan);
        buttonpesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pesan(v);
            }
        });
        RickyCustom rickyCustom=new RickyCustom(this,foodname,desc,imgid);
        lst.setAdapter(rickyCustom);
    }

    public void pesan(View view) {
        Intent intent = new Intent(this, RayhanActivity.class);
        startActivity(intent);
    }
}