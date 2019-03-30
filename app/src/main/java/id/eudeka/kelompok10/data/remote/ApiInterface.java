package id.eudeka.kelompok10.data.remote;

import id.eudeka.kelompok10.model.People;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("people")
    Call<People> getAllPeople();
}
