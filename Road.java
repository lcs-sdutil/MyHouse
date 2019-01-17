
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

    /**
     * Constructor for objects of class Road
     */
    public Road(int x, int y)
    {
        // initialise instance variables
       road = new Square();
       line = new Square();
       
       drawRoad(x, y);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void drawRoad(int x, int y)
     
    {
        // put your code here
        road.changeSize(100);
        road.makeVisible();
        road.changeColor("black");
        
    }
}
