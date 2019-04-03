package id.eudeka.kelompok10.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import id.eudeka.kelompok10.R;
import id.eudeka.kelompok10.model.PeopleDetail;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<PeopleDetail> list;

    public RecyclerViewAdapter(List<PeopleDetail> list) {
        this.list = list;
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

        PeopleDetail data = list.get(i);
        viewHolder.name.setText(data.getName());
        viewHolder.height.setText(data.getHeight());
        viewHolder.mass.setText(data.getMass());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView name, height, mass;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            height = itemView.findViewById(R.id.height);
            mass = itemView.findViewById(R.id.mass);

        }
    }
}
