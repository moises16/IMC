package com.example.calcularimc;
import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class IMCActivity extends AppCompatActivity {

    private TextView imc;
    private Button button;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_c);

        imc = findViewById(R.id.ResultadoTextView);
        button = findViewById(R.id.RecalcularIMCButton);
        resultado = findViewById(R.id.mostrandoIMC);

        Intent intent = getIntent();
        double ResultadoIMC1 = intent.getDoubleExtra("imc",0);
        imc.setText(new DecimalFormat("##.##").format(ResultadoIMC1));

    button=findViewById(R.id.RecalcularIMCButton);
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(IMCActivity.this,MainActivity.class);
            startActivity(intent);



        }
    });

    }
}
