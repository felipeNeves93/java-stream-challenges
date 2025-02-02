package com.javastreamexercises.challenges.challenge13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge13 {

  /**
   * Remove Duplicates and Sort Characters in a String Given a string, remove duplicate characters
   * and return them sorted. String text = "banana"; Expected output: "abn"
   **/
  public String solutionChallenge13(String word) {
    /*
      First we convert the word into a stream of chars using chars and mapToObj.
      After that, we remove all duplicated chars using distinct, and sort by natural order with the sorted()
      To finish, we just map the chars to a string using map(String::valueOf) and return the new string with collectors.joining()
     */
    return word.chars()
        .mapToObj(ch -> (char) ch)
        .distinct()
        .sorted(Comparator.naturalOrder())
        .map(String::valueOf)
        .collect(Collectors.joining(""));


  }
}

class TestChallenge13 {

  @Test
  void testChallenge13() {
    var challenge13 = new Challenge13();
    var sentence = "banana";

    var result = challenge13.solutionChallenge13(sentence);

    assertEquals("abn", result);

  }
}