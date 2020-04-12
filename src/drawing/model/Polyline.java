package drawing.model;

import java.util.ArrayList;

public class Polyline {

	private ArrayList<Line> segments;

	public Polyline() {
		this.segments = new ArrayList<>();
	}

	public boolean addSegment(Line line) {

		if (this.segments.isEmpty()) {
			return this.segments.add(line);
		} else {
			Line lastSeg = segments.get(segments.size() - 1);
			if (lastSeg.getEndPoint().equals(line.getStartPoint())) {
				return this.segments.add(line);
			}
		}
			return false;
		}

		public double lengthLine () {
			double totalline = 0;
			for (Line segment : this.segments) {
				totalline += segment.length();
			}
			return totalline;
		}
	}



