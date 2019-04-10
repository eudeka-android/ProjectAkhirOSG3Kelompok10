package id.eudeka.kelompok10.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import id.eudeka.kelompok10.Injection;
import id.eudeka.kelompok10.R;
import id.eudeka.kelompok10.adapter.RecyclerViewAdapter;
import id.eudeka.kelompok10.model.PeopleDetail;
import id.eudeka.kelompok10.navigator.PeopleNavigator;
import id.eudeka.kelompok10.viewmodel.PeopleViewModel;

public class MainActivity extends AppCompatActivity implements PeopleNavigator {

    private PeopleViewModel peopleViewModel;
    private RecyclerView recyclerView;

    private RecyclerViewAdapter adapter;
    private List<PeopleDetail> listAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        peopleViewModel = new PeopleViewModel(Injection.provideTeamRepository(this), this);
        listAll = new ArrayList<>();
        peopleViewModel.setNavigator(this);
        peopleViewModel.getListPeople();
        initAdapter();
    }

    private void initAdapter() {
        adapter = new RecyclerViewAdapter(listAll);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,   DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void loadListPeople(List<PeopleDetail> list) {
        listAll.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void errorLoadListPeople(String message) {
        Log.e("ERROR", message);
    }

}
