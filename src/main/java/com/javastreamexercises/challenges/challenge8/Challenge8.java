package com.javastreamexercises.challenges.challenge8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.jupiter.api.Test;

public class Challenge8 {

  /**
   * Challenge 8: Find the Longest Word Given a sentence, find the longest word. String sentence =
   * "The quick brown fox jumps over the lazy dog"; Expected output: "jumps"
   **/
  public String solutionChallenge8(String sentence) {
    /*
      First we transform the string into a list using split and transforming the array into a list
      After this, we sort in natural order by string length and transform into a list again
      To finish the operation we convert to a list again and take the last element
     */
    return Arrays.stream(sentence.split(" "))
        .sorted(Comparator.comparingInt(String::length))
        .toList()
        .getLast();

  }
}

class TestChallenge8 {

  @Test
  void testChallenge8() {
    var challenge8 = new Challenge8();
    var sentence = "The quick brown fox jumps over the lazy dog";

    var result = challenge8.solutionChallenge8(sentence);

    assertEquals("jumps", result);
  }
}