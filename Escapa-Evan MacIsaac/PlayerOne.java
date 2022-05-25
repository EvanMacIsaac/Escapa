import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayerOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayerOne extends Actor
{   
    // This is a variable called timer in which we store the SimpleTimer object.
    SimpleTimer timer = new SimpleTimer();
    /**
     * Constructor for PlayerOne.
     * This is where initialization code for PlayerOne goes.
     */
    public PlayerOne()
    {
        // Start the timer as soon as PLayerOne is created/initialized.
        timer.mark();
    }
    /**
     * Act - do whatever the PlayerOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // displaying Timer while playing.
        double curentTime = timer.millisElapsed();
        getWorld().showText("Time elapsed: " + curentTime/1000, 150, 50);
        //diagonal Movement commands.
        if (Greenfoot.isKeyDown("left")&&Greenfoot.isKeyDown("up"))
        {
            setRotation(225);
            move(7);
        }
        
        else if(Greenfoot.isKeyDown("left")&&Greenfoot.isKeyDown("down"))
        {
            setRotation(135);
            move(7);
        }
        
        else if (Greenfoot.isKeyDown("right")&&Greenfoot.isKeyDown("up"))
        {
            setRotation(315);
            move(7);
        }
        
        else if (Greenfoot.isKeyDown("right")&&Greenfoot.isKeyDown("down"))
        {
            setRotation(45);
            move(7);
        }
        //Basic movement comands for PlayerOne.
        else if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(7);
        }
        
        else if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(7);
        }
        
        else if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(7);
        }
        
        else if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(7);
        }
        WhiteBackground whiteBackground=(WhiteBackground)getWorld();
        //when PlayerOne dies commands.
        if (isTouching(ObjectOne.class))
        {
            getWorld().showText("Game Over",400,250);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(ObjectTwo.class))
        {
            getWorld().showText("Game Over",400,250);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(ObjectThree.class))
        {
            getWorld().showText("Game Over",400,250);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(ObjectFour.class))
        {
            getWorld().showText("Game Over",400,255);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(BoarderOne.class))
        {
            getWorld().showText("Game Over",400,255);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(BoarderTwo.class))
        {
            getWorld().showText("Game Over",400,255);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(BoarderThree.class))
        {
            getWorld().showText("Game Over",400,255);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
        
        if (isTouching(BoarderFour.class))
        {
            getWorld().showText("Game Over",400,255);
            // Get the time elapsed (in milliseconds) since the last time timer.mark() was called.
            double time = timer.millisElapsed();
            // You need getWorld() here, as showText is a functionality of the world. 
            getWorld().showText("Time elapsed: " + time/1000, 400, 300);
            getWorld().removeObject(this);
            Greenfoot.stop();
            return;
        }
    }    
}
