import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WhiteBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WhiteBackground extends World
{
    private int Timer=0;
    /**
     * Constructor for objects of class WhiteBackground.
     * 
     */
    public WhiteBackground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        
        addObject(new PlayerOne(),400, 250);
        addObject(new ObjectOne(),100,100);
        addObject(new ObjectTwo(),700,100);
        addObject(new ObjectThree(),150,400);
        addObject(new ObjectFour(),700,400);
        addObject(new BoarderOne(),0,400);
        addObject(new BoarderTwo(),800,400);
        addObject(new BoarderThree(),400,0);
        addObject(new BoarderFour(),400,500);
    }
}
