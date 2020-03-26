package com.example.musicalstructureapp1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class NewReleasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of new releases
        ArrayList<com.example.musicalstructureapp1.Music> songs = new ArrayList<>();
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "After Hours"));
        songs.add(new com.example.musicalstructureapp1.Music("J. Balvin", "Colores"));
        songs.add(new com.example.musicalstructureapp1.Music("Kelsea Ballerini", "kelsea"));
        songs.add(new com.example.musicalstructureapp1.Music("Run The Jewels", "Yankee and the Brave"));
        songs.add(new com.example.musicalstructureapp1.Music("Jeremy Zucker", "Julia"));
        songs.add(new com.example.musicalstructureapp1.Music("Lauren Jauregui & Tainy", "Lento"));
        songs.add(new com.example.musicalstructureapp1.Music("Los Ángeles Azules", "20 Rosas"));
        songs.add(new com.example.musicalstructureapp1.Music("The Alchemist", "Shoot Sideways"));
        songs.add(new com.example.musicalstructureapp1.Music("Grupo Firme", "Se Veía Venir"));
        songs.add(new com.example.musicalstructureapp1.Music("Conan Gray", "Kid Krow"));

        com.example.musicalstructureapp1.MusicAdapter adapter = new com.example.musicalstructureapp1.MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}