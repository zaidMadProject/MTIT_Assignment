package com.example.user.androidassignment;

import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnSwitch;

    private Camera camera;
    private boolean isFlashOn;
    private boolean hasFlash;
    Parameters params;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
