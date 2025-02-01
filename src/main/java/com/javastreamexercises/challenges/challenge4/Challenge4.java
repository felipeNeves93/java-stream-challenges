package com.javastreamexercises.challenges.challenge4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

public class Challenge4 {

  /**
   * FlatMap for Nested Lists Flatten a list of lists into a single list. List<List> nestedList =
   * List.of( List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8) ); Expected output: [1, 2, 3, 4, 5,
   * 6, 7, 8]
   **/
  public List<Integer> solutionChallenge4(List<List<Integer>> listOflistOfNumbers) {
    /*
      Since we have a nested structure, we have to use the flatMap to apply to each list in the stream
      The Collection::stream method reference is used to convert each list into a stream of elements
      At the end, jo gather all the elements in the stream into one list, the toList() method is used
     */
    return listOflistOfNumbers.stream()
        .flatMap(Collection::stream)
        .toList();
  }
}

class TestChallenge4 {

  @Test
  void testChallenge4() {
    var challenge4 = new Challenge4();
    var listOfListOfNumbers = List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8));

    var result = challenge4.solutionChallenge4(listOfListOfNumbers);

    assertEquals(8, result.size());
    assertEquals(1, result.get(0));
    assertEquals(2, result.get(1));
    assertEquals(3, result.get(2));
    assertEquals(4, result.get(3));
    assertEquals(5, result.get(4));
    assertEquals(6, result.get(5));
    assertEquals(7, result.get(6));
    assertEquals(8, result.get(7));

  }
}
