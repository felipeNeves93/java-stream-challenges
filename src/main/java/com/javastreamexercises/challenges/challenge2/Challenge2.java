package com.javastreamexercises.challenges.challenge2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Challenge2 {

  /**
   * Sorting and Distinct Elements Given a list of integers, return a sorted list with unique
   * values. List numbers = List.of(5, 3, 7, 5, 2, 3, 9); Expected output: (2, 3, 5, 7, 9)
   **/
  public List<Integer> solutionChallenge2(List<Integer> listOfNumbers) {
    /*
      We just need to apply the distinct() function to remove the duplicates and sort by natural order using sorted().
     */
    return listOfNumbers.stream()
        .distinct()
        .sorted()
        .toList();
  }
}

class TestChallenge2 {

  @Test
  void testChallenge2() {
    var challenge2 = new Challenge2();
    var listOfNumbers = List.of(5, 3, 7, 5, 2, 3, 9);

    var newList = challenge2.solutionChallenge2(listOfNumbers);

    assertEquals(5, newList.size());
    assertEquals(2, newList.get(0));
    assertEquals(3, newList.get(1));
    assertEquals(5, newList.get(2));
    assertEquals(7, newList.get(3));
    assertEquals(9, newList.get(4));
  }
}
