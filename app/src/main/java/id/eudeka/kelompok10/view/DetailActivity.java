package id.eudeka.kelompok10.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import id.eudeka.kelompok10.R;

public class DetailActivity extends AppCompatActivity {

    TextView name, height, mass,hair_color,people_skin,people_eye, birth_year,gender,homeworld;
    ImageView imageView;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Detail People");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bundle = getIntent().getExtras();

        name = findViewById(R.id.name);
        height = findViewById(R.id.height);
        mass = findViewById(R.id.mass);
        hair_color = findViewById(R.id.hair_color);
        people_skin = findViewById(R.id.people_skin);
        people_eye = findViewById(R.id.people_eye);
        birth_year = findViewById(R.id.birth_year);
        gender = findViewById(R.id.gender);
        homeworld = findViewById(R.id.homeworld);

        imageView = findViewById(R.id.img_item_photo);

        Picasso.get().load("google.com")
                .placeholder(R.drawable.avatar)
                .into(imageView);



        name.setText(bundle.getString("name"));
        height.setText(bundle.getString("height"));
        mass.setText(bundle.getString("mass"));
        hair_color.setText(bundle.getString("hair_color"));
        people_skin.setText(bundle.getString(" people_skin"));
        people_eye.setText(bundle.getString(" people_eye"));
        birth_year.setText(bundle.getString("birth_year"));
        gender .setText(bundle.getString("gender"));
        homeworld.setText(bundle.getString("homeworld"));


    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
