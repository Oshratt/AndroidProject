package com.oshrat.numberninja;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    SharedPreferences sp;
    EditText user_etd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button btnRegister;
        Button btn_continue;
        ImageView ninja_anim;


        ninja_anim = findViewById(R.id.ninja_animation);
        AnimationDrawable ninjanimation= (AnimationDrawable)ninja_anim.getDrawable();
        ninjanimation.start();
        btn_continue = findViewById(R.id.btn_continue);
        sp = getSharedPreferences("details", MODE_PRIVATE);
        user_etd= findViewById(R.id.user_etd);
                        if(sp.contains("first_run")){
                            user_etd.setText(sp.getString("user",""));
                            user_etd.setText("");

                }


//        btnRegister= findViewById(R.id.btn_register);
//        btnRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                View dialogView = getLayoutInflater().inflate(R.layout.register_dialog,null);
//                username = dialogView.findViewById(R.id.usernameEdt);
//                if(sp.getBoolean("is_new_user", false)){
//                    username.setText(sp.getString("user",""));
//                    username.setText("");
//                }
//
//
//                {
//                    builder.setView(dialogView).setPositiveButton("Register", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialog, int which) {
//                            String user = username.getText().toString();
//                            if (user.matches("")){
//
//                                Toast.makeText(MainActivity.this, "Please enter user name", Toast.LENGTH_SHORT).show();
//                            }
//                            else {
//                                Toast.makeText(MainActivity.this, "User" +username.getText().toString() + "Has register", Toast.LENGTH_SHORT).show();
//
//
//                            }
//                        }
//                    }).show();
//                }
//
//            }
//        });
        btn_continue.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String user = user_etd.getText().toString();
                if(user.matches("")){
                    Toast.makeText(MainActivity.this, R.string.enterUsername, Toast.LENGTH_SHORT).show();

                }
                else{

                    Intent intent = new Intent(MainActivity.this, Second_Activity.class);
                    startActivity(intent);

                }
            }
        });

    }
    //save the user name when we move to the second activity
    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor editor = sp.edit();
        editor.putString("user",user_etd.getText().toString());
        editor.putBoolean("first_run",false);
        editor.commit();
    }
}