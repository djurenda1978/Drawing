package drawing.model;

import java.awt.*;

public class Donut extends Circle implements Movable {

    private int innerRadius;

    public Donut(Point center, int radios, boolean select, int innerRadius) {
        super(center, radios, select);
        this.innerRadius = innerRadius;
    }

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public double area() {
        return super.area() - innerRadius*innerRadius*Math.PI;
    }

//    @Override
//    public boolean equals (Object obj) {
//        if (obj instanceof Donut) {
//            Donut dTemp = (Donut)obj;
//            if (super.getCenter().equals(dTemp.getCenter()) && super.getRadious() == dTemp.getRadious() && this.innerRadius == dTemp.innerRadius) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//        return false;
//    }
//     Drugi nacin

@Override
public boolean equals (Object obj) {
    if (obj instanceof Donut) {
        Donut dTemp = (Donut) obj;
        if (super.equals(dTemp) && this.innerRadius == dTemp.innerRadius) {
            return true;
        } else {
            return false;
        }
    }
    return false;
}
    @Override
    public String toString() {
        return super.toString() + ", Inner radious:" + this.innerRadius;
    }
    private boolean containsInner (Point p){
        return (super.getCenter().distance(p)) < this.innerRadius;
    }

    public boolean containsInner (int x, int y) {
        return containsInner (new Point(x,y));
    }

    public boolean contains(int x, int y) {
        return (super.contains(x, y) && !containsInner(x,y));
    }

    @Override
    public void draw(Graphics g) {
        super.draw(g);
        g.drawOval(super.getCenter().getX(), super.getCenter().getY(),this.innerRadius*2, this.innerRadius*2);
    }
}


