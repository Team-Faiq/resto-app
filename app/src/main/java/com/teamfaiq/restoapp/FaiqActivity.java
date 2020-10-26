package com.teamfaiq.restoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FaiqActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private ArrayList<String> data = new ArrayList<String>();
    private ArrayList<Integer> data1 = new ArrayList<Integer>();
    private ArrayList<String> data2 = new ArrayList<String>();
    private ArrayList<String> data3 = new ArrayList<String>();
    private TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faiq);


        Intent intent = getIntent();
        String message = intent.getStringExtra(RayhanActivity.EXTRA_MESSAGE);
        TextView teksHargaTotall = findViewById(R.id.teksHargaTotal);

        String temp = "";
        int total=0;
        int q = 0;

        for(int i=0;i<message.length();i++){
            char c = message.charAt(i);
            int angka = i+1;
            if(c=='x'){
                continue;
            }else if(c=='A'){
                data.add("Iga Sapi Bakar");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("30.000");
                q = q*30;
                total += q;
                data3.add("Rp "+q+".000");
            }else if(c=='B'){
                data.add("Nila Bakar Madu");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("22.000");
                q = q*22;
                total += q;
                data3.add("Rp "+q+".000");
            }else if(c=='C'){
                data.add("Nasi Goreng");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("18.000");
                q = q*18;
                total += q;
                data3.add("Rp "+q+".000");
            }else if(c=='D'){
                data.add("Mie Goreng Jawa");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("17.000");
                q = q*17;
                total += q;
                data3.add("Rp "+q+".000");
            }else if(c=='E'){
                data.add("Jus Alpukat");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("12.000");
                q = q*12;
                total += q;
                data3.add("Rp "+q+".000");
            }else if(c=='F'){
                data.add("Boba Drink");
                q=Character.getNumericValue(message.charAt(angka));
                data1.add(q);
                data2.add("11.000");
                q = q*11;
                total += q;
                data3.add("Rp "+q+".000");
            }
        }


        table = (TableLayout)findViewById(R.id.myTableLayout);

        for(int i=0;i<data.size();i++) {
            TableRow row=new TableRow(this);
            String phone = data.get(i);
            int amount = data1.get(i);
            String tes = data2.get(i);
            String tes2 = data3.get(i);

            TextView tv1=new TextView(this);
            tv1.setText(phone);
            TextView tv2=new TextView(this);
            tv2.setText(Integer.toString(amount));
            TextView tv3=new TextView(this);
            tv3.setText(tes);
            TextView tv4=new TextView(this);
            tv4.setText(tes2);

            teksHargaTotall.setText("Total Harga : Rp "+total+".000");

            tv1.setGravity(Gravity.CENTER_HORIZONTAL);
            tv1.setTextSize(17);
            tv2.setGravity(Gravity.CENTER_HORIZONTAL);
            tv2.setTextSize(17);
            tv3.setGravity(Gravity.CENTER_HORIZONTAL);
            tv3.setTextSize(17);
            tv4.setGravity(Gravity.CENTER_HORIZONTAL);
            tv4.setTextSize(17);

            row.addView(tv1);
            row.addView(tv2);
            row.addView(tv3);
            row.addView(tv4);

            table.addView(row);

            TableLayout.LayoutParams tableRowParams=
                    new TableLayout.LayoutParams
                            (TableLayout.LayoutParams.FILL_PARENT,TableLayout.LayoutParams.WRAP_CONTENT);

            int leftMargin=10;
            int topMargin=20;
            int rightMargin=10;
            int bottomMargin=20;

            tableRowParams.setMargins(leftMargin, topMargin, rightMargin, bottomMargin);
            row.setLayoutParams(tableRowParams);
        }

    }


    public void kirimBayar(View view) {
        Toast pesan;
        pesan = Toast.makeText(this, "Pembayaran Berhasil.", Toast.LENGTH_SHORT);
        pesan.show();
        Intent intent = new Intent(this,DilaActivityHalamanUtama.class);
        startActivity(intent);
    }
}
