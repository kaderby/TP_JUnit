import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Depanage
 *
 */
public class MatrixErrorTest {

	private int rowNb;
	private int colNb;
	int init;
	private double constant;
	private MatrixError MatrixNull;
	private MatrixError MatrixConst;
	private double[][] MatrixA;
	private double[][] MatrixB;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rowNb = 2;
		colNb = 3;
		constant = 1;
		init = 1;
		
		MatrixNull = new MatrixError(rowNb,colNb);
		MatrixConst = new MatrixError(rowNb,colNb,constant);
		
		MatrixA = new double[rowNb][colNb];
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		MatrixA[i][j] = (double) ((2*i+j)*init + constant) ;	
    		}
		}
    	
		MatrixB = new double[rowNb][rowNb];
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<rowNb;j++){
    		MatrixA[i][j] = (double) ((2*i+j)*init + constant) ;	
    		}
		}		
		
		
		
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	//MethodTesting
	
	/**
	 * Test method for {@link MatrixError#MatrixError(int, int)}.
	 */
	@Test
	public void testMatrixErrorIntInt() {
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixNull.getElement(i,j)==0;	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#MatrixError(int, int, double)}.
	 */
	@Test
	public void testMatrixErrorIntIntDouble() {
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixConst.getElement(i,j)==constant;	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#MatrixError(double[][])}.
	 */
	@Test
	public void testMatrixErrorDoubleArrayArray() {
		MatrixError A = new MatrixError(MatrixA);  
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & A.getElement(i,j)==((double) ((2*i+j)*init + constant));	
    		}   	
		}
		assertTrue(bool);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException() {

	}

	/**
	 * Test method for {@link MatrixError#plus(MatrixError)}.
	 */
	@Test
	public void testPlusMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = A.plus(MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ((2*i+j)*init + 2*constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#plus(MatrixError, MatrixError)}.
	 */
	@Test
	public void testPlusMatrixErrorMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = MatrixError.plus(A,MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ((2*i+j)*init + 2*constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#plusEquals(MatrixError)}.
	 */
	@Test
	public void testPlusEquals() {
		MatrixError A = new MatrixError(MatrixA);
		A.plusEquals(MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & A.getElement(i,j)==((double) ((2*i+j)*init + 2*constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#minus(MatrixError)}.
	 */
	@Test
	public void testMinusMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = A.minus(MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ((2*i+j)*init));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#minus(MatrixError, MatrixError)}.
	 */
	@Test
	public void testMinusMatrixErrorMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = MatrixError.minus(A,MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ((2*i+j)*init));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#minusEquals(MatrixError)}.
	 */
	@Test
	public void testMinusEquals() {
		MatrixError A = new MatrixError(MatrixA);
		A.minusEquals(MatrixConst);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & A.getElement(i,j)==((double) ((2*i+j)*init));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#times(MatrixError)}.
	 */
	@Test
	public void testTimesMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#times(double)}.
	 */
	@Test
	public void testTimesDouble() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = A.times(constant);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) (((2*i+j)*init)+constant)*constant);	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#times(MatrixError, MatrixError)}.
	 */
	@Test
	public void testTimesMatrixErrorMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#times(MatrixError, double)}.
	 */
	@Test
	public void testTimesMatrixErrorDouble() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = MatrixError.times(A,constant);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) (((2*i+j)*init)+constant)*constant);	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#timesEquals(MatrixError)}.
	 */
	@Test
	public void testTimesEqualsMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#timesEquals(double)}.
	 */
	@Test
	public void testTimesEqualsDouble() {
		MatrixError A = new MatrixError(MatrixA);
		A.timesEquals(constant);
		
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & A.getElement(i,j)==((double)(((i+j)*init)+constant)*constant);	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#inverse()}.
	 */
	@Test
	public void testInverse() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#inverse(MatrixError)}.
	 */
	@Test
	public void testInverseMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#transpose()}.
	 */
	@Test
	public void testTranspose() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = A.transpose();
		
		boolean bool = true;
		for(int i=0;i<colNb;i++){
    		for(int j=0;j<rowNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ( (i+2*j)*init+constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#transpose(MatrixError)}.
	 */
	@Test
	public void testTransposeMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = MatrixError.transpose(A);
		
		boolean bool = true;
		for(int i=0;i<colNb;i++){
    		for(int j=0;j<rowNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) ( (i+2*j)*init+constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#opposite()}.
	 */
	@Test
	public void testOpposite() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = A.opposite();
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) -((2*i+j)*init + constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#opposite(MatrixError)}.
	 */
	@Test
	public void testOppositeMatrixError() {
		MatrixError A = new MatrixError(MatrixA);
		MatrixError MatrixErrorResult = MatrixError.opposite(A);
		boolean bool = true;
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		bool = bool & MatrixErrorResult.getElement(i,j)==((double) -((2*i+j)*init + constant));	
    		}   	
		}
		assertTrue(bool);
	}

	/**
	 * Test method for {@link MatrixError#trace()}.
	 */
	@Test
	public void testTrace() {
		MatrixError B = new MatrixError(MatrixB);
		double traceResult = B.trace();
		double calc = 0;
		for(int i=0;i<rowNb;i++){
		calc += (double) ((3*i)*init + constant);	
		}		
		assertTrue(traceResult==calc);
		System.out.println("traceResult   :"+traceResult);
		System.out.println("calc          :"+calc);
	}

	/**
	 * Test method for {@link MatrixError#trace(MatrixError)}.
	 */
	@Test
	public void testTraceMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#determinant()}.
	 */
	@Test
	public void testDeterminant() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#determinant(MatrixError)}.
	 */
	@Test
	public void testDeterminantMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#logDeterminant()}.
	 */
	@Test
	public void testLogDeterminant() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#logDeterminant(MatrixError)}.
	 */
	@Test
	public void testLogDeterminantMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#frobeniusNorm()}.
	 */
	@Test
	public void testFrobeniusNorm() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#oneNorm()}.
	 */
	@Test
	public void testOneNorm() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#infinityNorm()}.
	 */
	@Test
	public void testInfinityNorm() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#luDecomp()}.
	 */
	@Test
	public void testLuDecomp() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#luBackSub(double[])}.
	 */
	@Test
	public void testLuBackSub() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#solveLinearSet(double[])}.
	 */
	@Test
	public void testSolveLinearSet() {
		fail("Not yet implemented"); // TODO
	}

}
