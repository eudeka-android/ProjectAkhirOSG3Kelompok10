package id.eudeka.kelompok10.viewmodel;

import android.content.Context;

import id.eudeka.kelompok10.data.PeopleDataSource;
import id.eudeka.kelompok10.data.PeopleRepository;
import id.eudeka.kelompok10.model.People;
import id.eudeka.kelompok10.navigator.PeopleNavigator;

public class PeopleViewModel{

    private PeopleRepository peopleRepository;
    private Context context;
    private PeopleNavigator mNavigator;


    public PeopleViewModel(PeopleRepository peopleRepository, Context context) {
        this.peopleRepository = peopleRepository;
        this.context = context;
    }

    public void setNavigator(PeopleNavigator navigator) {
        mNavigator = navigator;
    }

    public void getListPeople() {

        peopleRepository.getAllPeople(new PeopleDataSource.GetPeopleCallback() {
            @Override
            public void onPeopleLoaded(People data) {
                mNavigator.loadListPeople(data.getResults());
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                mNavigator.errorLoadListPeople(errorMessage);
            }
        });
    }
}
