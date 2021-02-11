package com.oshrat.numberninja;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;

@SuppressWarnings("ALL")
public class launch_screen_activity extends Activity {
    private int TIMER = 3000;
    private Animation bottum;
    private LottieAnimationView ninjanim;
    private LottieAnimationView numbersanim;
    //private ImageView logo;
    Animation botAnim;
    //private TextView appname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.launch_screen);

        //botAnim = AnimationUtils.loadAnimation(this, R.anim.logo_move);
        ninjanim = findViewById(R.id.ninja_loty);
        numbersanim = findViewById(R.id.numbers_loty);
        //logo = findViewById(R.id.logo);
        numbersanim.setSpeed(1);


        //logo.setAnimation(botAnim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //logo.startAnimation(botAnim);
                //logo.setVisibility(VISIBLE);
                startActivity(intent);
                finish();
            }
    }, TIMER);
    }


}
