package com.javastreamexercises.challenges.challenge3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Test;

public class Challenge3 {

  /**
   * Reduce for Aggregation Find the product of all numbers in a list using reduce(). List numbers =
   * List.of(2, 3, 4, 5); Expected output: 120
   **/
  public Optional<Integer> solutionChallenge3(List<Integer> listOfNumbers) {
    /*
      We just need to apply the reduce() function to find the product of the given numbers.
      We just need to pass one argument, the binaryOperator, which is a functional interface where we define the type
      of operation that we are going to use, in this case, multiplication.
      In this example we are not providing a identity value, so, the result can be empty, hence why we are returning an Optional
     */
    return listOfNumbers.stream()
        .reduce((a, b) -> a * b);
  }
}

class TestChallenge3 {

  @Test
  void testChallenge3() {
    var challenge3 = new Challenge3();
    var listOfNumbers = List.of(2, 3, 4, 5);

    var result = challenge3.solutionChallenge3(listOfNumbers);

    assertTrue(result.isPresent());
    assertEquals(120, result.get());

  }
}
