package com.example.danceculture.guiaturistica;

import android.graphics.Color;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DanceCulture on 18/10/17.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {

    ArrayList<Establecimiento> listDatos;
    public AdapterDatos(ArrayList<Establecimiento> listDatos) {
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);

        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {

        holder.tv3.setText(listDatos.get(position).getTipoDeEstablecimiento());
        holder.dato.setText(listDatos.get(position).getNombreDelEstablecimiento());

        holder.tvdir.setText(listDatos.get(position).getDireccion());
        holder.tvtel.setText(listDatos.get(position).getTelefonosDeContacto());

    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;
        TextView tv3;
        CardView card;

        TextView tvdir;
        TextView tvtel;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato= (TextView)itemView.findViewById(R.id.idDato);
            tv3=(TextView)itemView.findViewById(R.id.tv3);
            card=(CardView)itemView.findViewById(R.id.card);

            tvdir=(TextView)itemView.findViewById(R.id.tvdirdir);
            tvtel=(TextView)itemView.findViewById(R.id.tvtel);

        }
    }
}
