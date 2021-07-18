package stg.geometric.line.impl;

import stg.geometric.line.Line;

public class LineUsingGradientIntercept implements Line{

	private double gradient;
	private double intercept;
	
	public LineUsingGradientIntercept(double gradient, double intercept) {
		this.gradient=gradient;
		this.intercept=intercept;
	}
	
	public double getGradient() {
		return gradient;
	}

	public double getIntercept() {
		return intercept;
	}

}
