package id.eudeka.kelompok10.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class People implements Parcelable {

    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public class Results {
        @SerializedName("name")
        private String name;
        @SerializedName("url")
        private String url;
        @SerializedName("films")
        private String [] films;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String[] getFilms() {
            return films;
        }

        public void setFilms(String[] films) {
            this.films = films;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.results);
    }

    public People() {
    }

    protected People(Parcel in) {
        this.results = new ArrayList<Results>();
        in.readList(this.results, Results.class.getClassLoader());
    }

    public static final Parcelable.Creator<People> CREATOR = new Parcelable.Creator<People>() {
        @Override
        public People createFromParcel(Parcel source) {
            return new People(source);
        }

        @Override
        public People[] newArray(int size) {
            return new People[size];
        }
    };
}
