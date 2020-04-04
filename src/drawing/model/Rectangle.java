package drawing.model;

public class Rectangle {

	private boolean selectRectangle;
	private Point upperLeft;
	private int width;
	private int height;

	public Rectangle(Point upperLeft, int width, int height) {
		this.upperLeft = upperLeft;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point upperLeft, int width, int height, boolean selectRectangle) {
		this(upperLeft, width, height);
		this.selectRectangle = selectRectangle;
	}

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
		return this.width * this.height;
	}

	public boolean contains(Point p) {
		boolean containsX = p.getX() > this.upperLeft.getX() && p.getX() < this.upperLeft.getX() + this.width;
		boolean containsY = p.getY() > this.upperLeft.getY() && p.getY() < this.upperLeft.getY() + this.height;
		return containsX && containsY;
	}

	public boolean contains(int x, int y) {
		return (contains(new Point(x, y)));
	}

	public Point lowerRight() {
		int upperRightX = getUpperLeft().getX() + width;
		int lowerLeftY = getUpperLeft().getY() + height;
		return new Point(upperRightX, lowerLeftY);
	}

	public boolean equals(Object obj) {
		if (obj instanceof Rectangle) {
			Rectangle rTemp = (Rectangle) obj;
			if (this.upperLeft == rTemp.upperLeft && this.width == rTemp.width && this.height == rTemp.height) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

}

