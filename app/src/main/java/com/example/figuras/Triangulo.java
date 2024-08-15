package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);

        EditText editTextBase = findViewById(R.id.editTextNumber2);
        EditText editTextAltura = findViewById(R.id.editTextNumber3);
        Button buttonCalcular = findViewById(R.id.calcularTriangulo);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtener la base y la altura del EditText y convertirlas a double
                String baseStr = editTextBase.getText().toString();
                String alturaStr = editTextAltura.getText().toString();
                if (!baseStr.isEmpty() && !alturaStr.isEmpty()) {
                    double base = Double.parseDouble(baseStr);
                    double altura = Double.parseDouble(alturaStr);

                    // Calcular el área del triángulo
                    double area = (base * altura) / 2;

                    // Mostrar el resultado en el TextView
                    textViewResultado.setText("Área del triángulo: " + area);
                } else {
                    // Manejar el caso de entrada vacía
                    textViewResultado.setText("Por favor ingresa la base y la altura del triángulo.");
                }
            }
        });

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Triangulo.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}