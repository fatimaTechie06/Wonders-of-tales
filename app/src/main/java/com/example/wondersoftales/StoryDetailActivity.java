package com.example.wondersoftales;
import android.media.MediaPlayer;
import android.widget.Button;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StoryDetailActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_detail);

        // Get data
        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        int audioResId = getIntent().getIntExtra("audioResId", 0);

        Button btnPlayAudio = findViewById(R.id.btnPlayAudio);

        if (audioResId != 0) {
            mediaPlayer = MediaPlayer.create(this, audioResId);
        }

        btnPlayAudio.setOnClickListener(v -> {
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.pause();
                    btnPlayAudio.setText("Play Audio");
                } else {
                    mediaPlayer.start();
                    btnPlayAudio.setText("Pause Audio");
                }
            }
        });

        // Set views
        TextView titleView = findViewById(R.id.titleView);
        TextView contentView = findViewById(R.id.contentView);
        ImageView storyImageView = findViewById(R.id.storyImageView);

        titleView.setText(title);
        contentView.setText(content);

        if (imageResId != 0) {
            storyImageView.setImageResource(imageResId);
            storyImageView.setVisibility(ImageView.VISIBLE);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
