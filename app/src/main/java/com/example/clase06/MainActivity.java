package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtcliente, txtdni;
    private RadioButton rbtDuo, rbtTrio;
    private Button btncalular, btnimprimir;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtcliente = findViewById(R.id.edtcliente);
        txtdni = findViewById(R.id.edtdni);

        rbtDuo = findViewById(R.id.rbtnduo);
        rbtTrio = findViewById(R.id.rbtntrio);

        radioGroup = findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                if(rbtDuo.getId()==radioButton.getId()){
                    Toast.makeText(getApplication(),""+radioButton.getText().toString(),Toast.LENGTH_LONG).show();
                }else if(rbtTrio.getId()==radioButton.getId()){

                }

            }
        });
        btncalular = findViewById(R.id.btncalcular);
        btnimprimir = findViewById(R.id.btnimprimir);
        btncalular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnimprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(), ImprimirActivity.class);
                intent.putExtra("Cliente",txtcliente.getText().toString());
                startActivity(intent);

            }
        });
    }
}