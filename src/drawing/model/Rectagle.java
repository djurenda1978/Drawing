package drawing.model;

public class Rectagle {

    private Line upperleftX;
    private Line uperleftY;
    private boolean selectRectangle;

    public Line getUpperleftX() {
        return upperleftX;
    }

    public void setUpperleftX(Line upperleftX) {
        this.upperleftX = upperleftX;
    }

    public Line getUperleftY() {
        return uperleftY;
    }

    public void setUperleftY(Line uperleftY) {
        this.uperleftY = uperleftY;
    }

    public boolean isSelectRectangle() {
        return selectRectangle;
    }

    public void setSelectRectangle(boolean selectRectangle) {
        this.selectRectangle = selectRectangle;
    }

    public double area() {
        return upperleftX.length()*uperleftY.length();
    }
}
