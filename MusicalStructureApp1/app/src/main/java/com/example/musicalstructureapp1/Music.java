package com.example.musicalstructureapp1;

class Music {

    private String mArtist;
    private String mSong;

    Music(String artist, String song) {
        mArtist = artist;
        mSong = song;
    }

    /**
     * Get the artist.
     */
    String getArtist() {
        return mArtist;
    }

    /**
     * Get the song.
     */
    String getSong() {
        return mSong;
    }
}
