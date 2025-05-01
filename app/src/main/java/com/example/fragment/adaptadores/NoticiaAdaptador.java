package com.example.fragment.adaptadores;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.noticias.Noticia;

import java.util.List;

public class NoticiaAdaptador extends RecyclerView.Adapter<NoticiaAdaptador.ViewMolder> {

    private List<NoticiaAdaptador> datos;

    public NoticiaAdaptador(List<Noticia> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public NoticiaAdaptador.ViewMolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoticiaAdaptador.ViewMolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
