


import  java.awt.Color;

public class Line {
    private int startX;//starting x-coordinate of line
    private int startY;//starting y-coordinate of line
    private int endX;//ending x-coordinate of line
    private int endY;//endging y-coordinate of line
    private Color color;// color of line
    private int border; //thickness of line

    public int getStartX() {
        return startX;
    }

    public void setStartX(int startX) {
        this.startX = startX;
    }

    public int getStartY() {
        return startY;
    }

    public void setStartY(int startY) {
        this.startY = startY;
    }

    public int getEndX() {
        return endX;
    }

    public void setEndX(int endX) {
        this.endX = endX;
    }

    public int getEndY() {
        return endY;
    }

    public void setEndY(int endY) {
        this.endY = endY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getBorder() {
        return border;
    }

    public void setBorder(int border) {
        this.border = border;
    }
    
   //line object constructor

    public Line(int startX, int startY, int endX, int endY, Color color, int border) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.color = color;
        this.border = border;
    }
}
