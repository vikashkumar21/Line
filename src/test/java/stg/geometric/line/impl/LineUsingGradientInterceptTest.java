package stg.geometric.line.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import stg.geometric.line.Line;

public class LineUsingGradientInterceptTest {
	
	Line line = new LineUsingGradientIntercept(1,2);

	@Test
	public void testGetGradient() {
		double gradient = line.getGradient();
		assertEquals(1, gradient, 0);
	}
	
	@Test
	public void testGetIntercept() {
		double intercept = line.getIntercept();
		assertEquals(2, intercept, 0);
	}
}
