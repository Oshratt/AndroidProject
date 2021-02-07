package com.oshrat.numberninja;


import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Fruit implements GameObject{

    private Rect rectangle;        //Fruit object
    private int color;             //Color used for instantiating rect object
    private int scoreVal;          //Value associated to the type of fruit

    private int fruitType;         //Type of the fruit (1 - 7)

    public Fruit(int rectHeight, int color, int startX, int startY, int playerSize, int type){

        rectangle = new Rect(startX, startY, startX + playerSize, startY + rectHeight);

        this.color = color;

        this.fruitType = type;
        if(type>0&&type<100)
        {
            scoreVal=1;
        }
        if(type>=100){
            scoreVal=-1;
        }
        //Assigns scoreVal


    }

    public int getScoreVal(){
        return scoreVal;
    }

    public int getType(){

        return fruitType;

    }

    public Rect getRectangle(){

        return rectangle;

    }

    //Represents falling fruit
    public void addYVal(float y){

        rectangle.top += y;
        rectangle.bottom += y;

    }

    //Returns true if the player swipe has crossed the fruit
    public boolean collisionDetection(Player player){

        return Rect.intersects(rectangle, player.getRectangle());

    }

    @Override
    public void draw(Canvas canvas){

        Paint paint = new Paint();
        paint.setColor(color);
        canvas.drawRect(rectangle, paint);

    }

    @Override
    public void update(){ }

}
