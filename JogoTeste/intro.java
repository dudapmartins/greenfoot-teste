import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public void act() {
        if (Greenfoot.isKeyDown("enter")){
            setBackground( new GreenfootImage("2.png"));
            
        }
         
     
        if (Greenfoot.isKeyDown("c")){
            setBackground( new GreenfootImage("3.png"));
            
        }
      
         if (Greenfoot.isKeyDown("b")){
            setBackground( new GreenfootImage("4.png"));
            
        }
   
       if (Greenfoot.isKeyDown("v")){
            mundo world = new mundo ();
            Greenfoot.setWorld(world);
        }
      
            
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
