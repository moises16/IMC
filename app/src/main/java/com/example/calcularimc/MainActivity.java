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
        peso = findViewById(R.id.pesoEditText);
        altura = findViewById(R.id.alturaEditText);
        button = findViewById(R.id.calcularButton);




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pesoString = peso.getText().toString();
                double pesodouble = Double.parseDouble(pesoString);

                String alturaString = altura.getText().toString();
                double alturadouble = Double.parseDouble(alturaString);

                double imc= calculaIMC(pesodouble,alturadouble);

                Intent intent = new Intent(MainActivity.this, IMCActivity.class);
                intent.putExtra("imc",imc);
                startActivity(intent);


            }
        });

    }
   private double calculaIMC(double pesodouble, double alturadouble){
        return pesodouble/ (alturadouble*alturadouble);

    }

}




