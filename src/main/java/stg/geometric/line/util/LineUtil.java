package stg.geometric.line.util;

import stg.geometric.line.Line;
import stg.geometric.point.Point;

public class LineUtil {
	
	private LineUtil() {
		
	}
	
	public static boolean isParallel(Line l1, Line l2) {
		return l1.getGradient()==l2.getGradient();
	}

	public static boolean isPerpendicular(Line l1, Line l2) {
		return l1.getGradient()==-(1/l2.getGradient());
	}

	public static boolean isIncidence(Line l1, Line l2) {
		return l1.getGradient()!=l2.getGradient();
	}

	public static Point getIncidentPoint(Line l1, Line l2) {
		if(isIncidence(l1, l2)) {
			double x = (l1.getIntercept()-l2.getIntercept())/(l2.getGradient()-l1.getGradient());
			double y = l1.getGradient()*x+l1.getIntercept();
			return new Point(x, y);
		}
		return null;
	}

}
