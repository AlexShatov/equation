package ru.equation;

import java.util.ArrayList;

public class EquationSolver {
	private Double d;
	private Double x;
	private Double y;
	ArrayList<Double> solution;
	
	public EquationSolver() {
		
	}
	
	public ArrayList<Double> solve(Double a, Double b, Double c) throws Exception{
		if(a == 0) {
			throw new Exception("a = 0 is unacceptable");
		}
		solution = null;
		d = Math.pow(b, 2) - 4*a*c;
		if(d > 0) {
			solution = new ArrayList<>();
			x = (-b + Math.sqrt(d)) / 2 * a;
			y = ( -b - Math.sqrt(d)) / 2 * a;
			solution.add(x);
			solution.add(y);
		}else if(d == 0) {
			solution = new ArrayList<>();
			x=-b/2*a;
			solution.add(x);
		}
		return solution;
	}
}
