
/**
 * It draw a complete house on screen using individual shapes.
 *
 * @author (Simon Dutil)
 * @version (January 11, 2019)
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square door;
    private Square door1;
    private Circle window;
    private Circle doorknob;
    private Tree tree1;
    
    private Square driveway;
    private Square driveway1;
    private Road road1;
    

    /**
     * The job of a constructor is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initial ise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        door = new Square();
        door1 = new Square();
        window = new Circle();
        doorknob = new Circle();
        
        //invoke the metod to draw the house
        driveway = new Square();
        driveway1 = new Square();
        tree1 = new Tree(20, 300);
        tree1 = new Tree(180, 300);
        road1 = new Road(-60,410);
        road1 = new Road(-60,410);
        road1 = new Road(40,410);
        road1 = new Road(140,410);
        road1 = new Road(240,410);
        road1 = new Road(340,410);
        road1 = new Road(440,410);
        
        drawHouse();
    
    }

    /**
     * Draw this house for us.
     */
    public void drawHouse()
    {
        // Put the sun in position
        sun.moveHorizontal(475);
        sun.moveVertical(-100);
        sun.changeSize(150);
        sun.changeColor("yellow");
        sun.makeVisible();
       
        roof.changeSize(100, 180);
        roof.moveHorizontal(100);
        roof.moveVertical(50);
        roof.makeVisible();
        
        base.changeSize(135);
        base.moveHorizontal(23);
        base.moveVertical(115);
        base.makeVisible();
        
        door.changeSize(30);
        door.changeColor("yellow");
        door.moveHorizontal(75);
        door.moveVertical(220);
        door.makeVisible();
        
        door1.changeSize(30);
        door1.changeColor("yellow");
        door1.moveHorizontal(75);
        door1.moveVertical(190);
        door1.makeVisible();
        
        window.changeSize(45);
        window.changeColor("blue");
        window.moveHorizontal(110);
        window.moveVertical(40);
        window.makeVisible();
        
        doorknob.changeSize(5);
        doorknob.changeColor("white");
        doorknob.moveHorizontal(135);
        doorknob.moveVertical(210);
        doorknob.makeVisible();
        
        driveway.changeColor("black");
        driveway.changeSize(80);
        driveway.makeVisible();
        driveway.moveHorizontal(50);
        driveway.moveVertical(250);
        
        driveway1.changeColor("black");
        driveway1.changeSize(80);
        driveway1.makeVisible();
        driveway1.moveHorizontal(50);
        driveway1.moveVertical(330);
        
        
       
        
    }
}
