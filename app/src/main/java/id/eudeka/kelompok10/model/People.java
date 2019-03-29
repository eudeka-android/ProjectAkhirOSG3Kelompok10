package id.eudeka.kelompok10.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class People {

    @SerializedName("results")
    List<PeopleDetail> peoples;

    public People(List<PeopleDetail> peoples) {
        this.peoples = peoples;
    }

    public List<PeopleDetail> getPeoples() {
        return peoples;
    }

}
