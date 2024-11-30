package com.csc;

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
 
}

