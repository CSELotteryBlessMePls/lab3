import static org.junit.Assert.*;

import java.lang.reflect.Array;

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
  public void testReversedLonger() {
    int[] input1 = {1, 2, 3};
    int[] input1correct = {3, 2, 1};
    assertArrayEquals(input1correct, ArrayExamples.reversed(input1));
  }

  @Test 
  public void testAverageWithoutLowest() {
    double[] test1 = {50, 1, 50, 50, 1, 1};
    double[] test2 = {10,10,10};
    //double[] test1result = {(Double) ArrayExamples.averageWithoutLowest(test1)};
    //double[] test1expected = {(Double) 6.0};
    //assertArrayEquals(test1expected, test1result);
    assertEquals(50.0, ArrayExamples.averageWithoutLowest(test1), .05);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(test2), .05);
  }
}
