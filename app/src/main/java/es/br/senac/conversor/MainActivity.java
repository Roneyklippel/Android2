package es.br.senac.conversor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//declarando uma classe
//extends AppCompatActivity é uma herança de classe
public class MainActivity extends AppCompatActivity {


    // metodo que declara o ciclo de criação da tela...
    //Override sobre escreve um metodo
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //declaração de metodo
        super.onCreate(savedInstanceState);
        // metodo que liga a Activity.java com o java
        setContentView(R.layout.activity_main);
    }
}
