import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class princesa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class princesa extends Actor
{
    public int speed =3;
    GreenfootSound poder = new GreenfootSound("poder.mp3");
     private int sTimer = 0;
    /**
     * Act - do whatever the princesa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();
    }
    public void movimento(){
             
        if (Greenfoot.isKeyDown("up")){
        this.setLocation(this.getX(),this.getY() - speed);
    } 
      if(Greenfoot.isKeyDown("down")){
         this.setLocation(this.getX(), this.getY() + speed);
        }
      if(Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX()- speed, this.getY());
        }
     if (Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX()+ speed, this.getY());
    }
    
    if (Greenfoot.isKeyDown("space")){
        sTimer++;
        poder.play(); 
        getWorld().addObject( new poder(), getX()-180, getY()+10);
    }
    else{
        if(!Greenfoot.isKeyDown("space")){
        sTimer = 0;}
    }
}
}

