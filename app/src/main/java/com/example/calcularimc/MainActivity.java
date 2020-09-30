package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView peso;
    private TextView altura;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peso = findViewById(R.id.PesoEditText);
        altura = findViewById(R.id.alturaEditText);
        button = findViewById(R.id.calcularButton);

        TextView pesoEditText = (TextView) findViewById(R.id.PesoEditText);
        TextView alturaEditText = (TextView) findViewById(R.id.alturaEditText);
        final TextView resutado = (TextView) findViewById(R.id.ResultadoTextView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, IMCActivity.class);
                startActivity(intent);

                String pesoString = peso.getText().toString();
                double pesodouble = Double.parseDouble(pesoString);

                String alturaString = altura.getText().toString();
                double alturadouble = Double.parseDouble(alturaString);

                String resultado = resutado.getText().toString();
                double resultadodouble = Double.parseDouble(resultado);

                resultadodouble = pesodouble /(alturadouble*alturadouble);

            }
        });
    }
    private void enviaResultado(double resultadodouble){
        Intent intent = new Intent(MainActivity.this,IMCActivity.class);
        startActivity(intent);
    }

};


