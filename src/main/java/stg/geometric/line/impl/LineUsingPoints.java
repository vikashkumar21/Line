package stg.geometric.line.impl;

import stg.geometric.line.Line;
import stg.geometric.point.Point;

public class LineUsingPoints implements Line{
	
	private Point point1;
	private Point point2;
	
	public LineUsingPoints(double x1, double y1, double x2, double y2) {
		this.point1=new Point(x1, y1);
		this.point2=new Point(x2, y2);
	}
	
	public double getGradient() {
		return (point2.getY()-point1.getY())/(point2.getX()-point1.getX());
	}

	public double getIntercept() {
		return point1.getY()-this.getGradient()*point1.getX();
	}

}
