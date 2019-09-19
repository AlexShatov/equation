package ru.equation;

import java.util.ArrayList;

public class EquationSolver {
	
	public static ArrayList<Double> solve(Double a, Double b, Double c) {
		ArrayList<Double> solArray = null;
		Double solution;
		if(a == 0) {
			throw new ArithmeticException("a = 0 is unacceptable");
		}
		Double d = Math.pow(b, 2) - 4*a*c;
		if(d > a) {
			solArray = new ArrayList<>();
			solution = (-b + Math.sqrt(d)) / 2 * a;
			solArray.add(solution);
			solution = ( -b - Math.sqrt(d)) / 2 * a;
			solArray.add(solution);
		}else if(d == 0) {
			solArray = new ArrayList<>();
			solution = -b/2*a;
			solArray.add(solution);
		}
		return solArray;
	}
}
