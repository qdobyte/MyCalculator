package com.example.qdobyte.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText txtPant;
    public double operando1, operando2, resultado;
    int operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtPant = (EditText) findViewById(R.id.etPantalla);

    }

    public void btn0(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "0";
        txtPant.setText(cap);
    }

    public void btn1(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "1";
        txtPant.setText(cap);
    }

    public void btn2(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "2";
        txtPant.setText(cap);
    }

    public void btn3(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "3";
        txtPant.setText(cap);
    }

    public void btn4(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "4";
        txtPant.setText(cap);
    }

    public void btn5(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "5";
        txtPant.setText(cap);
    }

    public void btn6(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "6";
        txtPant.setText(cap);
    }

    public void btn7(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "7";
        txtPant.setText(cap);
    }

    public void btn8(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "8";
        txtPant.setText(cap);
    }
    public void btn9(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + "9";
        txtPant.setText(cap);
    }

    public void btnPunto(View v) {
        String cap = txtPant.getText().toString();
        cap = cap + ".";
        txtPant.setText(cap);
    }

    public void btnSuma(View v) {
        try {
            String aux1 = txtPant.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        txtPant.setText("");
        operacion = 1;
    }

    public void btnResta(View v) {
        try {
            String aux1 = txtPant.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        txtPant.setText("");
        operacion = 2;
    }

    public void btnMultiplicacion(View v) {
        try {
            String aux1 = txtPant.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        txtPant.setText("");
        operacion = 3;
    }

    public void btnDivision(View v) {
        try {
            String aux1 = txtPant.getText().toString();
            operando1 = Double.parseDouble(aux1);
        } catch (NumberFormatException nfe) {
        }
        txtPant.setText("");
        operacion = 4;
    }

    public void btnResultado(View v) {
        try {
            String aux2 = txtPant.getText().toString();
            operando2 = Double.parseDouble(aux2);
        } catch (NumberFormatException nfe) {
        }
        txtPant.setText("");

        if (operacion == 1) {
            resultado = operando1 + operando2;
        } else if (operacion == 2) {
            resultado = operando1 - operando2;
        } else if (operacion == 3) {
            resultado = operando1 * operando2;
        } else if (operacion == 4) {
            if (operando2 == 0) txtPant.setText("Error");
            else{ resultado = operando1 / operando2;
            }
        }
        txtPant.setText(""+resultado);
        operando1 = resultado;
    }
    public  void btnLimpiar (View v){
        txtPant.setText("");
        operando1 = 0.0;
        operando2 = 0.0;
        resultado = 0.0;
    }
    public void btnBorrar (View v){
        if (!txtPant.getText().toString().equals("")){
            txtPant.setText(txtPant.getText().subSequence(0,txtPant.getText().length()-1)+"");
        }
    }
}