package ru.equation;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class EquationSolverTest {
	
	public EquationSolverTest() {
		
	}
	
	private static EquationSolver solver;
	private ArrayList<Double> solArray;
	
	@BeforeClass
	public static void init() {
		solver = new EquationSolver();
	}
	
	@Test
	public void testSolve() throws Exception{
		solArray = solver.solve(2.1, 4.08, 7.26);
		assertNull(solArray);
		solArray = solver.solve(1.0, 12.0, 36.0);
		assertEquals(1 ,solArray.size());
		assertEquals((Double)(-6.0), solArray.get(0));
		solArray = solver.solve(1.0, -2.0, -3.0);
		assertEquals(2, solArray.size());
		assertEquals((Double)3.0, solArray.get(0));
		assertEquals((Double)(-1.0), solArray.get(1));
	}

	@Test(expected = Exception.class)
	public void testSolveException() throws Exception{
		solver.solve(0.0, 4.08, 7.26);
	}
	

}
