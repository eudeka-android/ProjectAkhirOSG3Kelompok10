package id.eudeka.kelompok10.data;

import id.eudeka.kelompok10.model.People;

public interface PeopleDataSource {

    void getAllPeople(GetPeopleCallback callback);


    interface GetPeopleCallback {
        void onPeopleLoaded(People data);
        void onDataNotAvailable(String errorMessage);
    }
}
