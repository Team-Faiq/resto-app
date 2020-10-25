package com.teamfaiq.restoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DilaActivityHalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dila_halaman_utama);
        getActionBar().hide();
    }
    public void button_lokasi(View view) {
        Intent intent = new Intent(this, DilaActivityCabangLokasi.class);
        startActivity(intent);
    }

    public void button_website(View view) {
        Uri urll = Uri.parse("https://kfcku.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) !=null){

        }else {
            Log.d("ERROR","Lokasi Tidak Ditemukan");
        }
    }

    public void button_medsos(View view) {
        Uri urll = Uri.parse("https://www.instagram.com/kfcindonesia/");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
        if (intent.resolveActivity(getPackageManager()) !=null){

        }else {
            Log.d("ERROR","Lokasi Tidak Ditemukan");
        }

    }

    public void button_menu(View view) {
        Intent intent = new Intent(this,RickyActivity.class);
        startActivity(intent);
    }
}