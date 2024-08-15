package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rombo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rombo);

        EditText editTextDiagonalMayor = findViewById(R.id.editTextNumber2);
        EditText editTextDiagonalMenor = findViewById(R.id.editTextNumber3);
        Button buttonCalcular = findViewById(R.id.calcularRombo);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener las diagonales del EditText y convertirlas a double
                String diagonalMayorStr = editTextDiagonalMayor.getText().toString();
                String diagonalMenorStr = editTextDiagonalMenor.getText().toString();
                if (!diagonalMayorStr.isEmpty() && !diagonalMenorStr.isEmpty()) {
                    double diagonalMayor = Double.parseDouble(diagonalMayorStr);
                    double diagonalMenor = Double.parseDouble(diagonalMenorStr);

                    // Calcular el área del rombo
                    double area = (diagonalMayor * diagonalMenor) / 2;

                    // Mostrar el resultado en el TextView
                    textViewResultado.setText("Área del rombo: " + area);
                } else {
                    // Manejar el caso de entrada vacía
                    textViewResultado.setText("Por favor ingresa las diagonales del rombo.");
                }
            }
        });

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Rombo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}