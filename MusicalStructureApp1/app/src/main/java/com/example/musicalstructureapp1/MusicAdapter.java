package com.example.musicalstructureapp1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<com.example.musicalstructureapp1.Music> {
    MusicAdapter(Context context, ArrayList<com.example.musicalstructureapp1.Music> songs) {
        super(context, 0, songs);
    }

    public MusicAdapter(NowPlayingActivity context, ArrayList<Music> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        com.example.musicalstructureapp1.Music currentMusic = getItem(position);

        TextView songTextView = listItemView.findViewById(R.id.song_text_view);

        assert currentMusic != null;
        songTextView.setText(currentMusic.getSong());

        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);

        artistTextView.setText(currentMusic.getArtist());

        return listItemView;
    }
}
