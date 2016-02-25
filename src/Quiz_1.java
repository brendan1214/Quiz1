
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class Quiz_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Kw = new City();
       
        Robot bot = new Robot(Kw,4,0,Direction.EAST);
        
        bot.setColor(Color.pink);
    
        new Wall(Kw, 4, 2, Direction.WEST);
        new Wall(Kw, 4, 2, Direction.NORTH);
        new Wall(Kw, 3, 3, Direction.WEST);
        new Wall(Kw, 3, 3, Direction.NORTH);
        new Wall(Kw, 2, 4, Direction.WEST);
        new Wall(Kw, 2, 4, Direction.NORTH);
        new Wall(Kw, 2, 5, Direction.NORTH);
        new Wall(Kw, 2, 5, Direction.EAST);
        new Wall(Kw, 3, 6, Direction.EAST);
        new Wall(Kw, 3, 6, Direction.NORTH);
        new Wall(Kw, 4, 7, Direction.EAST);
        new Wall(Kw, 4, 7, Direction.NORTH);
    
        new Thing(Kw, 4, 1);
        new Thing(Kw, 3, 2);
        new Thing(Kw, 2, 3);
        new Thing(Kw, 1, 4);
        
        bot.move();
        bot.pickThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.pickThing();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.pickThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.pickThing();
        bot.move();
        bot.putThing();
        bot.move();    
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();    
        bot.putThing();
        bot.turnLeft();
        bot.move();  
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        bot.move();
     }
    
}
