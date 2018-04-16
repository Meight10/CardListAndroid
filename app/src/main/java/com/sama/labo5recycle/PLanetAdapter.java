package com.sama.labo5recycle;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by uca on 04-16-18.
 */

public class PLanetAdapter extends RecyclerView.Adapter<PLanetAdapter.PlanetViewHolder>{

    Context ctx;
    List<Planetas>planetList;

    public PLanetAdapter(Context ctx, List<Planetas> planetList) {
        this.ctx = ctx;
        this.planetList = planetList;
    }

    //Designar que viewHolder vamos a pasar
    @Override
    public PlanetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctx);

        View v = inflater.inflate(R.layout.activity_cardview, null);

        return new PlanetViewHolder(v);
    }


    //llenar el viewHolder
    @Override
    public void onBindViewHolder(PlanetViewHolder holder, int position) {

        holder.titleTextView.setText(planetList.get(position).getNombre());
        holder.descriptionTextView.setText(planetList.get(position).getDescripcion());

    }

    @Override
    public int getItemCount() {
        return planetList.size();
    }


    protected class PlanetViewHolder extends RecyclerView.ViewHolder{

        TextView titleTextView, descriptionTextView;

        public PlanetViewHolder(View itemView){
            super(itemView);

            titleTextView = itemView.findViewById(R.id.title);
            descriptionTextView = itemView.findViewById(R.id.description);
        }

    }


}
