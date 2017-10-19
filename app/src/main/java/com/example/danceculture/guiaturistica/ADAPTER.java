package com.example.danceculture.guiaturistica;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by DanceCulture on 19/10/17.
 */

public class ADAPTER extends RecyclerView.Adapter<ADAPTER.ViewHolderDatos> {
    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        public ViewHolderDatos(View itemView) {
            super(itemView);
        }
    }
}
