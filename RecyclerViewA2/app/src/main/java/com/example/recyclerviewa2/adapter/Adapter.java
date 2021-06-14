package com.example.recyclerviewa2.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewa2.R;
import com.example.recyclerviewa2.model.Cards;
import com.squareup.picasso.Picasso;

import okhttp3.Callback;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder>    {

    private Context mContext;
    private Cards cards;

    public Adapter(Context mContext, Cards cards) {
        this.mContext = mContext;
        this.cards = cards;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(mContext).inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Log.d("carta", "onBindViewHolder: carta" + cards.getCards().get(2).getImageUrl());
          holder.CardName.setText(cards.getCards().get(position).getName());
          holder.Raridade.setText(cards.getCards().get(position).getRarity());
          holder.Type.setText(cards.getCards().get(position).getType());
          holder.Artist.setText(cards.getCards().get(position).getArtist());
          Glide.with(mContext).load(cards.getCards().get(position).getImagem())
              .placeholder(R.drawable.fundoimagem)
                 .into(holder.CardImage);


    }

    @Override
    public int getItemCount() {
        return 15;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView CardName;
        TextView Raridade;
        TextView Type;
        TextView Artist;
        ImageView CardImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            CardName = itemView.findViewById(R.id.tvCardName);
            Raridade= itemView.findViewById(R.id.tvRaridade);
            Type = itemView.findViewById(R.id.tvType);
            Artist = itemView.findViewById(R.id.tvArtist);
            CardImage = itemView.findViewById(R.id.CardImage);
        }
    }
}
