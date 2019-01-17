
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
    private Triangle tree1;
    private Triangle tree2;
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
        tree1 = new Triangle();
        tree2 = new Triangle();
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
        
       // draw square
        trunk.makeVisible();
        trunk.changeColor("black");
        trunk.moveHorizontal(-25);
        trunk.moveVertical(50);
        
       // move 
       trunk.moveHorizontal(x);
       trunk.moveVertical(y); 
        
        
       // draw triangle
        tree.changeSize(50, 75);
        tree.makeVisible();
        tree.moveVertical(40);
        tree.changeColor("green");
        
        //move
       tree.moveHorizontal(x);
       tree.moveVertical(y);
        
   
        //draw 2nd triangle
        tree1.changeSize(50, 75);
        tree1.moveVertical(20);
        tree1.changeColor("green");
        tree1.makeVisible();
        
        //move 
        tree1.moveHorizontal(x);
        tree1.moveVertical(y);
        
        //draw 3rd triangle
        tree2.changeSize(50, 75);
        tree2.changeColor("green");
        tree2.makeVisible();
        
        //move 
        tree2.moveHorizontal(x);
        tree2.moveVertical(y);
        
        
        // translate the tree to the specified location
        
        
    }
    
}
