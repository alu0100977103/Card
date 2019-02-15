package com.example.asus.card;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Dia;
    private Button btm_calcular, btm_limpiar;
    private TextView textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Dia = (EditText) findViewById(R.id.Dia);
        btm_calcular =(Button) findViewById(R.id.btm_calcular);
        btm_limpiar =(Button) findViewById(R.id.btm_limpiar);
        textView4 = (TextView) findViewById(R.id.textView4);
    }

    public void Calcular (View view){
        int day = Integer.parseInt(Dia.getText().toString()); //Convertir a entero
        double pago =day*13.75;
        double descuento =0.00;
        double sueldo=2220;
        textView4.setText(String.valueOf(pago)); //transforma en string y muestra ya que solo muestra cadena
    }

    public void Limpiar (View view){
        Dia.setText("");
        textView4.setText("Pago");

    }
}
