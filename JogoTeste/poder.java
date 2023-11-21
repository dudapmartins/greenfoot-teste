import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class poder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class poder extends Actor
{   GifImage myGif = new GifImage("imgpoder.gif");
    private GreenfootSound bgMusic = new GreenfootSound("poder.mp3");
    public int temp= 110;
    /**
     * Act - do whatever the bolapoder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(myGif.getCurrentImage());
        moveAtaque();
        acertarAlvo();
    }
    public void moveAtaque()
    {
    double angle = Math.toRadians( getRotation () );
     int x =(int) Math.round(getX() - Math.cos(angle));
     int y = (int) Math.round(getY() - Math.sin(angle));
     setLocation(x,y);
    }
     public void acertarAlvo(){
       Actor a = getOneIntersectingObject(mario.class);
    
    if(a != null){
    Counter0 counter0 = (Counter0)getWorld().getObjects(Counter0.class).get(0);
    counter0.add(10);
    getWorld().removeObject(a);
    getWorld().removeObject(this);
    temp=0;
           if(temp<1){
            peachvence world = new peachvence();
            Greenfoot. setWorld(world);}
        }
}
    public void started(){
    bgMusic.playLoop();
    }
    public void stopped(){
    bgMusic.pause();
    }    
}