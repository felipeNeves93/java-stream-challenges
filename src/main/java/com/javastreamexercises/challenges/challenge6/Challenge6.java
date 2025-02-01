package com.javastreamexercises.challenges.challenge6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Challenge6 {

  /**
   * Finding the First Matching Element Find the first even number greater than 10 in a list. List
   * numbers = List.of(3, 7, 10, 12, 15, 18); Expected output: 12
   **/
  public Integer solutionChallenge6(List<Integer> listOfNumbers) {
    /*
     First we filter for all elements that are greater than 10 and are even using the .filter(n -> (n > 10) && (n % 2 == 0)),
     and after that, we get the first element using the .findFirst().orElse(0). In this case we are using
     the orElse(0) to return a number 0 if not found, but you can return the findFirst() as a optional.
     */
    return listOfNumbers.stream()
        .filter(n -> (n > 10) && (n % 2 == 0))
        .findFirst().orElse(0);
  }
}

class TestChallenge6 {

  @Test
  void testChallenge6() {
    var challenge6 = new Challenge6();
    var listOfNumbers = List.of(3, 7, 10, 12, 15, 18);

    var result = challenge6.solutionChallenge6(listOfNumbers);

    assertEquals(12, result);
  }
}