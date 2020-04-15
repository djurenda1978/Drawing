package drawing.exceptions;

import drawing.model.Circle;

public class CircleException extends Exception {

	private Circle circle;

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public CircleException (String message, Circle circle) {
		super(message);
		this.circle  = circle;
	}

}
