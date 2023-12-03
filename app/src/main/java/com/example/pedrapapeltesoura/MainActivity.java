package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // metodo selecionar Pedra
    public void selecionarPedra(View view) {
        verificarGanhador("pedra");
    }

    //Metado Selecionar Papel
    public void selecionarPapel(View view) {
        verificarGanhador("papel");
    }

    //metodo selecionarTesoura
    public void selecionarTesoura(View view) {
        verificarGanhador("tesoura");
    }

    //criando metodo gerarEscolha
    private String gerarEscolhaAleatoriaApp() {

        //criar um array
        String[] opcoes = {"pedra", "papel", "tesoura"};

        //random
        int numeroAleatorio = new Random().nextInt(3);

        //recebendo imagem view
        ImageView imageApp = findViewById(R.id.image_app);

        String escolhaApp = opcoes[numeroAleatorio];
        //criando  meu switch
        switch (escolhaApp) {
            case "pedra":
                imageApp.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imageApp.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imageApp.setImageResource(R.drawable.tesoura);
                break;
        }
        return escolhaApp;
    }


    private void verificarGanhador(String escolhaUsuario) {


        String escolhaApp = gerarEscolhaAleatoriaApp();

        TextView textResultado = findViewById(R.id.text_Resultado);

        if ((escolhaApp == "pedra" && escolhaUsuario == "tesoura") ||
                (escolhaApp == "tesoura" && escolhaUsuario == "papel") ||
                (escolhaApp == "papel" && escolhaUsuario == "pedra")) {
            textResultado.setText("Você perdeu :(");
        } else if ((escolhaUsuario == "pedra" && escolhaApp == "tesoura") ||
                (escolhaUsuario == "tesoura" && escolhaApp == "papel") ||
                (escolhaUsuario == "papel" && escolhaApp == "pedra")) {
            textResultado.setText("Você ganho :)");
        } else {
            textResultado.setText("Empatou");
        }
        // System.out.println("Item clicado:"+ escolhaUsuario);
    }

}