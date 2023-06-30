package com.example.myapplicationlistapersonalizada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.example.myapplicationlistapersonalizada.Adaptadores.AdaptadorNoticias;
import com.example.myapplicationlistapersonalizada.Modelos.Noticia;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //data
        Noticia[] noticias =
                new Noticia[]{
                        new Noticia("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                        new Noticia("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                        new Noticia("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                        new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4"),
                        new Noticia("Noticia 5", "SubNoticia Contenido Contenido Contenido Contenido 5"),
                        new Noticia("Noticia 6", "SubNoticia Contenido Contenido Contenido Contenido 6"),
                        new Noticia("Noticia 7", "SubNoticia Contenido Contenido Contenido Contenido 7"),
                        new Noticia("Noticia 8", "SubNoticia Contenido Contenido Contenido Contenido 8"),
                        new Noticia("Noticia 9", "SubNoticia Contenido Contenido Contenido Contenido 9"),
                        new Noticia("Noticia 10", "SubNoticia Contenido Contenido Contenido Contenido 10")};
        //adaptador
        AdaptadorNoticias adaptadornoticias = new AdaptadorNoticias(this, noticias);
        //vista
        ListView lstOpciones = (ListView)findViewById(R.id.lstListaNoticia);
        //agregamos el titulo
        View header = getLayoutInflater().inflate(R.layout.lyheadernoticia, null);
        lstOpciones.addHeaderView(header);
        lstOpciones.setAdapter(adaptadornoticias);



}
}