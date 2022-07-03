import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver2 extends World
{

    /**
     * Constructor for objects of class GameOver2.
     * 
     */
    public GameOver2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 800, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Gm gm = new Gm();
        addObject(gm,200,396);
        gm.setLocation(201,396);
        removeObject(gm);

        bg2 bg2 = new bg2();
        addObject(bg2,342,402);
        removeObject(bg2);
        gover1 gover1 = new gover1();
        addObject(gover1,322,418);
        gover1.setLocation(207,361);
        Gm gm2 = new Gm();
        addObject(gm2,224,659);
        gm2.setLocation(91,712);
    }

     public void act()
    {
     
        
    }
   
}
