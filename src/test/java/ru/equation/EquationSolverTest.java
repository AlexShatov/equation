package ru.equation;

import static org.testng.AssertJUnit.*;
import java.util.ArrayList;
import org.testng.annotations.Test;



public class EquationSolverTest {
	
	@Test
	public void testNullSolution() {
		ArrayList <Double> solList = EquationSolver.solve(2.1, 4.08, 7.26);
		assertEquals(0, solList.size());
	}
	
	@Test
	public void testOneSolution() {
		ArrayList <Double> solList = EquationSolver.solve(1.0, 12.0, 36.0);
		assertEquals(1 , solList.size());
		assertEquals((Double)(-6.0), solList.get(0));
	}
	
	@Test
	public void testTwoSolutions() {
		ArrayList <Double> solList = EquationSolver.solve(1.0, -2.0, -3.0);
		assertEquals(2, solList.size());
		assertEquals((Double)3.0, solList.get(0));
		assertEquals((Double)(-1.0), solList.get(1));
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void testSolveException() throws Exception{
		EquationSolver.solve(0.0, 4.08, 7.26);
	}
}
