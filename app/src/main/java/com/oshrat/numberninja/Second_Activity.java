package com.oshrat.numberninja;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import com.oshrat.numberninja.R;

public class Second_Activity extends Activity {
    boolean flag;
    Animation finger_anim;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondactivity);
        Button back_button;
        ImageView MusicOn;
        RadioGroup radioGroup;
        ImageView finger_animation;
        Button start_game;

        MusicOn = findViewById(R.id.volOn);
        radioGroup = findViewById(R.id.radioGroup);
        RadioButton R1 = findViewById(R.id.category1);
        RadioButton R2 = findViewById(R.id.category2);
        RadioButton R3 = findViewById(R.id.category3);
        RadioButton R4 = findViewById(R.id.category4);
        finger_animation = findViewById(R.id.finger_animation);

//        finger_anim = AnimationUtils.loadAnimation(this, anim.R.finger_move);
        AnimationDrawable finger_anim_draw = (AnimationDrawable)finger_animation.getDrawable();
        finger_anim_draw.start();
        start_game = findViewById(R.id.btnStartGame);

        start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, GameMainActivity.class);
                startActivity(intent);

            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });


        flag = false;

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Second_Activity.this,"ctegory 1", Toast.LENGTH_SHORT).show();
            }
        });

        MusicOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == false)
                {
                    MusicOn.setImageResource(R.drawable.ic_volumeoff);
                    flag = true;

                }
                else {
                    MusicOn.setImageResource(R.drawable.ic_volon);
                    flag = false;
                }
            }
        });

        back_button = findViewById(R.id.btnback);
        TextView user_saved = findViewById(R.id.user_saved);
        SharedPreferences sp= getSharedPreferences("details",MODE_PRIVATE);
        user_saved.setText("welcome " +(sp.getString("user","")));

        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}