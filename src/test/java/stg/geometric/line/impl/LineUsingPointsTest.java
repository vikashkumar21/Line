package stg.geometric.line.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import stg.geometric.line.Line;

public class LineUsingPointsTest {
	
	Line line = new LineUsingPoints(1,2,2,4);

	@Test
	public void testGetGradient() {
		double gradient = line.getGradient();
		assertEquals(2, gradient, 0);
	}
	
	@Test
	public void testGetIntercept() {
		double intercept = line.getIntercept();
		assertEquals(0, intercept, 0);
	}
}
