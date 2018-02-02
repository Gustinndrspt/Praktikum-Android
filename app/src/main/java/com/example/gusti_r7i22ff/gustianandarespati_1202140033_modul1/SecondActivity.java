package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by gusti_r7i22ff on 02/02/2018.
 */

public class SecondActivity extends AppCompatActivity {
    TextView namaMakanan, porsi, namaRestoran, totalHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        namaMakanan = (TextView) findViewById(R.id.nama_makanan);
        porsi = (TextView) findViewById(R.id.porsi);
        totalHarga = (TextView) findViewById(R.id.harga);
        namaRestoran = (TextView) findViewById(R.id.nama_restoran);

        Intent c = getIntent();
        String restoran = c.getStringExtra("NAMA_RESTORAN");
        String makanan = c.getStringExtra("NAMA_MAKANAN");
        String porsiString = c.getStringExtra("PORSI");
        int q = c.getIntExtra("TOTAL_HARGA",0);
        String totalHargaString = String.valueOf(q);

        namaRestoran.setText(restoran);
        namaMakanan.setText(makanan);
        porsi.setText(porsiString);
        totalHarga.setText(totalHargaString);

    }
}
