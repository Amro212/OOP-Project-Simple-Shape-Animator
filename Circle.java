


import java.awt.Color;

public class Circle {
    private int r; //radius of circle
    private Color colorIn;//color inside circle
    private Color colorOut;//color on boarder of circle
    private int x;//x-cooordinate
    private int y;//y-coordinate
    private int border;//circle shape inlcudes thickness of boarder(in pixels)


    public void setR(int r) {
        this.r = r;
    }  
    
    public void setColor(Color colorIn){
       //Color ColorShape = new Color(100,0,0);
       this.colorIn=colorIn;
    }
    
    public Color getColorIn(){
        return colorIn;
    }
    
    public Color getColorOut() {
        return colorOut;
    }

    public void setColorOut(Color colorOut) {
        this.colorOut = colorOut;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
     public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }

    public int getR() {
        return r;
    }
    
    //constructor for Circle object

    public Circle(int r, Color colorIn, Color colorOut, int x, int y, int border) {
        this.r = r;
        this.colorIn = colorIn;
        this.colorOut = colorOut;
        this.x = x;
        this.y = y;
        this.border = border;
    }
    
    //default constructor
    public Circle(){
        
    }
    
}
