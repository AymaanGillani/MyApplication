package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer = new MediaPlayer();
    Button playpause;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.ruelle);
    }

    public void playTrack(View view){
        playpause=(Button)findViewById(R.id.playButton);
        if (mediaPlayer.isPlaying())
        {
            mediaPlayer.pause();
            playpause.setText("PLAY");
        }
        else{
            mediaPlayer.start();
            playpause.setText("PAUSE");
        }
    }

    public void pauseTrack(View view){
        mediaPlayer.pause();
    }

    public void stopTrack(View view){mediaPlayer.stop();}
}
