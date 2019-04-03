package id.eudeka.kelompok10.data.local;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import id.eudeka.kelompok10.model.PeopleDetail;

@Dao
public interface PeopleDao {
    @Query("SELECT * FROM people")
    List<PeopleDetail> getPeoples();

    @Insert
    void insertPeople(List<PeopleDetail> people);
}
