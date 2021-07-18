package stg.geometric.line.util;

import static org.junit.Assert.*;

import org.junit.Test;

import stg.geometric.line.Line;
import stg.geometric.line.impl.LineUsingGradientIntercept;
import stg.geometric.point.Point;

public class LineUtilTest {
	
	@Test
	public void testIsParallel() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(2, 2);
		boolean actual = LineUtil.isParallel(l1, l2);
		assertEquals(true, actual);
	}
	
	@Test
	public void testIsNotParallel() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(1, 1);
		boolean actual = LineUtil.isParallel(l1, l2);
		assertEquals(false, actual);
	}
	
	@Test
	public void testIsPerpendicular() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(-0.5, 1);
		boolean actual = LineUtil.isPerpendicular(l1, l2);
		assertEquals(true, actual);
	}
	
	@Test
	public void testIsNotPerpendicular() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(1, 1);
		boolean actual = LineUtil.isPerpendicular(l1, l2);
		assertEquals(false, actual);
	}
	
	@Test
	public void testIsIncidence() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(1, 1);
		boolean actual = LineUtil.isIncidence(l1, l2);
		assertEquals(true, actual);
	}
	
	@Test
	public void testIsNotIncidence() {
		Line l1 = new LineUsingGradientIntercept(2, 1);
		Line l2 = new LineUsingGradientIntercept(2, 2);
		boolean actual = LineUtil.isIncidence(l1, l2);
		assertEquals(false, actual);
	}
	
	@Test
	public void testGetIncidentPoint() {
		Line l1 = new LineUsingGradientIntercept(2, 0);
		Line l2 = new LineUsingGradientIntercept(1, 0);
		Point incidentPoint = LineUtil.getIncidentPoint(l1, l2);
		assertEquals(0, incidentPoint.getX(), 0);
		assertEquals(0, incidentPoint.getY(), 0);
	}
	
	@Test
	public void testGetIncidentPointNull() {
		Line l1 = new LineUsingGradientIntercept(2, 0);
		Line l2 = new LineUsingGradientIntercept(2, 0);
		Point incidentPoint = LineUtil.getIncidentPoint(l1, l2);
		assertEquals(null, incidentPoint);
	}
}
