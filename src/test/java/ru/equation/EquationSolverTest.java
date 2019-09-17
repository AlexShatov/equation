package ru.equation;

import org.junit.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class EquationSolverTest {
	
	@Test
	public void testNullSolution() {
		EquationSolver solver = new EquationSolver();
		assertNull(solver.solve(2.1, 4.08, 7.26));
	}
	
	@Test
	public void testOneSolution() {
		EquationSolver solver = new EquationSolver();
		ArrayList <Double> solList = solver.solve(1.0, 12.0, 36.0);
		assertEquals(1 , solList.size());
		assertEquals((Double)(-6.0), solList.get(0));
	}
	
	@Test
	public void testTwoSolutions() {
		EquationSolver solver = new EquationSolver();
		ArrayList <Double> solList = solver.solve(1.0, -2.0, -3.0);
		assertEquals(2, solList.size());
		assertEquals((Double)3.0, solList.get(0));
		assertEquals((Double)(-1.0), solList.get(1));
	}

	@Test(expected = ArithmeticException.class)
	public void testSolveException() throws Exception{
		EquationSolver solver = new EquationSolver();
		solver.solve(0.0, 4.08, 7.26);
	}

}
