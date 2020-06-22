package com.example.daniela5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText Ncasos, Ncasos2, Ncasos3, Ncasos4, Ncasos5, Ncasos6;
    private Button SETVALUES, Ingresarbusqueda;
    private String ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeVariables();
    }

    public void initializeVariables() {
        et1 = findViewById(R.id.etNumber1);
        et2 = findViewById(R.id.etNumber2);

        tv1 = findViewById(R.id.tv1);
        tv1.setText("Calculadora Basica");
        tvRespuesta = findViewById(R.id.tv2);

        btSumar = findViewById(R.id.btSumar);
        btSumar.setOnClickListener(this);

        btClean = findViewById(R.id.btClean);
        btClean.setOnClickListener(this);

        btCalc2 = findViewById(R.id.btCalc2);
        btCalc2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btSumar:
                n1 = et1.getText().toString();
                String n2 = et2.getText().toString();
                int respuesta = Integer.parseInt(n1) + Integer.parseInt(n2);
                tvRespuesta.setText("" + respuesta);
                break;
            case R.id.btClean:
                et1.setText("");
                et2.setText("");
                Toast.makeText(this, "Click Button Clear", Toast.LENGTH_LONG).show();
                break;
            case R.id.btCalc2:
                Intent intent= new Intent(this, CalcCientific.class);
                startActivity(intent);
                break;
        }
    }
}