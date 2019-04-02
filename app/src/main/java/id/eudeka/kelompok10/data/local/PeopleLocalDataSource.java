package id.eudeka.kelompok10.data.local;

import android.content.Context;

import java.util.List;

import id.eudeka.kelompok10.data.PeopleDataSource;
import id.eudeka.kelompok10.model.People;
import id.eudeka.kelompok10.model.PeopleDetail;

public class PeopleLocalDataSource implements PeopleDataSource {
    private Context context;
    private PeopleDao peopleDao;

    public PeopleLocalDataSource(Context context) {
        this.context = context;
        peopleDao = PeopleDataBase.getInstance(context).peopleDao();
    }

    @Override
    public void getAllPeople(final GetPeopleCallback callback) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final List<PeopleDetail> people = peopleDao.getPeoples();
                if(people.isEmpty()){
                    callback.onDataNotAvailable("Data di database SQLite kosong");
                }else{
                    People peoples = new People(people);
                    callback.onPeopleLoaded(peoples);
                }
            }
        };
        new Thread(runnable).start();
    }

    public void saveDataPeople(final List<PeopleDetail> peopleDetail){
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                peopleDao.insertPeople(peopleDetail);
            }
        };
        new Thread(runnable).start();
    }
}
