package com.example.shiboo.fajri_1202140198_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edtextmenu, edtextjumlah;
    Button bteatbus;
    Button btabnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtextmenu = (EditText) findViewById(R.id.edtextmenu);
        edtextjumlah = (EditText) findViewById(R.id.edtextjumlah);
        bteatbus =  (Button) findViewById(R.id.btneatbus);
        btabnormal =  (Button) findViewById(R.id.btnapnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String idnasi = edtextmenu.getText().toString();
                final String jumlah = edtextjumlah.getText().toString();
                int jumlah_integer = Integer.parseInt(edtextjumlah.getText().toString());
                Intent intent = new Intent(getApplicationContext(), Activityke2.class);
                intent.putExtra("nama_restoran", "Eatbus");
                intent.putExtra("nama_makanan", idnasi);
                intent.putExtra("porsi", jumlah);
                intent.putExtra("total_harga", jumlah_integer*50000);
                startActivity(intent);

            }

        };

        btabnormal.setOnClickListener(View) {

            final String idnasi1 = edtextmenu.getText().toString();
            final String jumlahh = edtextjumlah.getText().toString();
            int jumlah_integer = Integer.parseInt(edtextjumlah.getText(),toString());
            Intent a = new Intent(getApplicationContext(), Activityke2.class);
            a.putExtra("nama_restoran", "Abnormal");
            a.putExtra("nama_makanan", idnasi1);
            a.putExtra("porsi", jumlahh);
            a.putExtra("total_harga", jumlah_integer*30000);
            startActivity(a);
        }
    } ;
}
