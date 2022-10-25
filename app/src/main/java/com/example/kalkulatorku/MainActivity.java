package com.example.kalkulatorku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNilaiA, edtNilaiB;
    Button btnTambah, btnKurang, btnKali, btnBagi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNilaiA = (EditText) findViewById(R.id.editNilaiA);
        edtNilaiB = (EditText) findViewById(R.id.editNilaiB);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnTambah = (Button) findViewById(R.id.btnTambah);
        btnKurang = (Button) findViewById(R.id.btnKurang);
        btnKali = (Button) findViewById(R.id.btnKali);
        btnBagi = (Button) findViewById(R.id.btnBagi);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA + nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA - nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA * nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nilaiA = Integer.parseInt(edtNilaiA.getText().toString());
                int nilaiB = Integer.parseInt(edtNilaiB.getText().toString());

                int hasil = nilaiA / nilaiB;
                txtHasil.setText(String.valueOf(hasil));
            }
        });
    }
}