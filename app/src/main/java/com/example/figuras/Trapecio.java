package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Trapecio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapecio);
        EditText editTextBaseMayor = findViewById(R.id.editTextNumber2);
        EditText editTextBaseMenor = findViewById(R.id.editTextNumber3);
        EditText editTextAltura = findViewById(R.id.editTextNumber4);
        Button buttonCalcular = findViewById(R.id.calcularTrapecio);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Obtener las bases y la altura del EditText y convertirlas a double
                String baseMayorStr = editTextBaseMayor.getText().toString();
                String baseMenorStr = editTextBaseMenor.getText().toString();
                String alturaStr = editTextAltura.getText().toString();
                if (!baseMayorStr.isEmpty() && !baseMenorStr.isEmpty() && !alturaStr.isEmpty()) {
                    double baseMayor = Double.parseDouble(baseMayorStr);
                    double baseMenor = Double.parseDouble(baseMenorStr);
                    double altura = Double.parseDouble(alturaStr);

                    // Calcular el área del trapecio
                    double area = ((baseMayor + baseMenor) * altura) / 2;

                    // Mostrar el resultado en el TextView
                    textViewResultado.setText("Área del trapecio: " + area);
                } else {
                    // Manejar el caso de entrada vacía
                    textViewResultado.setText("Por favor ingresa las bases y la altura del trapecio.");
                }
            }
        });

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Trapecio.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }



}