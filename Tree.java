
/**
 * Creates an instance of a Tree.
 *
 * @author S. Dutil
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle tree;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        tree = new Triangle();
        trunk = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // draw triangle
        tree.changeSize(50, 75);
        tree.moveHorizontal(474);
        tree.moveVertical(465);
        tree.changeColor("green");
        tree.makeVisible();
        
        
        
        // draw square
        trunk.makeVisible();
        trunk.changeColor("black");
        trunk.moveHorizontal(450);
        trunk.moveVertical(480);
        
        // translate the tree to the specified location
        
        
    }
    
}
