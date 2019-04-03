package id.eudeka.kelompok10.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "people")
public class PeopleDetail {

    @PrimaryKey(autoGenerate = true)
    public int mId;

    @ColumnInfo(name = "people_name")
    @SerializedName("name")
    private String name;

    @ColumnInfo(name = "people_logo")
    @SerializedName("height")
    private String height;

    @ColumnInfo(name = "people_mass")
    @SerializedName("mass")
    private String mass;

    @ColumnInfo(name = "people_haircolor")
    @SerializedName("hair_color")
    private String hair_color;

    @ColumnInfo(name = "people_skincolor")
    @SerializedName("skin_color")
    private String skin_color;

    @ColumnInfo(name = "people_eyecolor")
    @SerializedName("eye_color")
    private String eye_color;

    @ColumnInfo(name = "people_birthyear")
    @SerializedName("birth_year")
    private String birth_year;

    @ColumnInfo(name = "people_gender")
    @SerializedName("gender")
    private String gender;

    @ColumnInfo(name = "people_homeworld")
    @SerializedName("homeworld")
    private String homeworld;

    @ColumnInfo(name = "people_films")
    @SerializedName("films")
    private String[] films;

    @ColumnInfo(name = "people_species")
    @SerializedName("species")
    private String[] species;

    @ColumnInfo(name = "people_vehicles")
    @SerializedName("vehicles")
    private String[] vehicles;

    @ColumnInfo(name = "people_starships")
    @SerializedName("starships")
    private String starships;

    public int getmId(){
        return mId;
    }

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

    public PeopleDetail(int mId, String name, String height, String mass, String hair_color, String skin_color,
                        String eye_color, String birth_year, String gender, String homeworld,
                        String[] films, String[] species, String[] vehicles, String starships) {
        this.mId = mId;
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
