/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square background;
    private Square signpost;
    private Square signpost2;
    private Triangle border;
    private Triangle sign;
    private Person kid1;
    private Person kid2;
    private Circle ball;
    
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        //wall = new Square();
        //window = new Square();
        //roof = new Triangle();  
        //sun = new Circle();
        //drawn = false;
        
        background = new Square();
        signpost = new Square();
        signpost2 = new Square();
        border = new Triangle();
        sign = new Triangle();
        kid1 = new Person();
        kid2 = new Person();
        ball = new Circle();
        
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            //wall.moveHorizontal(-140);
            //wall.moveVertical(20);
            //wall.changeSize(120);
            //wall.changeColor("blue");
            //wall.makeVisible();
            
            //window.changeColor("black");
            //window.moveHorizontal(-120);
            //window.moveVertical(40);
            //window.changeSize(40);
            //window.makeVisible();
    
            //roof.changeSize(60, 180);
            //roof.moveHorizontal(20);
            //roof.moveVertical(-60);
            //roof.makeVisible();
    
            //sun.changeColor("yellow");
            //sun.moveHorizontal(100);
            //sun.moveVertical(-40);
            //sun.changeSize(80);
            //sun.makeVisible();
            //drawn = true;
            
            background.moveHorizontal(-350);
            background.moveVertical(-150);
            background.changeSize(600);
            background.changeColor("blue");
            background.makeVisible();
            
            signpost.changeColor("black");
            signpost.moveHorizontal(-90);
            signpost.moveVertical(120);
            signpost.makeVisible();
            
            signpost2.changeColor("blue");
            signpost2.moveHorizontal(-60);
            signpost2.moveVertical(120);
            signpost2.makeVisible();
            
            border.changeColor("black");
            border.moveHorizontal(25);
            border.moveVertical(-100);
            border.changeSize(200, 200);
            border.makeVisible();
            
            sign.changeColor("yellow");
            sign.moveHorizontal(25);
            sign.moveVertical(-72);
            sign.changeSize(160, 160);
            sign.makeVisible();
            
            kid1.changeColor("black");
            kid1.moveHorizontal(-80);
            kid1.moveVertical(-10);
            kid1.makeVisible();
            
            kid2.changeColor("black");
            kid2.moveHorizontal(-10);
            kid2.moveVertical(-10);
            kid2.makeVisible();
            
            ball.changeColor("black");
            ball.moveHorizontal(-10);
            ball.moveVertical(40);
            ball.changeSize(30);
            ball.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        background.changeColor("white");
        signpost.changeColor("black");
        signpost2.changeColor("white");
        border.changeColor("black");
        sign.changeColor("white");
        kid1.changeColor("black");
        kid2.changeColor("black");
        ball.changeColor("black");
        
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        background.changeColor("blue");
        signpost.changeColor("black");
        signpost2.changeColor("blue");
        border.changeColor("black");
        sign.changeColor("yellow");
        kid1.changeColor("black");
        kid2.changeColor("black");
        ball.changeColor("black");
    }
}
