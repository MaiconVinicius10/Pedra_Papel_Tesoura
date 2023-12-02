package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // metodo selecionar Pedra
    public void selecionarPedra(View view){
        verificarGanhador("pedra");
    }
    //Metado Selecionar Papel
    public void selecionarPapel(View view){
        verificarGanhador("papel");
    }
    //metodo selecionarTesoura
    public void selecionarTesoura(View view){
        verificarGanhador("tesoura");
    }

    //criando meu gerador de escolha da maquina
    private String gerarEscolhaAleatoriaApp(){
        //criando array aleatorio
        String[]opcoes={"pedra,papel,tesoura"};
        int numeroAleatorio=  new Random().nextInt(3);

        //intanciando imagem
        ImageView imagemApp=findViewById(R.id.image_app);

        //numeroaleatorio
        String escolhaApp=opcoes[numeroAleatorio];
        switch (escolhaApp){
            case "pedra":
                imagemApp.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                imagemApp.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imagemApp.setImageResource(R.drawable.tesoura);
        }

        return escolhaApp;
    }

    private void verificarGanhador(String escolhaUsuario){

        String escolha = gerarEscolhaAleatoriaApp();

        // System.out.println("Item clicado:"+ escolhaUsuario);
    }
}