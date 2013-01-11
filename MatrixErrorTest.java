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
	int init = 0;
	private double constant;
	private MatrixError MatrixNull;
	private MatrixError MatrixConst;
	private double[][] MatrixA;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		rowNb = 2;
		colNb = 3;
		constant = 1;
		
		MatrixNull = new MatrixError(rowNb,colNb);
		MatrixConst = new MatrixError(rowNb,colNb,constant);
		
		MatrixA = new double[rowNb][colNb];
		for(int i=0;i<rowNb;i++){
    		for(int j=0;j<colNb;j++){
    		MatrixA[i][j] = (double) ((i+j)*init + constant) ;	
    		}   	
		}
		
		
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	
	
	
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
    		bool = bool & A.getElement(i,j)==((double) ((i+j)*init + constant));	
    		}   	
		}
		assertTrue(bool);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentException() {

	}

	/**
	 * Test method for {@link MatrixError#MatrixError(MatrixError)}.
	 */
	@Test
	public void testMatrixErrorMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#setTwoDarray(double[][])}.
	 */
	@Test
	public void testSetTwoDarray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#setElement(int, int, double)}.
	 */
	@Test
	public void testSetElement() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#setSubMatrix(int, int, int, int, double[][])}.
	 */
	@Test
	public void testSetSubMatrixIntIntIntIntDoubleArrayArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#setSubMatrix(int[], int[], double[][])}.
	 */
	@Test
	public void testSetSubMatrixIntArrayIntArrayDoubleArrayArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getMatrixCheck()}.
	 */
	@Test
	public void testGetMatrixCheck() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#identityMatrix(int)}.
	 */
	@Test
	public void testIdentityMatrix() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#scalarMatrix(int, double)}.
	 */
	@Test
	public void testScalarMatrix() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#diagonalMatrix(int, double[])}.
	 */
	@Test
	public void testDiagonalMatrix() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getNrow()}.
	 */
	@Test
	public void testGetNrow() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getNcol()}.
	 */
	@Test
	public void testGetNcol() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getArrayReference()}.
	 */
	@Test
	public void testGetArrayReference() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getArrayPointer()}.
	 */
	@Test
	public void testGetArrayPointer() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getArrayCopy()}.
	 */
	@Test
	public void testGetArrayCopy() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getElement(int, int)}.
	 */
	@Test
	public void testGetElement() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getElementCopy(int, int)}.
	 */
	@Test
	public void testGetElementCopy() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getElementPointer(int, int)}.
	 */
	@Test
	public void testGetElementPointer() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getSubMatrix(int, int, int, int)}.
	 */
	@Test
	public void testGetSubMatrixIntIntIntInt() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getSubMatrix(int[], int[])}.
	 */
	@Test
	public void testGetSubMatrixIntArrayIntArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getIndexReference()}.
	 */
	@Test
	public void testGetIndexReference() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getIndexPointer()}.
	 */
	@Test
	public void testGetIndexPointer() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getIndexCopy()}.
	 */
	@Test
	public void testGetIndexCopy() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#getSwap()}.
	 */
	@Test
	public void testGetSwap() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#copy(MatrixError)}.
	 */
	@Test
	public void testCopyMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#copy()}.
	 */
	@Test
	public void testCopy() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#clone()}.
	 */
	@Test
	public void testClone() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#plus(MatrixError)}.
	 */
	@Test
	public void testPlusMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#plus(MatrixError, MatrixError)}.
	 */
	@Test
	public void testPlusMatrixErrorMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#plusEquals(MatrixError)}.
	 */
	@Test
	public void testPlusEquals() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#minus(MatrixError)}.
	 */
	@Test
	public void testMinusMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#minus(MatrixError, MatrixError)}.
	 */
	@Test
	public void testMinusMatrixErrorMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#minusEquals(MatrixError)}.
	 */
	@Test
	public void testMinusEquals() {
		fail("Not yet implemented"); // TODO
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
		fail("Not yet implemented"); // TODO
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
		fail("Not yet implemented"); // TODO
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
		fail("Not yet implemented"); // TODO
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
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#transpose(MatrixError)}.
	 */
	@Test
	public void testTransposeMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#opposite()}.
	 */
	@Test
	public void testOpposite() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#opposite(MatrixError)}.
	 */
	@Test
	public void testOppositeMatrixError() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link MatrixError#trace()}.
	 */
	@Test
	public void testTrace() {
		fail("Not yet implemented"); // TODO
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
