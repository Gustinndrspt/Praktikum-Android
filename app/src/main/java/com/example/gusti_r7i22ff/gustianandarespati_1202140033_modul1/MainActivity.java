package com.example.gusti_r7i22ff.gustianandarespati_1202140033_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edText1, edText2;
    Button bt1;
    Button bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edText1 = (EditText) findViewById(R.id.editTextIsi);
        edText2 = (EditText) findViewById(R.id.editTextBil);
        bt1 = (Button) findViewById(R.id.button4);
        bt2 = (Button) findViewById(R.id.button5);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nama_makanan = edText1.getText().toString();
                final String porsi = edText2.getText().toString();
                int jumlah_integer = Integer.parseInt(edText2.getText().toString());
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("NAMA_RESTORAN","Eatbus");
                intent.putExtra("NAMA_MAKANAN", nama_makanan);
                intent.putExtra("PORSI", porsi);
                intent.putExtra("TOTAL_HARGA", jumlah_integer*50000);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String nama_makanan = edText1.getText().toString();
                final String porsi = edText2.getText().toString();
                int jumlah_integer = Integer.parseInt(edText2.getText().toString());
                Intent c = new Intent(getApplicationContext(), SecondActivity.class);
                c.putExtra("NAMA_RESTORAN", "Abnormal");
                c.putExtra("NAMA_MAKANAN", nama_makanan);
                c.putExtra("PORSI", porsi);
                c.putExtra("TOTAL_HARGA", jumlah_integer*30000);
                startActivity(c);
            }
        });

    }

}

