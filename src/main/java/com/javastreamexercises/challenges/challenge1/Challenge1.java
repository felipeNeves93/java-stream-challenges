package com.javastreamexercises.challenges.challenge1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class Challenge1 {

  /**
   * Challenge 1: Filtering and Mapping Given a list of words, return a list of words that contain
   * at least five letters, converted to uppercase.
   * <p>
   * List words = List.of("apple", "java", "stream", "lambda", "code");
   * <p>
   * Expected output: ("APPLE", "STREAM", "LAMBDA")
   **/
  public List<String> solutionChallenge1(List<String> listOfWords) {
    /*
      First we apply the filter() function keep only the elements that have >= 5 letters
      Then, we transform the remaining words to uppercase with the map(String::toUpperCase) function
      And we collect this in a new list with the toList() function
     */
    return listOfWords.stream()
        .filter(a -> a.length() >= 5)
        .map(String::toUpperCase)
        .toList();
  }
}

class TestChallenge1 {

  @Test
  void testChallenge1() {
    var challenge1 = new Challenge1();
    var listOfWords = List.of("apple", "java", "stream", "lambda", "code");

    var newList = challenge1.solutionChallenge1(listOfWords);

    assertEquals(3, newList.size());
    assertEquals("APPLE", newList.get(0));
    assertEquals("STREAM", newList.get(1));
    assertEquals("LAMBDA", newList.get(2));
  }
}
