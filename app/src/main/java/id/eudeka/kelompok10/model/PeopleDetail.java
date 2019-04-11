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

    @ColumnInfo(name = "people_height")
    @SerializedName("height")
    private String height;

    @ColumnInfo(name = "people_mass")
    @SerializedName("mass")
    private String mass;

    @ColumnInfo(name = "people_hair")
    @SerializedName("hair_color")
    private String hairColor;

    @ColumnInfo(name = "people_skin")
    @SerializedName("skin_color")
    private String skinColor;

    @ColumnInfo(name = "people_eye")
    @SerializedName("eye_color")
    private String eyeColor;

    @ColumnInfo(name = "people_birth")
    @SerializedName("birth_year")
    private String birthYear;

    @ColumnInfo(name = "people_gender")
    @SerializedName("gender")
    private String gender;

    @ColumnInfo(name = "people_home")
    @SerializedName("homeworld")
    private String homeworld;

    /*@ColumnInfo(name = "people_films")
    @SerializedName("films")
    private List<String> films = null;

    @ColumnInfo(name = "people_species")
    @SerializedName("species")
    private List<String> species = null;

    @ColumnInfo(name = "people_name")
    @SerializedName("vehicles")
    private List<String> vehicles = null;

    @SerializedName("starships")
    private List<String> starships = null;*/

    @ColumnInfo(name = "people_created")
    @SerializedName("created")
    private String created;

    @ColumnInfo(name = "people_edited")
    @SerializedName("edited")
    private String edited;

    @ColumnInfo(name = "people_url")
    @SerializedName("url")
    private String url;


    public PeopleDetail(int mId, String name, String height, String mass, String hairColor, String skinColor, String eyeColor, String birthYear, String gender, String homeworld, String created, String edited, String url) {
        this.mId = mId;
        this.name = name;
        this.height = height;
        this.mass = mass;
        this.hairColor = hairColor;
        this.skinColor = skinColor;
        this.eyeColor = eyeColor;
        this.birthYear = birthYear;
        this.gender = gender;
        this.homeworld = homeworld;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(String homeworld) {
        this.homeworld = homeworld;
    }

   /* public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public List<String> getSpecies() {
        return species;
    }

    public void setSpecies(List<String> species) {
        this.species = species;
    }

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<String> getStarships() {
        return starships;
    }

    public void setStarships(List<String> starships) {
        this.starships = starships;
    }*/

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getEdited() {
        return edited;
    }

    public void setEdited(String edited) {
        this.edited = edited;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
