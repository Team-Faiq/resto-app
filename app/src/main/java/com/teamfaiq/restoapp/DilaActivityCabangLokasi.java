package com.teamfaiq.restoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class DilaActivityCabangLokasi extends AppCompatActivity {
    private Button bt_yogyakarta,bt_surabaya,bt_jakarta,bt_bogor,bt_semarang,bt_malang,bt_solo,bt_purwokerto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dila_cabang_lokasi);
    }
    public void alamat_yogyakarta(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Jl. Jend. Sudirman No.59, Terban, Kec. Gondokusuman, Kota Yogyakarta, Daerah Istimewa Yogyakarta 55233");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }

    }
    public void alamat_jakarta(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Season City Mall Lt. GF2, Jl. Jembatan Besi Raya No.33, RW.1, Jemb. Besi, Kec. Tambora, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11320");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//       }else {
//        Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_bogor(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Bogor Indah Plaza Ruko A3, Jl. Sholeh Iskandar, RT.04/RW.09, Kedungbadak, Kec. Tanah Sereal, Jawa Barat 16164");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_surabaya(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Jl. Ahmad Yani No.76 - 86, Ketintang, Kec. Gayungan, Kota SBY, Jawa Timur 60231");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_semarang(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Jl. Pemuda No.53 A, Pandansari, Kec. Semarang Tengah, Kota Semarang, Jawa Tengah 50156");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_malang(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Jl. Kawi Atas No.38, Gading Kasri, Kec. Klojen, Kota Malang, Jawa Timur 65125");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_solo(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Solo Square Lt. GF Unit 10, Jalan Slamet Riyadi No. 451-455, Laweyan, Pajang, Kec. Laweyan, Kota Surakarta, Jawa Tengah 57131");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);
//        if (intent.resolveActivity(getPackageManager()) !=null){
//
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }
    public void alamat_purwokerto(View view) {
        Uri urll = Uri.parse("geo:0,0?q="+"Jl. Prof Dr Bunyamin, Sumampir Wetan, Pabuaran, Kec. Purwokerto Utara, Kabupaten Banyumas, Jawa Tengah 53125");
        Intent intent = new Intent(Intent.ACTION_VIEW, urll);
        startActivity(intent);

//        if (intent.resolveActivity(getPackageManager()) !=null){
//        }else {
//            Log.d("ERROR","Lokasi Tidak Ditemukan");
//        }
    }

}