package drawing.model;


import java.awt.*;

public class Line extends Shape implements Movable {

	private Point startPoint;
	private Point endPoint;
//	private boolean selected;

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endpoint, boolean selected) {
		super(selected);
		this.startPoint = startPoint;
		this.startPoint = endpoint;
	}

//	public Line(Point startPoint, Point endpoint, boolean selectedLine) {
//		this(startPoint, endpoint);
//		this.selectedLine = selectedLine;
//	}


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

	public double length() {
		return this.startPoint.distance(this.endPoint);
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line lTemp = (Line) obj;
			if (this.startPoint.equals(lTemp.startPoint) && this.endPoint.equals(lTemp.endPoint)) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Start:" + this.startPoint + ", End:" + endPoint;
	}

	@Override
	public boolean contains(int x, int y) {
		boolean containX = x >= this.startPoint.getX() && x <= this.endPoint.getX();
		boolean containY = y >= this.startPoint.getY() && y <= this.endPoint.getY();
		return containX && containY;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(this.startPoint.getX(), this.startPoint.getY(), this.endPoint.getX(), this.endPoint.getY());
	}

	@Override
	public void moveBy(int byX, int byY) {

		this.startPoint.moveBy(byX,byY);
		this.endPoint.moveBy(byX,byY);

//		this.startPoint.setX(this.startPoint.getX() +byX);
//		this.startPoint.setY(this.startPoint.getY() +byY);
//		this.endPoint.setX(this.endPoint.getX() +byX);
//		this.endPoint.setY(this.endPoint.getY() +byY);

	}
}
