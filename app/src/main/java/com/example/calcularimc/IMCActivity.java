package com.example.calcularimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IMCActivity extends AppCompatActivity {

    private TextView IMC;
    private Button button;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_m_c);



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
