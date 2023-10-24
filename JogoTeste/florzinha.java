import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class florzinha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class florzinha extends Actor
{   GifImage myGif = new GifImage("florzinha.gif");
    /**
     * Act - do whatever the florzinha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setImage(myGif.getCurrentImage());
    }
}
