package com.example.simplecalcandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);//Casting para alojar el valor del textview numerico convertir a un editText
        et2 = (EditText) findViewById(R.id.txt_num2);//R es el puente entre el archivo java y el XML
        tv1 = (TextView) findViewById(R.id.txt_resultado);//Ultimo Casting
    }

    //Este Metodo Realiza la Suma
    public void Sumar(View view){
        //El metodo void regresa un valor
        //Se requiere las View para poder dibujar dentro de nuestras aplicaiones los componentes
        // hay que asignarle un nombre por ejemplo view

        String valor1=et1.getText().toString();//parseando y convirtiendo el valor del et1 en un string
        String valor2=et2.getText().toString();

        float num1 = Float.parseFloat(valor1);//parseando y convirtiendo un valor string en un Float
        float num2 = Float.parseFloat(valor2);

        float suma = num1+num2;

        //String resultado= suma + "";Parseo poco profesional pero funcional de float a string

        String resultado = String.valueOf(suma);//CAsting para convertir un float en String

        tv1.setText(resultado);
        //En la propiedad Onclick del Botton se Selecciona el Metodo sumar para que cada vez que presione ejecute el metodo
    }
}