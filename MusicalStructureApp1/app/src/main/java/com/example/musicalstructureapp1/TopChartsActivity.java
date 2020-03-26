package com.example.musicalstructureapp1;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class TopChartsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of words
        ArrayList<com.example.musicalstructureapp1.Music> songs = new ArrayList<com.example.musicalstructureapp1.Music>();
        songs.add(new com.example.musicalstructureapp1.Music("Roddy Ricch", "The Box"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Alone Again"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Too Late"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Hardest to Love"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Scared to Live"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Snowchild"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Escape From L.A."));
        songs.add(new com.example.musicalstructureapp1.Music("Eminem", "Godzilla (feat. Juice WRLD)"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Faith"));
        songs.add(new com.example.musicalstructureapp1.Music("The Weeknd", "Blinding Lights"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        com.example.musicalstructureapp1.MusicAdapter adapter = new com.example.musicalstructureapp1.MusicAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}