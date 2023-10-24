import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{
     private GreenfootSound bgMusic = new GreenfootSound("mario.mp3");
     
    /**
     * Constructor for objects of class mundo.
     * 
     */
    
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    public void started(){
    bgMusic.playLoop();
}
public void stopped(){
    bgMusic.pause();
}
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {

        princesa princesa = new princesa();
        addObject(princesa,491,423);
        mario mario = new mario();
        addObject(mario,104,458);
        duvida duvida = new duvida();
        addObject(duvida,395,380);
        duvida duvida2 = new duvida();
        addObject(duvida2,596,379);
        duvida duvida3 = new duvida();
        addObject(duvida3,675,380);
        duvida duvida4 = new duvida();
        addObject(duvida4,636,220);
        florzinha florzinha = new florzinha();
        addObject(florzinha,716,336);
        Counter counter = new Counter();
        addObject(counter,737,40);
        Counter counter2 = new Counter();
        addObject(counter2,61,34);
    }
}
