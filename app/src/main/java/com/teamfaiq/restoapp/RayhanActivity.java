package com.teamfaiq.restoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class RayhanActivity extends AppCompatActivity {
    private int jmlNasgor = 0, jmlBBurger = 0, jmlCBurger = 0, jmlCKebab = 0, jmlIMilo = 0, jmlLTea = 0;
    private TextView tNasiGoreng, tBeefBurger, tCheeseBurger, tCheeseKebab, tIceMilo, tLemonTea;
    private CheckBox cNasiGoreng, cBeefBurger, cCheeseBurger, cCheeseKebab, cIceMilo, cLemonTea;
    protected static final String EXTRA_MESSAGE = "ini 1";
    private String makanan= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rayhan);

        tBeefBurger = (TextView) findViewById(R.id.teksJumlahBeefBurger);
        tCheeseBurger = (TextView) findViewById(R.id.teksJumlahCheeseBurger);
        tCheeseKebab = (TextView) findViewById(R.id.teksJumlahCheeseKebab);
        tNasiGoreng = (TextView) findViewById(R.id.teksJumlahNasigoreng);
        tIceMilo = (TextView) findViewById(R.id.teksJumlahMiloIce);
        tLemonTea = (TextView) findViewById(R.id.teksJumlahLemonTea);

        cBeefBurger = (CheckBox) findViewById(R.id.cbBeefBurger);
        cCheeseBurger = (CheckBox) findViewById(R.id.cbCheeseBurger);
        cCheeseKebab = (CheckBox) findViewById(R.id.cbCheeseKebab);
        cNasiGoreng = (CheckBox) findViewById(R.id.cbNasigoreng);
        cIceMilo = (CheckBox) findViewById(R.id.cbMiloIce);
        cLemonTea = (CheckBox) findViewById(R.id.cbLemonTea);
    }

    public void kurangJumlah(View view) {
        Toast pesan;
        if((Button) view == (Button) findViewById(R.id.minBeefBurger)){
            if(jmlBBurger > 0) {
                jmlBBurger--;
                tBeefBurger.setText(Integer.toString(jmlBBurger));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }
        } if((Button) view == (Button) findViewById(R.id.minCheeseBurger)){
            if(jmlCBurger > 0) {
                jmlCBurger--;
                tCheeseBurger.setText(Integer.toString(jmlCBurger));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.minCheeseKebab)){
            if(jmlCKebab > 0) {
                jmlCKebab--;
                tCheeseKebab.setText(Integer.toString(jmlCKebab));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.minLemonTea)){
            if(jmlLTea > 0) {
                jmlLTea--;
                tLemonTea.setText(Integer.toString(jmlLTea));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.minNasiGoreng)){
            if(jmlNasgor > 0) {
                jmlNasgor--;
                tNasiGoreng.setText(Integer.toString(jmlNasgor));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.minMiloIce)){
            if(jmlIMilo > 0) {
                jmlIMilo--;
                tIceMilo.setText(Integer.toString(jmlIMilo));
            }else {
                pesan = Toast.makeText(this, "Jumlah Minimum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        }
    }

    public void tambahJumlah(View view) {
        Toast pesan;
        if((Button) view == (Button) findViewById(R.id.plusBeefBurger)){
            if(jmlBBurger < 11) {
                jmlBBurger++;
                tBeefBurger.setText(Integer.toString(jmlBBurger));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }
        } else if((Button) view == (Button) findViewById(R.id.plusCheeseBurger)){
            if(jmlCBurger < 11) {
                jmlCBurger++;
                tCheeseBurger.setText(Integer.toString(jmlCBurger));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.plusCheeseKebab)){
            if(jmlCKebab < 11) {
                jmlCKebab++;
                tCheeseKebab.setText(Integer.toString(jmlCKebab));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.plusLemonTea)){
            if(jmlLTea < 11) {
                jmlLTea++;
                tLemonTea.setText(Integer.toString(jmlLTea));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.plusNasiGoreng)){
            if(jmlNasgor < 11) {
                jmlNasgor++;
                tNasiGoreng.setText(Integer.toString(jmlNasgor));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        } else if((Button) view == (Button) findViewById(R.id.plusMiloIce)){
            if(jmlIMilo < 11) {
                jmlIMilo++;
                tIceMilo.setText(Integer.toString(jmlIMilo));
            }else {
                pesan = Toast.makeText(this, "Jumlah Maximum !", Toast.LENGTH_SHORT);
                pesan.show();
            }

        }
    }



    public void kirimPesanan(View view) {
        Toast pesan;
        String makananNull = "";

        if (cNasiGoreng.isChecked() && jmlNasgor > 0) makanan+= "A"+Integer.toString(jmlNasgor)+"x";
        else if (cNasiGoreng.isChecked()) makananNull += "Nasi Goreng, ";
        if (cBeefBurger.isChecked() && jmlBBurger > 0) makanan+= "B"+Integer.toString(jmlBBurger)+"x";
        else if (cBeefBurger.isChecked()) makananNull += "Beef Burger, ";
        if (cCheeseBurger.isChecked() && jmlCBurger > 0) makanan+= "C"+Integer.toString(jmlCBurger)+"x";
        else if (cCheeseBurger.isChecked()) makananNull += "Cheese Burger, ";
        if (cCheeseKebab.isChecked() && jmlCKebab > 0) makanan+= "D"+Integer.toString(jmlCKebab)+"x";
        else if (cCheeseKebab.isChecked()) makananNull += "Cheese Kebab, ";
        if (cIceMilo.isChecked() && jmlIMilo > 0) makanan+= "E"+Integer.toString(jmlIMilo)+"x";
        else if (cIceMilo.isChecked()) makananNull += "Milo Ice, ";
        if (cLemonTea.isChecked() && jmlLTea > 0) makanan+= "F"+Integer.toString(jmlLTea)+"x";
        else if (cLemonTea.isChecked()) makananNull += "Lemon Tea, ";

        if (makananNull.equals("") && !makanan.isEmpty() || !makanan.equals("")) {
            String message = makanan;
            Intent intent = new Intent(this, FaiqActivity.class);
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        } else if (!makananNull.equals("")) {
            pesan = Toast.makeText(this, "Terdapat makanan dengan jumlah tidak sesuai: "+ makananNull.substring(0, makananNull.length()-2), Toast.LENGTH_SHORT);
            pesan.show();

        } else {
            pesan = Toast.makeText(this, "Tidak ada makanan yang dipesan.", Toast.LENGTH_SHORT);
            pesan.show();
        }


    }


}