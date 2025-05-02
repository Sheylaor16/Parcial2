package com.example.fragment.adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fragment.R;
import com.example.fragment.noticias.Noticia;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NoticiaAdaptador extends RecyclerView.Adapter<NoticiaAdaptador.ViewHolder> {

    private List<Noticia> datos;

    public NoticiaAdaptador(List<Noticia> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public NoticiaAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_noticia,parent,false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull NoticiaAdaptador.ViewHolder holder, int position) {
        Noticia dato = datos.get(position);
        holder.bind(dato);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_titulo_noticia, txt_descrpcion_noticia;
        ImageView ing_noticia;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_titulo_noticia = itemView.findViewById(R.id.txt_titulo_noticia);
            txt_descrpcion_noticia = itemView.findViewById(R.id.txt_descripcion_noticia);
            ing_noticia = itemView.findViewById(R.id.ing_noticia);
        }

        public void bind(Noticia dato){
            txt_titulo_noticia.setText(dato.getTitulo());
            txt_descrpcion_noticia.setText(dato.getDescripcion());
            Picasso.get().load(dato.getImagen()).into(ing_noticia);
        }
    }
}
