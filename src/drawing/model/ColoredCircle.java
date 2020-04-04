package drawing.model;

import java.awt.*;

public class ColoredCircle extends Circle {

private Color color;

	public ColoredCircle(Point center, int radious, Color color) {
		super(center, radious);
		this.color = color;
	}

	public ColoredCircle(Point center, int radious, boolean selectCircle, Color color) {
		super(center, radious, selectCircle);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
