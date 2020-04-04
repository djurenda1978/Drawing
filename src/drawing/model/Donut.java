package drawing.model;

public class Donut extends Circle {

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

    @Override
    public boolean equals (Object obj) {
        if (obj instanceof Donut) {
            Donut dTemp = (Donut)obj;
            if (super.getCenter() == dTemp.getCenter() && super.getRadious() == dTemp.getRadious() && this.innerRadius == dTemp.innerRadius) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
