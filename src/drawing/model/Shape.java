package drawing.model;
import  java.awt.*;

public abstract class Shape  {

	protected boolean selected;

	public Shape() {
	}
	public Shape (boolean selected) {
		this.selected = selected;
	}
	public void setSelected (boolean selected) {
		this.selected = selected;
	}
	public boolean isSelected () {
		return this.selected;
	}
	public abstract boolean contains(int x, int y);
	public abstract void draw (Graphics g);
}
