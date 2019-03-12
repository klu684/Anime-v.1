package com.example.kin.anime;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * Created by Kin on 12/10/2017.
 */

public class VideoActivity extends AppCompatActivity {


    VideoView videoView;
    MediaController mediaC;
    //ImageButton btnPlayPause;
    String videoURL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        //Using MediaController to allow button functionality in video player
        mediaC = new MediaController(this);
        videoView = (VideoView)findViewById(R.id.videos);

//        btnPlayPause = (ImageButton)findViewById(R.id.btn_play_pause);
//        btnPlayPause.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

               //If Statement to identify the listViewID and set String videoURL to the right online video
                if(MainActivity.postion == 0){
                    //sword art video
                    videoURL = "https://hdking.xyz/dl.php?hash=8afec2485ac7c5244fd6392be3c7d926db6bf319&format=22&id=VKyz5SVH1Ug";
                }else if (MainActivity.postion == 1){
                    //kimi no na wa video
                    videoURL = "https://hdking.xyz/dl.php?hash=512de6fc59ea895e20c40dd7cc787cbe54dfe993&format=22&id=xU47nhruN-Q";
                }else if (MainActivity.postion == 2){
                    //koe no katachi video
                    videoURL = "https://hdking.xyz/dl.php?hash=f9b0fc0bfdd2c6d781283ca6ea3c6d5fa69c816f&format=22&id=Ivrq1ZwsRps";
                }else if (MainActivity.postion == 3){
                    //wolf children video
                    videoURL = "https://hdking.xyz/dl.php?hash=c376bda227b2107656dc3c8f7c8142a8f61e0e70&format=22&id=MZpWdYruu48";
                }else if (MainActivity.postion == 4){
                    //sprited away video
                    videoURL = "https://hdking.xyz/dl.php?hash=5bd88ef789a050d2f5e4dbed6ad37203ee295e34&format=22&id=ByXuk9QqQkk";
                }else if (MainActivity.postion == 5){
                    //anohana video
                    videoURL = "https://hdking.xyz/dl.php?hash=9b478642ee79df0c9430382c4b3467279c479801&format=22&id=x8fvwC5xVGg";
                }else if (MainActivity.postion == 6){
                    //no game no life video
                    videoURL = "https://hdking.xyz/dl.php?hash=6b9036722f178e1682a9bdf420b6ea0ebf1c78d5&format=22&id=0i1AxFdlu0M";
                }

                //Starts up video
                Uri uri = Uri.parse(videoURL);
                videoView.setVideoURI(uri);
                videoView.start();
                videoView.setMediaController(mediaC);
                mediaC.setAnchorView(videoView);
//
//                try {
//                    if (!videoView.isPlaying()) {
//                        Uri uri = Uri.parse(videoURL);
//                        videoView.setVideoURI(uri);
//                        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//                            @Override
//                            public void onCompletion(MediaPlayer mediaPlayer) {
//                                btnPlayPause.setImageResource(R.drawable.ic_play);
//                            }
//                        });
//                    } else
//                    {
//                        videoView.pause();
//                        btnPlayPause.setImageResource(R.drawable.ic_play);
//                    }
//                }
//                catch (Exception ex){
//
//                }
//                videoView.requestFocus();
//                videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
//                    @Override
//                    public void onPrepared(MediaPlayer mediaPlayer) {
//                        mediaPlayer.setLooping(true);
//                        videoView.start();
//                        btnPlayPause.setImageResource(R.drawable.ic_pausse);
//                        videoView.setMediaController(mediaC);
//                        mediaC.setAnchorView(videoView);
//                    }
//
//                });
//            }`
//        });
    }
}