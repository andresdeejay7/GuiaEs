package com.example.danceculture.guiaturistica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    private Retrofit retrofit;
    public static final String TAG = "datosColombia";

    ArrayList<Establecimiento> listDatos;
    RecyclerView recycler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView)findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        listDatos=new ArrayList<>();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        obtenerDatos();


    }

    public void obtenerDatos(){
        SitiosService service = retrofit.create(SitiosService.class);
        Call<ArrayList<Establecimiento>> sitioRespuestaCall = service.obtenerListaDeSitios();
        sitioRespuestaCall.enqueue(new Callback<ArrayList<Establecimiento>>() {
            @Override
            public void onResponse(Call<ArrayList<Establecimiento>> call, Response<ArrayList<Establecimiento>> response) {

                if (response.isSuccessful()){
                    ArrayList lista = response.body();




                    AdapterDatos adapter=new AdapterDatos(lista);
                    recycler.setAdapter(adapter);

                }else{
                    Log.e(TAG,"OnResponse : "+response.errorBody());
                }


            }

            @Override
            public void onFailure(Call<ArrayList<Establecimiento>> call, Throwable t) {

            }


        });



    }
}
