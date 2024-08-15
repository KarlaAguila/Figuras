package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);

        EditText editTextRadio = findViewById(R.id.editTextNumber);
        Button buttonCalcular = findViewById(R.id.calcularCirculo);
        TextView textViewResultado = findViewById(R.id.textViewResultado);

        buttonCalcular.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                // Obtener el radio del EditText y convertirlo a double
                String radioStr = editTextRadio.getText().toString();
                if (!radioStr.isEmpty()) {
                    double radio = Double.parseDouble(radioStr);

                    // Calcular el área del círculo
                    double area = Math.PI * Math.pow(radio, 2);

                    // Mostrar el resultado en el TextView
                    textViewResultado.setText("Área del círculo: " + area);
                } else {
                    // Manejar el caso de entrada vacía
                    textViewResultado.setText("Por favor ingresa el radio del círculo.");
                }
            }
                                          }
        );

        Button buttonRegresar = findViewById(R.id.inicio);
        buttonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Crear un Intent para regresar a la actividad principal (MainActivity)
                Intent intent = new Intent(Circulo.this, MainActivity.class);
                // Iniciar la actividad MainActivity
                startActivity(intent);
                // Finalizar la actividad actual (Circulo)
                finish();
            }
        });
}
}