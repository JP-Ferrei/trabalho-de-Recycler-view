package com.example.recyclerviewa2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewa2.R;
import com.example.recyclerviewa2.model.Card;

import java.io.Serializable;

public class CardActivity extends AppCompatActivity {


    TextView CartaNome ;
    TextView CartaTipo ;
    TextView CartaTexto ;
    TextView ManaCost ;
    TextView CartaArtista ;
    TextView CartaNumero ;
   // TextView CartaTextoFlavor ;
    TextView CartaCor ;
    TextView CartaRaridade ;
    ImageView CartaImagem;
    TextView CartaSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        CartaNome =findViewById(R.id.CartaNome);
        CartaTipo=findViewById(R.id.CartaTipo);
        CartaTexto=findViewById(R.id.CartaTexto);
        ManaCost=findViewById(R.id.ManaCost);
        CartaArtista=findViewById(R.id.CartaArtista);
        CartaNumero=findViewById(R.id.CartaNumero);
        //CartaTextoFlavor=findViewById(R.id.CartaTextoFlavor);
        CartaCor=findViewById(R.id.CartaCor);
        CartaRaridade=findViewById(R.id.CartaRaridade);
        CartaImagem=findViewById(R.id.CartaImagem);
        CartaSet= findViewById(R.id.CartaSet);
        Card carta = getIntent().getParcelableExtra("Carta");


        CartaNome.setText("Nome:" +carta.getName());
        CartaTipo.setText("Tipo:" +carta.getType());
        CartaTexto.setText("Texto:" +carta.getText());
        ManaCost.setText("Custo de Mana:" +carta.getManaCost());
        CartaArtista.setText("Artista:" +carta.getArtist());
        CartaNumero.setText("Numero:" +carta.getNumber());
        //CartaTextoFlavor.setText(carta.get());
        CartaCor.setText("Cores:" +carta.getColors().toString());
        CartaRaridade.setText("Raridade:" +carta.getRarity());
        CartaImagem.setImageResource(carta.getImagem());
        CartaSet.setText("Set:" +carta.getSet());


        Log.d("Carta", "onCreate: " + carta);
    }
}