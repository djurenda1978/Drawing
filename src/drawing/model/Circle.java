package drawing.model;

import java.awt.*;
import java.util.Objects;

public class Circle extends Shape implements Movable{

    private Point center;
    private int radious;
//    private boolean select;

    public Circle (Point center, int radious) {
        this.center = center;
        this.radious = radious;
    }

    public Circle (Point center, int radious,boolean select) {
        super(select);
        this.center = center;
        this.radious = radious;
    }
//    public Circle (Point center, int radious, boolean selectCircle) {
//        this(center, radious);
//        this.select = selectCircle;
//    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadious() {
        return radious;
    }

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public double area() {
        return this.radious*this.radious*Math.PI;
    }



//    public boolean contains(int x, int y) {
//
//        return (this.center.distance(new Point(x,y))) <= this.radious;
//    }



    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Circle) {
            Circle cTemp = (Circle)obj;
            if (this.center.equals(cTemp.center) && this.radious == cTemp.radious) {
                return true;
        } else {
                return false;
            }
    }
        return false;
    }

    @Override
    public String toString () {
        return "Center:" + this.center + ", Radious:" + this.radious ;
    }

    private boolean contains(Point p) {
        return (this.center.distance(p)) <= this.radious;
    }
    public boolean contains(int x, int y) {
        return contains(new Point(x, y));
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(this.center.getX(), this.center.getY(),this.radious*2, this.radious*2);
    }

    @Override
    public void moveBy(int byX, int byY) {
        this.center.setX(this.center.getX() + byX);
        this.center.setY(this.center.getY() + byY);
    }
}
