package com.coderunners.spoofify;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySong;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_player);
        mySong = MediaPlayer.create(MainActivity.this, R.raw.chainsmokers);
    }

    public void playIt(View v)
    {
        mySong.start();
    }

    public void pauseIt(View v)
    {
        mySong.stop();
    }

    public void prevSongIt(View v)
    {
        ArrayList<Integer> playlist = new ArrayList<>();


        playlist.add(R.raw.dura);
        mySong.stop();
        mySong = MediaPlayer.create(this, playlist.get(0));
        mySong.start();
    }

    public void skipIt(View v)
    {
        mySong.stop();
//        mySong = MediaPlayer.create(MainActivity.this, R.raw.dura);
//        mySong.start();
    }
}
