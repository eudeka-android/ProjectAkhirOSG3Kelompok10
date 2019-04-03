package id.eudeka.kelompok10.navigator;

import java.util.List;

import id.eudeka.kelompok10.model.PeopleDetail;

public interface PeopleNavigator {
    void loadListPeople(List<PeopleDetail> list);
    void errorLoadListPeople(String message);
}
