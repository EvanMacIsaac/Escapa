import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjectFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjectFour extends Actor
{
    int deltaX; // this variable will be used to store the change in x.
    int deltaY; // this variable will be used to store the change in y.
    /**
     * Constructor. this is where all initization for Ball goes.
     */
    public ObjectFour()
    {
        // the rate of change of the object each frame.
        deltaX=-7;
        deltaY=-7;
    }
    /**
     * Act - do whatever the ObjectFour wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        // if Ball gets too close to bottom edge, change y direction to go up. 
        if(getY() > getWorld().getHeight()-10)
        {
            deltaY=-7;
        }
        
        //if object gets too close to top edge, change y direction to go down.
        if(getY() < 10)
        {
            deltaY=7;
        }
        // if object gets too close to right edge, change x directionto go left.
        if(getX() > getWorld().getWidth()-10)
        {
            deltaX=-7;
        }
        
        //if object gets too close to left edge, change x direction to go right.
        if(getX() < 10)
        {
            deltaX=7;
        }
        setLocation(getX() + deltaX,getY() + deltaY);
    }
}