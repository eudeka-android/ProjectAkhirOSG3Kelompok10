package id.eudeka.kelompok10;

import android.content.Context;

import id.eudeka.kelompok10.data.PeopleRepository;
import id.eudeka.kelompok10.data.local.PeopleLocalDataSource;
import id.eudeka.kelompok10.data.remote.PeopleRemoteDataSource;

public class Injection {
    public static PeopleRepository provideTeamRepository(Context context) {
        return new PeopleRepository(new PeopleRemoteDataSource(), new PeopleLocalDataSource(context));
    }
}
