package com.oshrat.numberninja;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressWarnings("ALL")
public class GameMainActivity extends Activity implements DialogInterface.OnClickListener{
    public int Game_mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Set phone default to landscape
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//        TextView title, message;
//        Button nobtn, yesbtn;
//        title = findViewById(R.id.alert_title);
//        message = findViewById(R.id.alert_message);
//        nobtn = findViewById(R.id.btn_no);
//        yesbtn = findViewById(R.id.btn_yes);


        //Fullscreen view, no toolbar/snackbar
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        //Set size of screen in Constants Class
        Constants.SCREEN_WIDTH = metrics.widthPixels;
        Constants.SCREEN_HEIGHT = metrics.heightPixels;
//        Intent intent = getIntent();
//        Game_mode = intent.getExtras().getInt("data");



        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);


        SharedPreferences pref = this.getSharedPreferences("myPrefsKey", Context.MODE_PRIVATE);

        Constants.PREF = pref;

        setContentView(new GamePanel(this));




//        public int getGame_mode(){
//            return Game_mode;
//        };


    }
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        AlertDialog.Builder builder = new AlertDialog.Builder(GameMainActivity.this);
        View dialogView = getLayoutInflater().inflate(R.layout.alert_dialog,null);
        builder.setIcon(R.drawable.cat1);
        builder.setView(dialogView);


        builder.setView(dialogView).
                setNegativeButton(R.string.no, (DialogInterface.OnClickListener) this).
                setView(dialogView).setPositiveButton(R.string.yes, (DialogInterface.OnClickListener) this).show();
        //dialog.getWindow().setBackgroundDrawableResource(android.R.color.background_dark);
    }

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if(which== DialogInterface.BUTTON_NEGATIVE){
            Toast.makeText(this,R.string.havefun, Toast.LENGTH_SHORT).show();
        }
        if(which==DialogInterface.BUTTON_POSITIVE){
           finish();
        }

    }
}
