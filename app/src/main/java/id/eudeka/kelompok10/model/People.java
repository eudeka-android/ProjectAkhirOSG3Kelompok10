package id.eudeka.kelompok10.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People{

    @SerializedName("results")
    private List<PeopleDetail> results = null;

    public People(List<PeopleDetail> results) {
        this.results = results;
    }



    public List<PeopleDetail> getResults() {
        return results;
    }

    public void setResults(List<PeopleDetail> results) {
        this.results = results;
    }

}
