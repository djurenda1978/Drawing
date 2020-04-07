package drawing.model;

import java.util.ArrayList;

public class Polyline {

	private ArrayList<Line> segments= new ArrayList();

	public  void  addSegment () {

		for (Line segment: segments) {
			this.segments.add(segment);
		}

	}

}
