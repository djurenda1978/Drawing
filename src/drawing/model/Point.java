package drawing.model;

import java.awt.*;

public class Point extends Shape implements Movable {

    private int x;
    private int y;


//    private boolean selected;

    public Point(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    public Point (int x, int y, boolean selected) {
        super(selected);
        this.x = x;
        this.y = y;
    }
//
//    public Point(int x, int y, boolean selected) {
//        this(x, y);
//        this.selected = selected;
//    }

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

    public double distance(Point p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point pTemp = (Point) obj;
            if (this.x == pTemp.x && this.y == pTemp.y) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String toString () {
        return "(" + this.x + "," + this.y + ")";

    }
    @Override
    public boolean contains (int x, int y) {
        boolean containX = (this.x < (2*x+1)/2 && this.x>= x) || this.x > (2*x-1)/2;
        boolean containY = (this.y < (2*y+1)/2 && this.y>= y) || this.y > (2*y-1)/2;
        return containX&&containY;
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(this.x,this.y,this.x, this.y);
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.x = this.x + byX;
        this.y = this.y + byY;
    }
}
