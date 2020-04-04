package drawing.model;

public class Circle {

    private Point center;
    private int radious;
    private boolean select;

    public Circle (Point center, int radious) {
        this.center = center;
        this.radious = radious;
    }
    public Circle (Point center, int radious, boolean selectCircle) {
        this(center, radious);
        this.select = selectCircle;
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

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public double area() {
        return this.radious*this.radious*Math.PI;
    }
    public boolean contains(Point p) {

        return (this.center.distance(p)) <= this.radious;
    }

    public boolean contains(int x, int y) {
        return (contains(new Point(x,y)));
    }
}
