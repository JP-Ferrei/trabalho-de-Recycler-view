package com.example.a2recyclerreceitas.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.a2recyclerreceitas.R;
import com.example.a2recyclerreceitas.model.FirstAppearedInIssue;
import com.example.a2recyclerreceitas.model.Image;
import com.example.a2recyclerreceitas.model.Publisher;
import com.example.a2recyclerreceitas.model.Result;

import static com.example.a2recyclerreceitas.R.id.PersonagemFoto;

public class PersonagemActivity extends AppCompatActivity {

  TextView PersonagemNick;
  TextView PersonagemNome;
  TextView Personagemdescricao;
  TextView PATexto;
  TextView PAissue_number;
  TextView tvPublisher;
  TextView tvAlianca;
  ImageView PersonagemFoto;
  ImageView PAImagem;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_personagem);
  PersonagemNick = findViewById(R.id.PersonagemNick);
  PersonagemNome =findViewById(R.id.PersonagemNome);
  Personagemdescricao =findViewById(R.id.Personagemdescricao);
  PersonagemFoto=findViewById(R.id.PersonagemFoto);
  PATexto =findViewById(R.id.PATexto);
  PAissue_number=findViewById(R.id.PAissue_number);
  tvPublisher=findViewById(R.id.tvPublisher);
  tvAlianca=findViewById(R.id.tvAlianca);

  Result personagem = getIntent().getParcelableExtra("personagem");
    FirstAppearedInIssue  fa = getIntent().getParcelableExtra("personagemPA");
    Image image = getIntent().getParcelableExtra("personagemImagem");
    Publisher publisher = getIntent().getParcelableExtra("personagemPublisher");

    Log.d("http", "onCreate: " +PersonagemFoto);

   PersonagemNick.setText("NickName:\n " + personagem.getName());
   PersonagemNome.setText("nome:\n " + personagem.getReal_name());
   Personagemdescricao.setText("Descrição:\n " + personagem.getDeck());
   Glide.with(PersonagemActivity.this).load(image.getSmall_url()).into(PersonagemFoto);
   PATexto.setText("Nome:\n " + fa.getName());
   PAissue_number.setText("Edição:\n " + fa.getIssue_number());
   tvPublisher.setText("Publisher:\n" + publisher.getName());
   tvAlianca.setText("Alianças:\n " + personagem.getAliases());

  }


}