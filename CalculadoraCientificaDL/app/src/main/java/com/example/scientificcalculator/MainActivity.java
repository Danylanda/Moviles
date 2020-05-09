package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView entrada, muestra;
    String signos, v1, v2;
    Double n1, n2, resultado;
    boolean punto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (TextView) findViewById(R.id.entrada);
        muestra = (TextView) findViewById(R.id.muestra);

        punto = false;

    }

    @SuppressLint("SetTextI18n")
    public void btnClick_0(View view) {
        entrada.setText(entrada.getText() + "0");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_1(View view) {
        entrada.setText(entrada.getText() + "1");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_2(View view) {
        entrada.setText(entrada.getText() + "2");}

    @SuppressLint("SetTextI18n")
    public void btnClick_3(View view) {
        entrada.setText(entrada.getText() + "3");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_4(View view) {
        entrada.setText(entrada.getText() + "4");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_5(View view) {
        entrada.setText(entrada.getText() + "5");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_6(View view) {
        entrada.setText(entrada.getText() + "6");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_7(View view) {
        entrada.setText(entrada.getText() + "7");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_8(View view) {
        entrada.setText(entrada.getText() + "8");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_9(View view) {
        entrada.setText(entrada.getText() + "9");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_dot(View view) {
        if (!punto) {
            if (entrada.getText().equals("")) {

                entrada.setText("0.");
            } else {

                entrada.setText(entrada.getText() + ".");
            }

            punto = true;
        }

    }

    public void btnClick_add(View view) {
        signos = "+";
        v1 = entrada.getText().toString();
        entrada.setText(null);
        muestra.setText("+");
        punto = false;
    }

    public void btnClick_subtract(View view) {
        signos = "-";
        v1 = entrada.getText().toString();
        entrada.setText(null);
        muestra.setText("-");
        punto = false;
    }

    public void btnClick_multiply(View view) {
        signos = "*";
        v1 = entrada.getText().toString();
        entrada.setText(null);
        muestra.setText("×");
        punto = false;
    }

    public void btnClick_divide(View view) {
        signos = "/";
        v1 = entrada.getText().toString();
        entrada.setText(null);
        muestra.setText("÷");
        punto = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_log(View view) {
        signos = "log";
        entrada.setText(null);
        muestra.setText("log");
        punto = false;
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_ln(View view) {
        signos = "ln";
        entrada.setText(null);
        muestra.setText("ln");
        punto = false;
    }

    public void btnClick_power(View view) {
        signos = "power";
        v1 = entrada.getText().toString();
        entrada.setText(null);
        punto = false;
        muestra.setText("xⁿ");
    }

    public void btnClick_factorial(View view) {
        signos = "factorial";
        entrada.setText(null);
        punto = false;
        muestra.setText("!");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_sin(View view) {
        signos = "sin";
        entrada.setText(null);
        punto = false;
        muestra.setText("sin");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_cos(View view) {
        signos = "cos";
        entrada.setText(null);
        punto = false;
        muestra.setText("cos");
    }

    @SuppressLint("SetTextI18n")
    public void btnClick_tan(View view) {
        signos = "tan";
        entrada.setText(null);
        punto = false;
        muestra.setText("tan");
    }

    public void btnClick_root(View view) {
        signos = "root";
        entrada.setText(null);
        punto = false;
        muestra.setText("√");
    }


    //Funcionalidades
    @SuppressLint("SetTextI18n")
    public void btnClick_equal(View view) {
        if (signos == null) {
            muestra.setText("Error!");
        } else if (entrada.getText().equals("")) {
            muestra.setText("Error!");
        } else if ((signos.equals("+") || signos.equals("-") || signos.equals("*") || signos.equals("/")) && v1.equals("")) {
            muestra.setText("Error!");
        } else {
            switch (signos) {
                default:
                    break;
                case "log":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    entrada.setText(Math.log10(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "ln":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    entrada.setText(Math.log(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "power":
                    n1 = Double.parseDouble((v1));
                    v2 = entrada.getText().toString();
                    n2 = Double.parseDouble(v2);
                    entrada.setText(Math.pow(n1, n2) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "root":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble((v1));
                    entrada.setText(Math.sqrt(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "factorial":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble((v1));
                    int i = Integer.parseInt(v1) - 1;

                    while (i > 0) {
                        n1 = n1 * i;
                        i--;
                    }

                    entrada.setText(n1 + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "sin":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble((v1));
                    entrada.setText(Math.sin(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "cos":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble((v1));
                    entrada.setText(Math.cos(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "tan":
                    v1 = entrada.getText().toString();
                    n1 = Double.parseDouble((v1));
                    entrada.setText(Math.tan(n1) + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "+":
                    v2 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    resultado = n1 + n2;
                    entrada.setText(resultado + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "-":
                    v2 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    resultado = n1 - n2;
                    entrada.setText(resultado + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "*":
                    v2 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    resultado = n1 * n2;
                    entrada.setText(resultado + "");
                    signos = null;
                    muestra.setText(null);
                    break;
                case "/":
                    v2 = entrada.getText().toString();
                    n1 = Double.parseDouble(v1);
                    n2 = Double.parseDouble(v2);
                    resultado = n1 / n2;
                    entrada.setText(resultado + "");
                    signos = null;
                    muestra.setText(null);
                    break;
            }

        }
    }


    public void btnClick_delete(View view) {
        if (entrada.getText().equals("")) {
            entrada.setText(null);
        } else {
            int len = entrada.getText().length();
            String s = entrada.getText().toString();
            if (s.charAt(len - 1) == '.') {
                punto = false;
                entrada.setText(entrada.getText().subSequence(0, entrada.getText().length() - 1));
            } else {
                entrada.setText(entrada.getText().subSequence(0, entrada.getText().length() - 1));
            }
        }
    }

    public void btnClick_clear(View view) {

        entrada.setText(null);
        muestra.setText(null);
        v1 = null;
        v2 = null;
        signos = null;
        punto = false;
    }


}
