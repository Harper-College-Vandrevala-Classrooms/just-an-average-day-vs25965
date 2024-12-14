package com.csc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {

  Calculator calculator;
  int[] _try = {1,11,5,0}; 
  int[] emptySet = {}; 

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void minimumUsingForLoopTest() {
    int min_ = calculator.minimumUsingForLoop(_try );
   assertEquals(0,min_ );
  }
  @Test
  void maximumUsingForLoopTest() {
   assertEquals(11,calculator.maximumUsingForLoop(_try));
  }
  @Test
  void sumUsingForLoopTest() {
   assertEquals(17,calculator.sumUsingForLoop(_try));
  }
  @Test
  void averageUsingForLoopTest() {
   assertEquals(4,calculator.averageUsingForLoop(_try));
  }
  @Test
  void minimumUsingStreamTest() {
    int min_ = calculator.minimumUsingStream(_try );
   assertEquals(0,min_ );
  }
  @Test
  void maximumUsingStream() {
   assertEquals(11,calculator.maximumUsingStream(_try));
  }
  @Test
  void sumUsingStreamTest() {
   assertEquals(17,calculator.sumUsingStream(_try));
  }
  @Test
  void averageUsingStreamTest() {
   assertEquals(4,calculator.averageUsingStream(_try));
  }

  //Test empty set 
  @Test
  void minimumUsingForLoopTest2() {
    int min_ = calculator.minimumUsingForLoop(emptySet);
   assertEquals(-1,min_ );
  }
  @Test
  void sumUsingForLoopTest2() {
   assertEquals(-1,calculator.sumUsingForLoop(emptySet));
  }
  @Test
  void averageUsingForLoopTest2() {
   assertEquals(-1,calculator.averageUsingForLoop(emptySet));
  }

  @Test
  void sumUsingStreamTest2() {
   assertEquals(-1,calculator.sumUsingStream(emptySet));
  }

  //Add-ons unit tests
  @Test 
  void evensOnlyTest(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] expected = {2, 4, 6, 8, 10};
    int[] result =calculator.evensOnly(input);
    assertArrayEquals(expected, result);

  }
  @Test 
  void oddsOnlyTest(){
    int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[]expected = {1,3,5,7,9};
    int[] result = calculator.oddsOnly(input);
    assertArrayEquals(expected, result);

  }
   @Test
   void incrementByFiveTest() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {6, 7, 8, 9, 10};
        int[] result = calculator.incrementByFive(input);
        assertArrayEquals(expected, result);
    }
    @Test
    void testSquareNumbers() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 9, 16, 25};
        int[] result = calculator.squareNumbers(input);
        assertArrayEquals(expected, result);
    }
}

