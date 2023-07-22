package com.example.vengaamipueblo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.MoldeRestaurante;

import java.util.ArrayList;

public class listaRestaurante extends AppCompatActivity {
    ArrayList<MoldeRestaurante> listaRestaurante=new ArrayList<>();
    RecyclerView recyclerRestaurante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
    }
}