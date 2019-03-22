package id.eudeka.kelompok10.model;

import com.google.gson.annotations.SerializedName;

public class PeopleDetail {

    @SerializedName("name")
    private String name;

    @SerializedName("height")
    private String height;

    @SerializedName("mass")
    private String mass;

    @SerializedName("hair_color")
    private String hair_color;

    @SerializedName("skin_color")
    private String skin_color;

    @SerializedName("eye_color")
    private String eye_color;

    @SerializedName("birth_year")
    private String birth_year;

    @SerializedName("gender")
    private String gender;

    @SerializedName("homeworld")
    private String homeworld;

    @SerializedName("films")
    private String[] films;

    @SerializedName("species")
    private String[] species;

    @SerializedName("vehicles")
    private String[] vehicles;

    @SerializedName("starships")
    private String starships;

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getMass() {
        return mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public String[] getFilms() {
        return films;
    }

    public String[] getSpecies() {
        return species;
    }

    public String[] getVehicles() {
        return vehicles;
    }

    public String getStarships() {
        return starships;
    }

}
