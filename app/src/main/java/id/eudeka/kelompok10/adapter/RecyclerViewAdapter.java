package id.eudeka.kelompok10.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.eudeka.kelompok10.R;
import id.eudeka.kelompok10.model.PeopleDetail;
import id.eudeka.kelompok10.view.DetailActivity;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<PeopleDetail> list;
    private Context context;
    String[] image;

    public RecyclerViewAdapter(List<PeopleDetail> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()
        ).inflate(R.layout.item_people, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final PeopleDetail data = list.get(i);
        viewHolder.name.setText("Name : " + data.getName());
        viewHolder.height.setText("Height : " + data.getHeight());
        viewHolder.mass.setText("Mass : " + data.getMass());

        image = context.getResources().getStringArray(R.array.hero);

        Picasso.get()
                .load(image[i])
                .placeholder(R.drawable.avatar)
                .into(viewHolder.imageView);


        viewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("name", "Name : " + data.getName());
                intent.putExtra("height", "Height : " + data.getHeight());
                intent.putExtra("mass", "Mass : " + data.getMass());
                intent.putExtra("hair_color", "Hair Color : " + data.getHairColor());
                intent.putExtra("people_skin", "Skin Color: " + data.getSkinColor());
                intent.putExtra("people_eye", "Eye Color: " + data.getEyeColor());
                intent.putExtra("birth_year", "Birth Year : " + data.getBirthYear());
                intent.putExtra("gender", "Gender: " + data.getGender());
                intent.putExtra("homeworld", "HomeWorld: " + data.getHomeworld());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView name, height, mass;
        ImageView imageView;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            height = itemView.findViewById(R.id.height);
            mass = itemView.findViewById(R.id.mass);
            imageView = itemView.findViewById(R.id.img_item_photo);
            cardView = itemView.findViewById(R.id.item_container);
        }
    }
}
