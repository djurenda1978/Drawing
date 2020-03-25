package drawing.model;

public class Line {

private Point startPoint;
private Point endPoint;
private boolean selectedLine;

    public Point getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isSelectedLine() {
        return selectedLine;
    }

    public void setSelectedLine(boolean selectedLine) {
        this.selectedLine = selectedLine;
    }

    public double length() {
        return startPoint.distance(endPoint);
    }



}
