
/**
 * Write a description of class Road here.
 *
 * @author (Simon Dutil)
 * @version (jan 17, 2019)
 */
public class Road
{
    // instance variables - replace the example below with your own
    private Square road;
    private Square line;
    private Square line1;
    private Square line2;
    private Square line3;

    /**
     * Constructor for objects of class Road
     * 
     * @param x     the horizontal position of the road
     * @param y     the vertical position of the road
     */
    public Road(int x, int y)
    {
       // initialise instance variables
       road = new Square();
       line = new Square();
       line1 = new Square();
       line2 = new Square();
       line3 = new Square();
      
       
       drawRoad(x, y);
    }

    /**
     * Draws the road
     *
     * @param x     the horizontal position of the road
     * @param y     the vertical position of the road
     */
    public void drawRoad(int x, int y)
     
    {
        // put your code here
        road.changeSize(100);
        road.moveHorizontal(x);
        road.moveVertical(y);
        road.changeColor("black");
        road.makeVisible();
        
        line.changeSize(5);
        line.moveHorizontal(-60);
        line.moveVertical(460);
        line.changeColor("white"); 
        line.makeVisible();
        
        //move
       //line.moveHorizontal(x);
       //line.moveVertical(y);
        
        
        line1.changeSize(5);
        line1.moveHorizontal(-55);
        line1.moveVertical(460);
        line1.changeColor("white"); 
        line1.makeVisible();
        
        //move
       //line1.moveHorizontal(x);
       //line1.moveVertical(y);
        
        
        line2.changeSize(5);
        line2.moveHorizontal(-50);
        line2.moveVertical(460);
        line2.changeColor("white"); 
        line2.makeVisible();
        
        //move
       //line2.moveHorizontal(x);
       //line2.moveVertical(y);
        
        
        line3.changeSize(5);
        line3.moveHorizontal(-45);
        line3.moveVertical(460);
        line3.changeColor("white"); 
        line3.makeVisible();
        
        //move
       //line3.moveHorizontal(x);
       //line3.moveVertical(y);
        
        
    }
}
