package drawing.model;

public class Rectagle {

    private boolean selectRectangle;
    private Point upperLeft;
    private int width;
    private int height;

    public boolean isSelectRectangle() {
        return selectRectangle;
    }

    public void setSelectRectangle(boolean selectRectangle) {
        this.selectRectangle = selectRectangle;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area() {
        return this.width*this.height;
    }
}
