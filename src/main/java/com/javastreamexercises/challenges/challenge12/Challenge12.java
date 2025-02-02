package com.javastreamexercises.challenges.challenge12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge12 {

  /**
   * Find the First Non-Repeating Character Given a string, find the first character that does not
   * repeat. String text = "swiss"; Expected output: 'w'
   **/
  public Character solutionChallenge12(String word) {
    /*
      First we convert the word into a stream of chars using chars and mapToObj.
      After that, we count the amount of times each char appears in the stream using collectors groupingBy and counting
      After this operation, we create a new stream getting the entrySet of the map, and we get the minValue from the values
      of the map using the min() function.
      To finish we use the map function to get the Key of the entry with the lowest count, and return the value
     */
    return word.chars().mapToObj(ch -> (char) ch)
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting())).entrySet().stream()
        .min(Map.Entry.comparingByValue()).map(Map.Entry::getKey).get();


  }
}

class TestChallenge12 {

  @Test
  void testChallenge12() {
    var challenge12 = new Challenge12();
    var sentence = "swiss";

    var result = challenge12.solutionChallenge12(sentence);

    assertEquals('w', result);

  }
}