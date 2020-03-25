package drawing.model;

public class Circle {

    private Line radious;
    private boolean selectCircle;
    private static double pi = Math.PI;

    public Line getRadious() {
        return radious;
    }

    public void setRadious(Line radious) {
        this.radious = radious;
    }

    public boolean isSelectCirle() {
        return selectCircle;
    }

    public void setSelectCirle(boolean selectCirle) {
        this.selectCircle = selectCirle;
    }

    public double area() {
        return radious.length()*radious.length()*pi;
    }
}
