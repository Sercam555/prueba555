package com.example.vengaamipueblo2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.MoldeSitio;

import java.util.ArrayList;

public class listaSitios extends AppCompatActivity {
    ArrayList<MoldeSitio> listaSitios=new ArrayList<>();
    RecyclerView recyclerSitios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);
        recyclerSitios=findViewById(R.id.listadinamicahoteles);
        recyclerSitios.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL, false));
    }
}