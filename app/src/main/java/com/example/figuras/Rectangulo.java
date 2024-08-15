package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Rectangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);

        EditText editTextBase = findViewById(R.id.editTextNumber2);
        EditText editTextAltura = findViewById(R.id.editTextNumber3);
        Button buttonCalcular = findViewById(R.id.calcularRectangulo);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener(){
              public void onClick(View v){
                  // Obtener base y altura del EditText y convertirlo a double
                  String baseStr = editTextBase.getText().toString();
                  String alturaStr = editTextAltura.getText().toString();
                  if (!baseStr.isEmpty() && !alturaStr.isEmpty()) {
                      double base = Double.parseDouble(baseStr);
                      double altura = Double.parseDouble(alturaStr);

                      // Calcular el área del rectángulo
                      double area = base * altura;

                      // Mostrar el resultado en el TextView
                      textViewResultado.setText("Área del rectángulo: " + area);
                  }else {
                      // Manejar el caso de entrada vacía
                      textViewResultado.setText("Por favor ingresa la base y la altura del rectángulo.");
                  }
              }
          }
        );

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Rectangulo.this, MainActivity.class);
                // Iniciar la actividad MainActivity
                startActivity(intent);
                // Finalizar la actividad actual (Circulo)
                finish();
            }
        });
    }

}