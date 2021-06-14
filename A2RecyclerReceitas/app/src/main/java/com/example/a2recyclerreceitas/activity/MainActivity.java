package com.example.a2recyclerreceitas.activity;

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

import com.example.a2recyclerreceitas.R;
import com.example.a2recyclerreceitas.adapter.Adapter;
import com.example.a2recyclerreceitas.model.Result;
import com.example.a2recyclerreceitas.model.Root;
import com.example.a2recyclerreceitas.util.RecyclerItemClickListener;
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

  Root personagens ;
  OkHttpClient client = new OkHttpClient();
  RecyclerView recyclerView;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    recyclerView = findViewById(R.id.recyclerView);



      chamaReceitas();

      recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
          getApplicationContext(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
          Result personagem = personagens.getResults().get(position);

          Intent intent = new Intent(getApplicationContext(), PersonagemActivity.class);
          intent.putExtra("personagem", personagem);
          intent.putExtra("personagemPA", personagem.getFirst_appeared_in_issue());
          intent.putExtra("personagemImagem", personagem.getImage());
          intent.putExtra("personagemPublisher", personagem.getPublisher());
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





  public void chamaReceitas(){
    Request request = new Request.Builder()
        .url("https://comicvine.gamespot.com/api/characters/?api_key=ce0ed31938ad05dcf62da9b67e76eaf950abcc8e&format=json")
        .header("number_of_total_results", "15")
        .build();

    client.newCall(request).enqueue(new Callback() {
      @Override
      public void onFailure(@NotNull Call call, @NotNull IOException e) { e.printStackTrace();}

      @Override
      public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
        if(response.isSuccessful()){


          ResponseBody  responseBody = response.body();
          String responseString = responseBody.string();

          try {

            Gson gson = new Gson();
            MainActivity.this.runOnUiThread((() -> {

              personagens = gson.fromJson(responseString , Root.class);
              Log.d("http", "onResponse: " + personagens);

              LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
              recyclerView.setLayoutManager(manager);
              recyclerView.setHasFixedSize(true);
              recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(), LinearLayout.VERTICAL));
              Adapter adapter = new Adapter(getApplicationContext(),personagens);
              recyclerView.setAdapter(adapter);
            }));

//
          }catch (Exception e){
            Log.d("TAG", "onResponse: " + e);
          }

        }
      }});







  }
}