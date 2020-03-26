package drawing.model;

public class Circle {

    private Point center;
    private int radious;
    private boolean selectCircle;

    public Circle (Point center, int radious) {
        this.center = center;
        this.radious = radious;
    }
    public Circle (Point center, int radious, boolean selectCircle) {
        this(center, radious);
        this.selectCircle = selectCircle;
    }


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

    public boolean isSelectCircle() {
        return selectCircle;
    }

    public void setSelectCircle(boolean selectCircle) {
        this.selectCircle = selectCircle;
    }

    public double area() {
        return this.radious*this.radious*Math.PI;
    }
}
