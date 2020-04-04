package drawing.model;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private boolean selectedLine;

	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

	public Line(Point startPoint, Point endpoint, boolean selectedLine) {
		this(startPoint, endpoint);
		this.selectedLine = selectedLine;
	}


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
		return this.startPoint.distance(this.endPoint);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line) {
			Line lTemp = (Line) obj;
			if (this.startPoint == lTemp.startPoint && this.endPoint == lTemp.endPoint) {
				return true;
			} else {
				return false;
			}
		}
		return false;

	}


}
