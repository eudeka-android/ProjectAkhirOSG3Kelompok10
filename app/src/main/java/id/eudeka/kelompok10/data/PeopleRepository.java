package id.eudeka.kelompok10.data;

import id.eudeka.kelompok10.data.local.PeopleLocalDataSource;
import id.eudeka.kelompok10.data.remote.PeopleRemoteDataSource;
import id.eudeka.kelompok10.model.People;

public class PeopleRepository implements PeopleDataSource{

    private PeopleRemoteDataSource peopleRemoteDataSource;
    private PeopleLocalDataSource peopleLocalDataSource;

    public PeopleRepository(PeopleRemoteDataSource peopleRemoteDataSource,
                            PeopleLocalDataSource peopleLocalDataSource) {
        this.peopleRemoteDataSource = peopleRemoteDataSource;
        this.peopleLocalDataSource = peopleLocalDataSource;
    }

    private void getPeoplesFromRemote(final GetPeopleCallback callback){
        peopleRemoteDataSource.getAllPeople(new GetPeopleCallback() {
            @Override
            public void onPeopleLoaded(People data) {
                peopleLocalDataSource.saveDataPeople(data.getPeoples());
                callback.onPeopleLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                callback.onDataNotAvailable(errorMessage);
            }
        });
    }


    @Override
    public void getAllPeople(final GetPeopleCallback callback) {
        peopleLocalDataSource.getAllPeople(new GetPeopleCallback() {
            @Override
            public void onPeopleLoaded(People data) {
                callback.onPeopleLoaded(data);
            }

            @Override
            public void onDataNotAvailable(String errorMessage) {
                getPeoplesFromRemote(callback);
            }
        });

    }
}
