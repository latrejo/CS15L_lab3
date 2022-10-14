import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1,2,3 };
    assertArrayEquals(new int[]{3,2,1}, ArrayExamples.reversed(input1));
  }


  @Test 
	public void testNegativeInPlace() {
    int[] input1 = { -3,-2,-1};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ -1,-2,-3 }, input1);
	}

  @Test 
	public void tesArrayInPlace() {
    int[] input1 = { 2,1,3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3,1,2 }, input1);
	}

  @Test 
	public void AverageofArray() {
    double[] input1 = { 3,4,4,2,6,8};
    assertEquals( 5.0,ArrayExamples.averageWithoutLowest(input1),0.0000001 );
	}
  @Test 
	public void AverageofArray2() {
    double[] input1 = { 1,3,5};
    assertEquals( 4.0, ArrayExamples.averageWithoutLowest(input1), 0.0000001);
	}
  @Test 
	public void AverageofArray3() {
    double[] input1 = { 1,1,3,5};
    assertEquals( 4.0, ArrayExamples.averageWithoutLowest(input1), 0.0000001);
	}

}
