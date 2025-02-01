package com.javastreamexercises.challenges.challenge5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge5 {

  /**
   * Grouping and Counting Given a list of words, count the occurrences of each word. List words =
   * List.of("apple", "banana", "apple", "orange", "banana", "apple"); Expected output: {apple=3,
   * banana=2, orange=1}
   **/
  public Map<String, Long> solutionChallenge5(List<String> listOfWords) {
    /*
      To achieve this, first we must return a Map<String, Long>. To manage to do this, first we must
      group the elements using the Collectors.groupingBy(). The first argument is the key, in our case will be the word
      of the list, the second argument is the counter that will count the number of elements in each group.
      The result will b
     */
    return listOfWords.stream()
        .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

  }
}

class TestChallenge5 {

  @Test
  void testChallenge5() {
    var challenge5 = new Challenge5();
    var listOfStrings = List.of("apple", "banana", "apple", "orange", "banana", "apple");

    var result = challenge5.solutionChallenge5(listOfStrings);

    assertEquals(3, result.get("apple"));
    assertEquals(2, result.get("banana"));
    assertEquals(1, result.get("orange"));
  }
}
