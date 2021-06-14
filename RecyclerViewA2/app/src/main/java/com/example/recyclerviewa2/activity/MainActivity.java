package com.example.recyclerviewa2.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.recyclerviewa2.R;
import com.example.recyclerviewa2.adapter.Adapter;
import com.example.recyclerviewa2.model.Card;
import com.example.recyclerviewa2.model.Cards;
import com.example.recyclerviewa2.util.RecyclerItemClickListener;
import com.google.gson.Gson;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class MainActivity extends AppCompatActivity {

    Cards cards ;

    RecyclerView recyclerView;
    OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);

        chamaCartas();

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Card carta  =cards.getCards().get(position);
                Intent intent = new Intent(getApplicationContext(),CardActivity.class);


                intent.putExtra("Carta", carta);
                startActivity(intent);
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }
        ));
    }

    public  void chamaCartas(){
    Request request = new Request.Builder()
            .url("https://api.magicthegathering.io/v1/cards")
            .header("Count", "10")
            .build();

    client.newCall(request).enqueue(new Callback() {
        @Override
        public void onFailure(@NotNull Call call, @NotNull IOException e) {
            e.printStackTrace();
        }

        @Override
        public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
            if(response.isSuccessful()){
                ResponseBody responseBody = response.body();
                String reponseString = responseBody.string();
                try {
                    Gson gson = new Gson();

                    MainActivity.this.runOnUiThread( (() -> {
                        cards = gson.fromJson(reponseString, Cards.class);
                        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
                        recyclerView.setLayoutManager(manager);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
                        Adapter adapter = new Adapter(getApplicationContext(), cards);
                        recyclerView.setAdapter(adapter);
                    }));


                } catch (Exception e) {
                    Log.d("jo", "onResponse: erro"+ e);
                }
            }
        }


    });
}

}


