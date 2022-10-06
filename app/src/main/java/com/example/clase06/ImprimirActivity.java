package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ImprimirActivity extends AppCompatActivity {
    private TextView tvcliente, tvdni, tvser, tvcs, tvci, tvdesc, tvtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imprimir);
        tvcliente = findViewById(R.id.tvcliente);
        tvdni = findViewById(R.id.tvdni);
        tvser = findViewById(R.id.tvservicio);
        tvcs = findViewById(R.id.tvcostoservicio);
        tvci = findViewById(R.id.tvcostoinstalacion);
        tvdesc = findViewById(R.id.tvdescuento);
        tvtp = findViewById(R.id.tvtotalpagar);

        Bundle datos = this.getIntent().getExtras();
        tvcliente.setText("Cliente: "+datos.getString("Cliente"));
        tvdni.setText("DNI: "+datos.getString("DNI"));
        tvser.setText("Servicio: "+datos.getString("Servicio"));
        tvcs.setText("Costo Servicio: "+datos.getString("Costo Servicio"));
        tvci.setText("Costo Instalacion: "+datos.getString("Costo Instalacion"));
        tvdesc.setText("Descuento: "+datos.getString("Descuento"));
        tvtp.setText("Total Pagar: "+datos.getString("Total Pagar"));

    }
}