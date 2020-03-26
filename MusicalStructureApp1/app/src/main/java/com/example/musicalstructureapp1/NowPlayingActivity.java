package com.example.musicalstructureapp1;

import android.os.Bundle;
import android.widget.ListView;
import com.example.musicalstructureapp1.R;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<com.example.musicalstructureapp1.Music> songs = new ArrayList<>();
        songs.add(new com.example.musicalstructureapp1.Music("ATC", "Around the World"));
        songs.add(new com.example.musicalstructureapp1.Music("Beach Boys", "Catch a Wave"));
        songs.add(new com.example.musicalstructureapp1.Music("Billy Idol", "Mony Mony"));
        songs.add(new com.example.musicalstructureapp1.Music("Carl Carlton", "Everlasting Love"));
        songs.add(new com.example.musicalstructureapp1.Music("Duran Duran", "Ordinary World"));
        songs.add(new com.example.musicalstructureapp1.Music("Jo Dee Messina", "You're Not in Kansas Anymore"));
        songs.add(new com.example.musicalstructureapp1.Music("Lifehouse", "Hangin' by a Moment"));
        songs.add(new com.example.musicalstructureapp1.Music("Madonna", "Lucky Star"));
        songs.add(new com.example.musicalstructureapp1.Music("Matchbox 20", "If You're Gone"));
        songs.add(new com.example.musicalstructureapp1.Music("Vertical Horizon", "Everything You Want"));

        com.example.musicalstructureapp1.MusicAdapter adapter = new com.example.musicalstructureapp1.MusicAdapter(this, songs);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}