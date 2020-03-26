package com.example.musicalstructureapp1;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PodcastsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<com.example.musicalstructureapp1.Music> songs = new ArrayList<>();
        songs.add(new com.example.musicalstructureapp1.Music("The Washington Post", "Capital Weather Gang"));
        songs.add(new com.example.musicalstructureapp1.Music("MaximumFun.org", "Adam Ruins Everything"));
        songs.add(new com.example.musicalstructureapp1.Music("Exactly Right", "My Favorite Murder"));
        songs.add(new com.example.musicalstructureapp1.Music("Barstool Sports", "Carl Carlton"));
        songs.add(new com.example.musicalstructureapp1.Music("CBS News, Inc.", "Mobituaries with Mo Rocca"));
        songs.add(new com.example.musicalstructureapp1.Music("Dan Carlin", "Dan Carlin's Hardcore History"));
        songs.add(new com.example.musicalstructureapp1.Music("iHeartRadio", "Happy Face"));
        songs.add(new com.example.musicalstructureapp1.Music("Drew Monson", "Drew and Drew's Grandma Podcast"));
        songs.add(new com.example.musicalstructureapp1.Music("Sam Harris", "Making Sense"));
        songs.add(new com.example.musicalstructureapp1.Music("Tara Brach", "Tara Brach"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.musicalstructureapp1.MusicAdapter adapter = new com.example.musicalstructureapp1.MusicAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}