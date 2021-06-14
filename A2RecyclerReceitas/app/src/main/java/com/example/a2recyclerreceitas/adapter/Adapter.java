package com.example.a2recyclerreceitas.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.a2recyclerreceitas.R;
import com.example.a2recyclerreceitas.model.Result;
import com.example.a2recyclerreceitas.model.Root;

import org.jetbrains.annotations.NotNull;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

  private Context mContext;
  private Root personagens;

  public Adapter(Context mContext,Root personagens) {
    this.mContext = mContext;
    this.personagens = personagens;
  }

  @NotNull
  @Override
  public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View itemLista = LayoutInflater.from(mContext).inflate(R.layout.adapter_lista, parent, false);

    return new MyViewHolder(itemLista);
  }

  @Override
  public void onBindViewHolder(@NonNull @NotNull Adapter.MyViewHolder holder, int position) {
    Result personagen = personagens.getResults().get(position);
    holder.tvPersonagemNick.setText(personagen.getName());
    holder.tvPersonagemNome.setText(personagen.getReal_name() );
    holder.tvNumeroAparicoes.setText(String.valueOf(personagen.getCount_of_issue_appearances()));
    holder.tvPrimeiraAparicao.setText(personagen.getFirst_appeared_in_issue().getName());
    Glide.with(mContext).load(personagen.getImage().getMedium_url()).into(holder.PersonagemImagem);
    Log.d("http", "onBindViewHolder: " + personagen.getImage());

  }

  @Override
  public int getItemCount() {
    return personagens.getResults().size();
  }

  public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView tvPersonagemNick;
    TextView tvPersonagemNome;
    TextView tvNumeroAparicoes;
    TextView tvPrimeiraAparicao;
    ImageView PersonagemImagem;

    public MyViewHolder(@NonNull @NotNull View itemView) {
      super(itemView);

      tvPersonagemNick = itemView.findViewById(R.id.tvPersonagemNick);
      tvPersonagemNome = itemView.findViewById(R.id.tvPersonagemNome);
      tvNumeroAparicoes = itemView.findViewById(R.id.tvNumeroAparicoes);
      tvPrimeiraAparicao = itemView.findViewById(R.id.tvPrimeiraAparicao);
      PersonagemImagem = itemView.findViewById(R.id.PersonagemImagem);

    }
  }
}
