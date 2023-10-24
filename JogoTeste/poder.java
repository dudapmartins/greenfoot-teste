import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder extends Actor
{   GifImage myGif = new GifImage("podervermelho.gif");
    private GreenfootSound bgMusic = new GreenfootSound("poder.mp3");

    public void act()
    {
        setImage(myGif.getCurrentImage());
        moveAtaque();
        acertaAlvo();
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation () );
     int x =(int) Math.round(getX() - Math.cos(angle));
     int y = (int) Math.round(getY() - Math.sin(angle));
     setLocation(x,y);
    }
    public void acertaAlvo(){
       Actor a = getOneIntersectingObject(mario.class);
    
      if(a != null){
    Counter counter = (Counter)getWorld().getObjects(Counter.class).get(0);
    counter.add(10);
    getWorld().removeObject(a);
    getWorld().removeObject(this);
}
}
        public void started(){
    bgMusic.playLoop();
}
public void stopped(){
    bgMusic.pause();
}
    
}
