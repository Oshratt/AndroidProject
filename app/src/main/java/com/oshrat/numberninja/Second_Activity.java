package com.oshrat.numberninja;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
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
    int mode_game=-1;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    SharedPreferences sp;
    //String Nickname = sp.getString("user","");


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
        sharedPreferences = getSharedPreferences("MY_APP",Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        sp = getSharedPreferences("details",MODE_PRIVATE);
        //String name = R.string.Game_Over;



//        finger_anim = AnimationUtils.loadAnimation(this, anim.R.finger_move);
//        AnimationDrawable finger_anim_draw = (AnimationDrawable)finger_animation.getDrawable();
        //finger_anim_draw.start();
        start_game = findViewById(R.id.btnStartGame);

        start_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Second_Activity.this, GameMainActivity.class);
                if((R1.isChecked()==false)&&(R2.isChecked()==false)&&(R3.isChecked()==false)&&(R4.isChecked()==false))
               {
                    Toast.makeText(Second_Activity.this,"Please select a game category", Toast.LENGTH_SHORT).show();
                }
                else {
                    editor.putBoolean("music", flag);
                    editor.putInt("mode", mode_game);
                    editor.putString("nickname",sp.getString("user",""));

                    editor.apply();

                    startActivity(intent);
                }



            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                        if (checkedId ==R1.getId() ) {
                            mode_game = 0;
                        }
                        if (checkedId ==R2.getId() ){
                            mode_game=1;
                            Log.e("hhh", ""+mode_game);
                        }
                        if (checkedId ==R3.getId() ){
                            mode_game=2;
                            Log.e("hhh", ""+mode_game);
                        }
                        if (checkedId ==R4.getId() ){
                            mode_game=3;
                            Log.e("hhh", ""+mode_game);
                        }

            }
        });


        flag = false;

        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Second_Activity.this,"ctegory 1", Toast.LENGTH_SHORT).show();
                mode_game = 0;
            }
        });
        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Second_Activity.this,"ctegory 2", Toast.LENGTH_SHORT).show();
                mode_game = 1;
            }
        });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Second_Activity.this,"ctegory 3", Toast.LENGTH_SHORT).show();
                mode_game = 2;
            }
        });
        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(Second_Activity.this,"ctegory 4", Toast.LENGTH_SHORT).show();
                mode_game = 3;
            }
        });

        MusicOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag == true)
                {
                    MusicOn.setImageResource(R.drawable.ic_volumeoff);
                    flag = false;

                }
                else {
                    MusicOn.setImageResource(R.drawable.ic_volon);
                    flag = true;
                }
            }
        });

        back_button = findViewById(R.id.btnback);
        TextView user_saved = findViewById(R.id.user_saved);

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