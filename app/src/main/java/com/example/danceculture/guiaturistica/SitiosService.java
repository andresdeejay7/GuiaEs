package com.example.danceculture.guiaturistica;



import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by DanceCulture on 12/10/17.
 */

public interface SitiosService {

    @GET("dnt9-jcdu.json")

    Call<ArrayList<Establecimiento>> obtenerListaDeSitios();

}
