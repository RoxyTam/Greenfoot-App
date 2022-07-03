import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
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
        ground ground = new ground();
        addObject(ground,345,728);
        ground.setLocation(370,706);
        ground ground2 = new ground();
        addObject(ground2,128,463);
        ground ground3 = new ground();
        addObject(ground3,175,542);
        ground ground4 = new ground();
        addObject(ground4,229,369);
        ground ground5 = new ground();
        addObject(ground5,291,470);
        ground ground6 = new ground();
        addObject(ground6,265,566);
        ground ground7 = new ground();
        addObject(ground7,299,434);
        ground6.setLocation(311,735);
        ground.setLocation(371,625);
        ground6.setLocation(315,686);
        ground5.setLocation(223,733);
        ground6.setLocation(286,682);
        ground3.setLocation(165,675);
        ground2.setLocation(92,612);
        ground7.setLocation(9,526);
        ground4.setLocation(48,456);
        ground4.setLocation(32,453);
        ground3 ground32 = new ground3();
        addObject(ground32,222,331);
        ground32.setLocation(237,346);
        ground32.setLocation(215,351);
        ground32.setLocation(216,341);
        ground32.setLocation(238,346);
        ground3 ground33 = new ground3();
        addObject(ground33,288,282);
        ground33.setLocation(309,281);
        ground3 ground34 = new ground3();
        addObject(ground34,192,115);
        ground34.setLocation(198,135);
        ground34.setLocation(198,157);
        ground34.setLocation(195,147);
        ground3 ground35 = new ground3();
        addObject(ground35,372,219);
        ground35.setLocation(374,222);
        ground3 ground36 = new ground3();
        addObject(ground36,267,183);
        ground36.setLocation(273,191);
        ground33.setLocation(297,292);
        ground35.setLocation(379,242);
        ground36.setLocation(272,208);
        ground34.setLocation(193,145);
        ground4.setLocation(25,453);
        ground4.setLocation(22,434);
        ground ground8 = new ground();
        addObject(ground8,50,85);
        ground8.setLocation(28,86);
        ground32.setLocation(233,347);
        ground8.setLocation(378,81);
        ground35.setLocation(17,252);
        ground33.setLocation(121,303);
        ground33.setLocation(123,299);
        ground36.setLocation(133,199);
        ground34.setLocation(235,149);
        ground3 ground37 = new ground3();
        addObject(ground37,352,150);
        ground37.setLocation(373,145);
        out out = new out();
        addObject(out,144,758);
        out.setLocation(144,794);
        out out2 = new out();
        addObject(out2,267,610);
        out2.setLocation(274,783);
        start start = new start();
        addObject(start,278,517);
        start.setLocation(368,658);
        start.setLocation(377,657);
        people people = new people();
        addObject(people,357,563);
        people.setLocation(373,595);
        bombe bombe = new bombe();
        addObject(bombe,195,468);
        bombe bombe2 = new bombe();
        addObject(bombe2,262,449);
        bombe bombe3 = new bombe();
        addObject(bombe3,280,540);
        bombe bombe4 = new bombe();
        addObject(bombe4,244,528);
        bombe bombe5 = new bombe();
        addObject(bombe5,238,397);
        bombe bombe6 = new bombe();
        addObject(bombe6,311,426);
        bombe bombe7 = new bombe();
        addObject(bombe7,278,471);
        bombe bombe8 = new bombe();
        addObject(bombe8,335,489);
        bombe6.setLocation(297,414);
        bombe bombe9 = new bombe();
        addObject(bombe9,297,414);
        bombe bombe10 = new bombe();
        addObject(bombe10,294,519);
        bombe10.setLocation(224,590);
        bombe10.setLocation(224,590);
        bombe10.setLocation(233,581);
        bombe.setLocation(217,325);
        bombe5.setLocation(224,251);
        bombe5.setLocation(224,251);
        bombe8.setLocation(350,274);
        bombe2.setLocation(120,507);
        bombe4.setLocation(219,543);
        bombe4.setLocation(194,527);
        bombe3.setLocation(302,487);
        bombe7.setLocation(47,115);
        bombe6.setLocation(156,69);
        bombe9.setLocation(116,387);
        bombe4.setLocation(190,522);

        ground6.setLocation(314,677);
        ground6.setLocation(310,677);
        start.setLocation(365,660);
        start.setLocation(360,660);
        start.setLocation(366,655);
        ground5.setLocation(242,727);
        ground7.setLocation(34,528);
        ground7.setLocation(41,523);
        ground7.setLocation(24,524);
        bombe10.setLocation(238,565);
        bombe2.setLocation(123,487);
        bombe4.setLocation(181,510);
        bombe2.setLocation(141,441);
        finish3 finish3 = new finish3();
        addObject(finish3,269,421);
        finish3.setLocation(369,42);
        finish3.setLocation(369,44);
    }
}
