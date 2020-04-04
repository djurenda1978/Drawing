package drawing.model;

import java.awt.*;

public class ColoredCircleWithText extends ColoredCircle {

	private String text;


	public ColoredCircleWithText (Point point, int radious, Color color, String text) {
		super(point,radious,color);
		this.text = text;
	}
	public ColoredCircleWithText (Point point, int radious,boolean selected,Color color, String text) {
		super(point,radious,selected,color);
		this.text = text;
	}

	public void setText (String text) {
		this.text = text;
	}
	public String getText() {
		return this.text;
	}
}

