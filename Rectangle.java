


import java.awt.Color;

public class Rectangle {
    private int len;//length of rectangle
    private int wid;//lentgth of rectangle
    private Color colorIn; //color inside of rectangle
    private int x;//x-cooordinate of upper left corner
    private int y;//y-coordinate of upper left corner
    private int border;//thickness of borders(in pixels)
    private Color colorOut;//color of rectangle's border

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public Color getColorIn() {
        return colorIn;
    }

    public void setColorIn(Color colorIn) {
        this.colorIn = colorIn;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
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
    
    //Rectangle object constructor
    public Rectangle(int len, int wid, Color colorIn, int x, int y, int border, Color colorOut) {
        this.len = len;
        this.wid = wid;
        this.colorIn = colorIn;
        this.x = x;
        this.y = y;
        this.border = border;
        this.colorOut = colorOut;
    }
    
}
