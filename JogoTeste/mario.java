import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mario extends Actor
{ 
    public int speed =3;
    GreenfootSound poder = new GreenfootSound("poder.mp3");
     private int sTimer = 0;
     public int tempo=50;
    /**
     * Act - do whatever the mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        movimento();
    }
       public void movimento(){
             
        if (Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(),this.getY() - speed);
    } 
      if(Greenfoot.isKeyDown("s")){
         this.setLocation(this.getX(), this.getY() + speed);
        }
      if(Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX()- speed, this.getY());
        }
     if (Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX()+ speed, this.getY());
    }
    
    if (Greenfoot.isKeyDown("e")){
        sTimer++;
        poder.play(); 
        getWorld().addObject( new bolapoder(), getX()-18, getY()-10);
    }   
   // }
    else{
        if(!Greenfoot.isKeyDown("e")){
        sTimer = 0;}
    }
}
}
