package com.example.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragment.adaptadores.NoticiaAdaptador;
import com.example.fragment.noticias.Noticia;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NoticiaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoticiaFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public NoticiaFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment HomeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NoticiaFragment newInstance(String param1, String param2) {
        NoticiaFragment fragment = new NoticiaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    RecyclerView rcv_noticias;
    List<Noticia> listaNoticia = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_noticia, container, false);

        rcv_noticias = view.findViewById(R.id.rcv_noticias);

        Noticia not1 = new Noticia("https://animeflash2.xyz/media/portadas/rickymorty.webp", "2013 - 7 seasons","Rick and Morty", "EEUU");
        Noticia not2 = new Noticia("https://thaka.bing.com/th/id/OIP.aUgvbh6VyGfwp7WjR-O3MgHaHa?rs=1&pid=ImgDetMain", "Mora - 2023","ESTRELLA", "PR");
        Noticia not3 = new Noticia("https://thaka.bing.com/th/id/OIP.NJOzuZNdSSK3cdHJ21SMNAHaHa?rs=1&pid=ImgDetMain", "Mora - 2022","PARAISO", "PR");
        Noticia not4 = new Noticia("https://www.diariodemexico.com/sites/default/files/inline-images/mora.jpg", "Mora - 2022","MICRODOSIS", "PR");
        Noticia not5 = new Noticia("https://thaka.bing.com/th/id/OIP.BckaV_xbjC6c3xIuSkTNkwHaHa?rs=1&pid=ImgDetMain", "Eladio Carrion - 2021","Sauce Boyz 2", "EEUU");

        listaNoticia.add(not1);
        listaNoticia.add(not2);
        listaNoticia.add(not3);
        listaNoticia.add(not4);
        listaNoticia.add(not5);
        listaNoticia.add(not1);
        listaNoticia.add(not2);
        listaNoticia.add(not3);
        listaNoticia.add(not4);
        listaNoticia.add(not5);
        listaNoticia.add(not1);
        listaNoticia.add(not2);
        listaNoticia.add(not3);
        listaNoticia.add(not4);
        listaNoticia.add(not5);

        rcv_noticias.setLayoutManager(new LinearLayoutManager(getContext()));
        rcv_noticias.setAdapter(new NoticiaAdaptador(listaNoticia));

        return view;
    }
}