package drawing.model;

import drawing.exceptions.CircleException;

import java.awt.*;

public class Circle extends Shape implements Movable {

	protected Point center;
	protected int radius;
//    private boolean select;

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public Circle(Point center, int radius, boolean selected) {
		super(selected);
		this.center = center;
		this.radius = radius;
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

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) throws CircleException {
		if (radius <= 0) {
			throw new CircleException("Poluprecnik kruga je manji ili jednak nuli", this);
		}
		this.radius = radius;
	}

	public double area() {
		return this.radius * this.radius * Math.PI;
	}


//    public boolean contains(int x, int y) {
//
//        return (this.center.distance(new Point(x,y))) <= this.radious;
//    }


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle cTemp = (Circle) obj;
			if (this.center.equals(cTemp.center) && this.radius == cTemp.radius) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Center:" + this.center + ", Radious:" + this.radius;
	}

	private boolean contains(Point p) {
		return (this.center.distance(p)) <= this.radius;
	}

	@Override
	public boolean contains(int x, int y) {
		return contains(new Point(x, y));
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(this.center.getX(), this.center.getY(), this.radius * 2, this.radius * 2);
	}

	@Override
	public void moveBy(int byX, int byY) {

		this.center.moveBy(byX, byY);
//        this.center.setX(this.center.getX() + byX);
//        this.center.setY(this.center.getY() + byY);
	}
}
