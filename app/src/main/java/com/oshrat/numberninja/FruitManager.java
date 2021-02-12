package com.oshrat.numberninja;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.content.SharedPreferences;


import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class FruitManager  {

    //Used to assign images to the fruit rectangles
    private static BitmapFactory bf = new BitmapFactory();

    private static Bitmap FRUIT_IMAGEa1 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a1);
    private static Bitmap FRUIT_IMAGEa2 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a2);
    private static Bitmap FRUIT_IMAGEa3 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a3);
    private static Bitmap FRUIT_IMAGEa4 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a4);
    private static Bitmap FRUIT_IMAGEa5 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a5);
    private static Bitmap FRUIT_IMAGEa6 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a6);
    private static Bitmap FRUIT_IMAGEa7 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a7);
    private static Bitmap FRUIT_IMAGEa8 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a8);
    private static Bitmap FRUIT_IMAGEa9 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a9);
    private static Bitmap FRUIT_IMAGEa10 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a10);

    private static Bitmap FRUIT_IMAGEa11 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a11);
    private static Bitmap FRUIT_IMAGEa12 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a12);
    private static Bitmap FRUIT_IMAGEa13 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a13);
    private static Bitmap FRUIT_IMAGEa14 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a14);
    private static Bitmap FRUIT_IMAGEa15 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a15);
    private static Bitmap FRUIT_IMAGEa16 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a16);
    private static Bitmap FRUIT_IMAGEa17 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a17);
    private static Bitmap FRUIT_IMAGEa18 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a18);
    private static Bitmap FRUIT_IMAGEa19 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a19);
    private static Bitmap FRUIT_IMAGEa20 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a20);

    private static Bitmap FRUIT_IMAGEa21 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a21);
    private static Bitmap FRUIT_IMAGEa22 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a22);
    private static Bitmap FRUIT_IMAGEa23 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a23);
    private static Bitmap FRUIT_IMAGEa24 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a24);
    private static Bitmap FRUIT_IMAGEa25 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a25);
    private static Bitmap FRUIT_IMAGEa26 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a26);
    private static Bitmap FRUIT_IMAGEa27 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a27);
    private static Bitmap FRUIT_IMAGEa28 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a28);
    private static Bitmap FRUIT_IMAGEa29 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a29);
    private static Bitmap FRUIT_IMAGEa30 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a30);

    private static Bitmap FRUIT_IMAGEa31 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a31);
    private static Bitmap FRUIT_IMAGEa32 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a32);
    private static Bitmap FRUIT_IMAGEa33 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a33);
    private static Bitmap FRUIT_IMAGEa34 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a34);
    private static Bitmap FRUIT_IMAGEa35 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a35);
    private static Bitmap FRUIT_IMAGEa36 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a36);
    private static Bitmap FRUIT_IMAGEa37 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a37);
    private static Bitmap FRUIT_IMAGEa38 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a38);
    private static Bitmap FRUIT_IMAGEa39 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a39);
    private static Bitmap FRUIT_IMAGEa40 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a40);

    private static Bitmap FRUIT_IMAGEa41 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a41);
    private static Bitmap FRUIT_IMAGEa42 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a42);
    private static Bitmap FRUIT_IMAGEa43 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a43);
    private static Bitmap FRUIT_IMAGEa44 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a44);
    private static Bitmap FRUIT_IMAGEa45 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a45);
    private static Bitmap FRUIT_IMAGEa46 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a46);
    private static Bitmap FRUIT_IMAGEa47 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a47);
    private static Bitmap FRUIT_IMAGEa48 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a48);
    private static Bitmap FRUIT_IMAGEa49 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a49);
    private static Bitmap FRUIT_IMAGEa50 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a50);

    private static Bitmap FRUIT_IMAGEa51 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a51);
    private static Bitmap FRUIT_IMAGEa52 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a52);
    private static Bitmap FRUIT_IMAGEa53 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a53);
    private static Bitmap FRUIT_IMAGEa54 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a54);
    private static Bitmap FRUIT_IMAGEa55 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a55);
    private static Bitmap FRUIT_IMAGEa56 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a56);
    private static Bitmap FRUIT_IMAGEa57 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a57);
    private static Bitmap FRUIT_IMAGEa58 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a58);
    private static Bitmap FRUIT_IMAGEa59 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a59);
    private static Bitmap FRUIT_IMAGEa60 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a60);

    private static Bitmap FRUIT_IMAGEa61 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a61);
    private static Bitmap FRUIT_IMAGEa62 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a62);
    private static Bitmap FRUIT_IMAGEa63 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a63);
    private static Bitmap FRUIT_IMAGEa64 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a64);
    private static Bitmap FRUIT_IMAGEa65 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a65);
    private static Bitmap FRUIT_IMAGEa66 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a66);
    private static Bitmap FRUIT_IMAGEa67 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a67);
    private static Bitmap FRUIT_IMAGEa68 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a68);
    private static Bitmap FRUIT_IMAGEa69 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a69);
    private static Bitmap FRUIT_IMAGEa70 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a70);

    private static Bitmap FRUIT_IMAGEa71 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a71);
    private static Bitmap FRUIT_IMAGEa72 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a72);
    private static Bitmap FRUIT_IMAGEa73 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a73);
    private static Bitmap FRUIT_IMAGEa74 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a74);
    private static Bitmap FRUIT_IMAGEa75 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a75);
    private static Bitmap FRUIT_IMAGEa76 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a76);
    private static Bitmap FRUIT_IMAGEa77 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a77);
    private static Bitmap FRUIT_IMAGEa78 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a78);
    private static Bitmap FRUIT_IMAGEa79 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a79);
    private static Bitmap FRUIT_IMAGEa80 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a80);

    private static Bitmap FRUIT_IMAGEa81 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a81);
    private static Bitmap FRUIT_IMAGEa82 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a82);
    private static Bitmap FRUIT_IMAGEa83 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a83);
    private static Bitmap FRUIT_IMAGEa84 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a84);
    private static Bitmap FRUIT_IMAGEa85 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a85);
    private static Bitmap FRUIT_IMAGEa86 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a86);
    private static Bitmap FRUIT_IMAGEa87 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a87);
    private static Bitmap FRUIT_IMAGEa88 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a88);
    private static Bitmap FRUIT_IMAGEa89 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a89);
    private static Bitmap FRUIT_IMAGEa90 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a90);

    private static Bitmap FRUIT_IMAGEa91 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a91);
    private static Bitmap FRUIT_IMAGEa92 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a92);
    private static Bitmap FRUIT_IMAGEa93 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a93);
    private static Bitmap FRUIT_IMAGEa94 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a94);
    private static Bitmap FRUIT_IMAGEa95 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a95);
    private static Bitmap FRUIT_IMAGEa96 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a96);
    private static Bitmap FRUIT_IMAGEa97 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a97);
    private static Bitmap FRUIT_IMAGEa98 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a98);
    private static Bitmap FRUIT_IMAGEa99 = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.a99);
    private static Bitmap FRUIT_IMAGEBoomb = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.boomb);
    private static Bitmap FRUIT_IMAGEYBoomb = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.yellowboomb);
    private static Bitmap FRUIT_IMAGEBlueBoomb = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.blueboomb);




    private static Bitmap BOMB_IMAGE = bf.decodeResource(Constants.CURRENT_CONTEXT.getResources(), R.drawable.boomb);

    //Instantiate sound clips
    private static MediaPlayer BOMB_NOISE = MediaPlayer.create(Constants.CURRENT_CONTEXT, R.raw.bomb);
    private static MediaPlayer MISSED = MediaPlayer.create(Constants.CURRENT_CONTEXT, R.raw.failmusic);
    private static MediaPlayer FRUIT1 = MediaPlayer.create(Constants.CURRENT_CONTEXT, R.raw.slice3);
    private static MediaPlayer FRUIT2 = MediaPlayer.create(Constants.CURRENT_CONTEXT, R.raw.slice4);

    private ArrayList<Fruit> fruits;  //Array of fruits currently on screen
    //int arraytest[]={R.drawable.a0,R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,R.drawable.a21,R.drawable.a22,R.drawable.a23,R.drawable.a24,R.drawable.a25,R.drawable.a26,R.drawable.a27,R.drawable.a28,R.drawable.a29,R.drawable.a30,R.drawable.a31,R.drawable.a32,R.drawable.a33,R.drawable.a34,R.drawable.a35,R.drawable.a36,R.drawable.a37,R.drawable.a38,R.drawable.a39,R.drawable.a40,R.drawable.a41,R.drawable.a42,R.drawable.a43,R.drawable.a44,R.drawable.a45,R.drawable.a46,R.drawable.a47,R.drawable.a48,R.drawable.a49,R.drawable.a50,R.drawable.a51,R.drawable.a52,R.drawable.a53,R.drawable.a54,R.drawable.a55,R.drawable.a56,R.drawable.a57,R.drawable.a58,R.drawable.a59,R.drawable.a60,R.drawable.a61,R.drawable.a62,R.drawable.a63,R.drawable.a64,R.drawable.a65,R.drawable.a66,R.drawable.a67,R.drawable.a68,R.drawable.a69,R.drawable.a70,R.drawable.a71,R.drawable.a72,R.drawable.a73,R.drawable.a74,R.drawable.a75,R.drawable.a75,R.drawable.a76,R.drawable.a77,R.drawable.a78,R.drawable.a79,R.drawable.a80,R.drawable.a81,R.drawable.a82,R.drawable.a83,R.drawable.a84,R.drawable.a85,R.drawable.a86,R.drawable.a87,R.drawable.a88,R.drawable.a89,R.drawable.a90,R.drawable.a91,R.drawable.a92,R.drawable.a93,R.drawable.a94,R.drawable.a95,R.drawable.a96,R.drawable.a97,R.drawable.a98,R.drawable.a99,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb,R.drawable.boomb,R.drawable.blue_b,R.drawable.yellowboomb};


    private int fruitLocation;        //Location of falling fruit
    private int playerSize;           //Size of the user's swipe space
    private int fruitHeight;          //Height of the fruit rectangle
    private int color;

    SharedPreferences sharedPreferences ;
    Context mcontext;
    Boolean music=false;


    //int TypeGameMode ;
    //int idName = sharedPreferences.getInt("mode_game", 0); //0 is the default value.
    //private int idName = Constants.PREF.getInt("mode", 0);

    private int idName;



    private int highScore = Constants.PREF.getInt("key", 0);

    private int misses = 0;           //Number of fruit not sliced

    private Random rand = new Random();

    private long start;
    private long initialization;








    int score= 0;


    public FruitManager(int playerSize, int fruitLocation, int fruitHeight, int color ,Context context){
        mcontext = context;
//        SharedPreferences prefs = getSharedPreferences("progress", MODE_PRIVATE);
//
//        TypeGameMode = prefs.getInt("mode_game", 0); //0 is the default value.        TypeGameMode = idName;
        sharedPreferences =  mcontext.getSharedPreferences("MY_APP",Context.MODE_PRIVATE);
        fruits = new ArrayList<>();

        this.fruitLocation = fruitLocation;
        this.playerSize = playerSize;
        this.fruitHeight = fruitHeight;
        this.color = color;

        if(sharedPreferences.getInt("mode",0)!=-1)
        {
            idName=sharedPreferences.getInt("mode",0);
            music=sharedPreferences.getBoolean("music",true);
        }

        start = initialization = System.currentTimeMillis();

        //Add fruit to the array
        populateFruits();

    }

    public int getScore(){

        return score;

    }

    public boolean collisionDetection(Player player){

        //Check each fruit on screen for detection
        for(Fruit f : fruits){


            if(f.collisionDetection(player)){
                if (fruits.get(fruits.size() - 1).getType() < 100)
                {
                    if (idName == 0) {
                        if (f.getType()%2 == 0) {
                            if(music==true) {
                                MISSED.start();
                            }
                            misses++;
                        }
                    }
                    if (idName == 1) {
                        if (f.getType()%2 == 1) {
                            if(music==true) {
                                MISSED.start();
                            }
                            misses++;
                        }
                    }
                    if (idName == 2) {
                        if (f.getType()%3 == 0) {
                            if(music==true) {
                                MISSED.start();
                            }
                            misses++;
                        }
                    }
                    if (idName == 3) {
                        if (f.getType()%7 == 0) {
                            if(music==true) {
                                MISSED.start();
                            }
                            misses++;

                        }
                    }
                }
                //Game over, hit a bomb
                if(f.getType() >= 100) {
                    if(music==true){
                    BOMB_NOISE.start();}
                    else
                    return true;

                }
                if(misses == 3){ return true; }


                //Determine a noise to play for slicing the fruit
                int val = rand.nextInt(2 - 1) + 1;

                if(val == 1)
                {
                    if(music==true) {
                        FRUIT1.start();
                    }
                }
                else{
                    if(music==true){
                    FRUIT2.start(); }
                }

                //Increment score
                score += f.getScoreVal();

                //Remove from the arraylist
                fruits.remove(f);

            }

        }

        return false;

    }

    //Assigns next falling fruit to a random type
    //Based on percentage rarity
    private int determineFruitType(){

        int val = rand.nextInt(114 - 1) + 1;
        int type ;
        if(val >= 100)
            type = -1;



        return val;
    }

    private void populateFruits(){

        //Starting Y position for the fruit
        int currentY = -5 * Constants.SCREEN_HEIGHT / 4;

        while(currentY < 0){

            //Determine where horizontally to place the fruit
            int xStart = (int)(Math.random() * (Constants.SCREEN_WIDTH - playerSize));

            //Determines which type of fruit is spawned
            int type = determineFruitType();

            //Add to the array list
            fruits.add(new Fruit(fruitHeight, color, xStart, currentY, playerSize, type));
            currentY += fruitHeight + fruitLocation;

        }

    }

    public boolean update(){

        int timeElapsed = (int)(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();

        //Determine fall speed of the fruit
        //Value gets larger as the game progresses
        float speed = (float)(Math.sqrt(1 + (start - initialization)/ 1000.0)) * Constants.SCREEN_HEIGHT / 10000.0f;

        //Add y value to each fruit on the screen
        for(Fruit fruit : fruits){

            fruit.addYVal(speed * timeElapsed);

        }

        //Fruit has made it to the bottom of the screen, add a strike to the count
        if(fruits.get(fruits.size()-1).getRectangle().top >= Constants.SCREEN_HEIGHT){


            //Fruit isn't a bomb, mark a penalty

            if (fruits.get(fruits.size() - 1).getType() < 100)
            {
                if (idName == 0) {
                    if (fruits.get(fruits.size() - 1).getType() % 2 != 0) {
                        if(music==true) {
                            MISSED.start();
                        }
                        misses++;
                    }
                }
                if (idName == 1) {
                    if (fruits.get(fruits.size() - 1).getType() % 2 != 1) {
                        if(music==true) {
                            MISSED.start();
                        }
                        misses++;
                    }
                }
                if (idName == 2) {
                    if (fruits.get(fruits.size() - 1).getType() % 3 != 0) {
                        if(music==true) {
                            MISSED.start();
                        }
                        misses++;
                    }
                }
                if (idName == 3) {
                    if (fruits.get(fruits.size() - 1).getType() % 7 != 0) {
                        if(music==true) {
                            MISSED.start();
                        }
                        misses++;

                    }
                }
            }



            //Game Over
            if(misses == 3){ return true; }

            //Remove from the array list
            fruits.remove(fruits.get(fruits.size()-1));

        }

        //Add a new fruit to be spawned
        int type = determineFruitType();

        int xStart = (int)(Math.random() * (Constants.SCREEN_WIDTH - playerSize));

        fruits.add(0, new Fruit(fruitHeight, color, xStart,
                fruits.get(0).getRectangle().top - fruitHeight - fruitLocation,
                playerSize, type));

        return false;

    }

    public void draw(Canvas canvas){

        Bitmap photo = null;

        for(Fruit fruit : fruits){

            fruit.draw(canvas);
            //Assigns correct image to fruit based on type
            switch(fruit.getType()){

                case 1:
                    photo = FRUIT_IMAGEa1;
                    break;
                case 2:
                    photo = FRUIT_IMAGEa2;
                    break;
                case 3:
                    photo = FRUIT_IMAGEa3;
                    break;
                case 4:
                    photo = FRUIT_IMAGEa4;
                    break;
                case 5:
                    photo = FRUIT_IMAGEa5;
                    break;
                case 6:
                    photo = FRUIT_IMAGEa6;
                    break;
                case 7:
                    photo = FRUIT_IMAGEa7;
                    break;
                case 8:
                    photo = FRUIT_IMAGEa8;
                    break;
                case 9:
                    photo = FRUIT_IMAGEa9;
                    break;
                case 10:
                    photo = FRUIT_IMAGEa10;
                    break;
                case 11:
                    photo = FRUIT_IMAGEa11;
                    break;
                case 12:
                    photo = FRUIT_IMAGEa12;
                    break;
                case 13:
                    photo = FRUIT_IMAGEa13;
                    break;
                case 14:
                    photo = FRUIT_IMAGEa14;
                    break;
                case 15:
                    photo = FRUIT_IMAGEa15;
                    break;
                case 16:
                    photo = FRUIT_IMAGEa16;
                    break;
                case 17:
                    photo = FRUIT_IMAGEa17;
                    break;
                case 18:
                    photo = FRUIT_IMAGEa18;
                    break;
                case 19:
                    photo = FRUIT_IMAGEa19;
                    break;
                case 20:
                    photo = FRUIT_IMAGEa20;
                    break;
                case 21:
                    photo = FRUIT_IMAGEa21;
                    break;
                case 22:
                    photo = FRUIT_IMAGEa22;
                    break;
                case 23:
                    photo = FRUIT_IMAGEa23;
                    break;
                case 24:
                    photo = FRUIT_IMAGEa24;
                    break;
                case 25:
                    photo = FRUIT_IMAGEa25;
                    break;
                case 26:
                    photo = FRUIT_IMAGEa26;
                    break;
                case 27:
                    photo = FRUIT_IMAGEa27;
                    break;
                case 28:
                    photo = FRUIT_IMAGEa28;
                    break;
                case 29:
                    photo = FRUIT_IMAGEa29;
                    break;
                case 30:
                    photo = FRUIT_IMAGEa30;
                    break;
                case 31:
                    photo = FRUIT_IMAGEa31;
                    break;
                case 32:
                    photo = FRUIT_IMAGEa32;
                    break;
                case 33:
                    photo = FRUIT_IMAGEa33;
                    break;
                case 34:
                    photo = FRUIT_IMAGEa34;
                    break;
                case 35:
                    photo = FRUIT_IMAGEa35;
                    break;
                case 36:
                    photo = FRUIT_IMAGEa36;
                    break;
                case 37:
                    photo = FRUIT_IMAGEa37;
                    break;
                case 38:
                    photo = FRUIT_IMAGEa38;
                    break;
                case 39:
                    photo = FRUIT_IMAGEa39;
                    break;
                case 40:
                    photo = FRUIT_IMAGEa40;
                    break;
                case 41:
                    photo = FRUIT_IMAGEa41;
                    break;
                case 42:
                    photo = FRUIT_IMAGEa42;
                    break;
                case 43:
                    photo = FRUIT_IMAGEa43;
                    break;
                case 44:
                    photo = FRUIT_IMAGEa44;
                    break;
                case 45:
                    photo = FRUIT_IMAGEa45;
                    break;
                case 46:
                    photo = FRUIT_IMAGEa46;
                    break;
                case 47:
                    photo = FRUIT_IMAGEa47;
                    break;
                case 48:
                    photo = FRUIT_IMAGEa48;
                    break;
                case 49:
                    photo = FRUIT_IMAGEa49;
                    break;
                case 50:
                    photo = FRUIT_IMAGEa50;
                    break;
                case 51:
                    photo = FRUIT_IMAGEa51;
                    break;
                case 52:
                    photo = FRUIT_IMAGEa52;
                    break;
                case 53:
                    photo = FRUIT_IMAGEa53;
                    break;
                case 54:
                    photo = FRUIT_IMAGEa54;
                    break;
                case 56:
                    photo = FRUIT_IMAGEa56;
                    break;
                case 57:
                    photo = FRUIT_IMAGEa57;
                    break;
                case 58:
                    photo = FRUIT_IMAGEa58;
                    break;
                case 59:
                    photo = FRUIT_IMAGEa59;
                    break;
                case 60:
                    photo = FRUIT_IMAGEa60;
                    break;
                case 61:
                    photo = FRUIT_IMAGEa61;
                    break;
                case 62:
                    photo = FRUIT_IMAGEa62;
                    break;
                case 63:
                    photo = FRUIT_IMAGEa63;
                    break;
                case 64:
                    photo = FRUIT_IMAGEa64;
                    break;
                case 65:
                    photo = FRUIT_IMAGEa65;
                    break;
                case 66:
                    photo = FRUIT_IMAGEa66;
                    break;
                case 67:
                    photo = FRUIT_IMAGEa67;
                    break;
                case 68:
                    photo = FRUIT_IMAGEa68;
                    break;
                case 69:
                    photo = FRUIT_IMAGEa69;
                    break;
                case 70:
                    photo = FRUIT_IMAGEa70;
                    break;
                case 71:
                    photo = FRUIT_IMAGEa71;
                    break;
                case 72:
                    photo = FRUIT_IMAGEa72;
                    break;
                case 73:
                    photo = FRUIT_IMAGEa73;
                    break;
                case 74:
                    photo = FRUIT_IMAGEa74;
                    break;
                case 75:
                    photo = FRUIT_IMAGEa75;
                    break;
                case 76:
                    photo = FRUIT_IMAGEa76;
                    break;
                case 77:
                    photo = FRUIT_IMAGEa77;
                    break;
                case 78:
                    photo = FRUIT_IMAGEa78;
                    break;
                case 79:
                    photo = FRUIT_IMAGEa79;
                    break;
                case 80:
                    photo = FRUIT_IMAGEa80;
                    break;
                case 81:
                    photo = FRUIT_IMAGEa81;
                    break;
                case 82:
                    photo = FRUIT_IMAGEa82;
                    break;
                case 83:
                    photo = FRUIT_IMAGEa83;
                    break;
                case 84:
                    photo = FRUIT_IMAGEa84;
                    break;
                case 85:
                    photo = FRUIT_IMAGEa85;
                    break;
                case 86:
                    photo = FRUIT_IMAGEa86;
                    break;
                case 87:
                    photo = FRUIT_IMAGEa87;
                    break;
                case 88:
                    photo = FRUIT_IMAGEa88;
                    break;
                case 89:
                    photo = FRUIT_IMAGEa89;
                    break;
                case 90:
                    photo = FRUIT_IMAGEa90;
                    break;
                case 91:
                    photo = FRUIT_IMAGEa91;
                    break;
                case 92:
                    photo = FRUIT_IMAGEa92;
                    break;
                case 93:
                    photo = FRUIT_IMAGEa93;
                    break;
                case 94:
                    photo = FRUIT_IMAGEa94;
                    break;
                case 95:
                    photo = FRUIT_IMAGEa95;
                    break;
                case 96:
                    photo = FRUIT_IMAGEa96;
                    break;
                case 97:
                    photo = FRUIT_IMAGEa97;
                    break;
                case 98:
                    photo = FRUIT_IMAGEa98;
                    break;
                case 99:
                    photo = FRUIT_IMAGEa99;
                    break;
                case 100:
                    photo = FRUIT_IMAGEBoomb;
                    break;
                case 101:
                    photo = FRUIT_IMAGEBoomb;
                    break;
                case 102:
                    photo = FRUIT_IMAGEBoomb;
                    break;
                case 103:
                    photo = FRUIT_IMAGEBlueBoomb;
                    break;
                case 104:
                    photo = FRUIT_IMAGEBlueBoomb;
                    break;
                case 105:
                    photo = FRUIT_IMAGEBlueBoomb;
                    break;
                case 106:
                    photo = FRUIT_IMAGEBlueBoomb;
                    break;
                case 107:
                    photo = FRUIT_IMAGEBlueBoomb;
                    break;
                case 108:
                    photo = FRUIT_IMAGEBoomb;
                    break;
                case 109:
                    photo = FRUIT_IMAGEBoomb;
                    break;
                case 110:
                    photo = FRUIT_IMAGEYBoomb;
                    break;
                case 111:
                    photo = FRUIT_IMAGEYBoomb;
                    break;
                case 112:
                    photo = FRUIT_IMAGEYBoomb;
                    break;
                case 113:
                    photo = FRUIT_IMAGEYBoomb;
                    break;
                case 114:
                    photo = FRUIT_IMAGEYBoomb;
                    break;



            }

            canvas.drawBitmap(photo, null, fruit.getRectangle(), new Paint());

        }

        //Represents score
        Paint p = new Paint();
        p.setTextSize(100);
        p.setColor(Color.BLACK);

       // canvas.drawText(getResources().getString(R.string.scorebtn) + score, 50, 50 + p.descent() - p.ascent(), p);
        canvas.drawText(Constants.CURRENT_CONTEXT.getResources().getString(R.string.scorebtn) + score, 50, 50 + p.descent() - p.ascent(), p);


        Paint pH = new Paint();
        pH.setTextSize(100);
        pH.setColor(Color.BLACK);

        //canvas.drawText (getResources().get + highScore, Constants.SCREEN_WIDTH - 750, 50 + pH.descent() - pH.ascent(), pH);
        canvas.drawText(Constants.CURRENT_CONTEXT.getResources().getString(R.string.HighSbtn) + highScore,  Constants.SCREEN_WIDTH - 750, 50 + pH.descent() - pH.ascent(), pH);

        //Number of misses
        if(misses == 1) {
            Paint p1 = new Paint();
            p1.setTextSize(100);
            p1.setFakeBoldText(true);
            p1.setColor(Color.RED);
            canvas.drawText("X", 50, 200 + p1.descent() - p1.ascent(), p1);
        }else if(misses == 2){
            Paint p1 = new Paint();
            p1.setTextSize(100);
            p1.setFakeBoldText(true);
            p1.setColor(Color.RED);
            canvas.drawText("X X", 50, 200 + p1.descent() - p1.ascent(), p1);
        }else if(misses == 3){
            Paint p1 = new Paint();
            p1.setTextSize(100);
            p1.setFakeBoldText(true);
            p1.setColor(Color.RED);
            canvas.drawText("X X X", 50, 200 + p1.descent() - p1.ascent(), p1);
        }


    }
}
