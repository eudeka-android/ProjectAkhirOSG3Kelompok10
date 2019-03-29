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

    public PeopleDetail(String name, String height, String mass, String hair_color, String skin_color,
                        String eye_color, String birth_year, String gender, String homeworld,
                        String[] films, String[] species, String[] vehicles, String starships) {
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hair_color = hair_color;
        this.skin_color = skin_color;
        this.eye_color = eye_color;
        this.birth_year = birth_year;
        this.gender = gender;
        this.homeworld = homeworld;
        this.films = films;
        this.species = species;
        this.vehicles = vehicles;
        this.starships = starships;
    }
}
