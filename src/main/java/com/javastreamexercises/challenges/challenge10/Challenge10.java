package com.javastreamexercises.challenges.challenge10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge10 {

  /**
   * Challenge 10: Challenge 10: Find Most Frequent Character (Ignoring Spaces) Given a string, find
   * the most frequently occurring character. If multiple characters have the same frequency, return
   * any one of them. String text = "success is a journey not a destination"; Expected output: 's'
   * (or any valid most frequent character)"
   **/
  public String solutionChallenge10(String sentence) {
    /*
      First we remove the spaces from the string, and transform into a stream of characters.
      After that, we count the amount of times each character appears using the groupingBy and counting.
      After that we get the values from the map with entrySet, get the max value using max() passing the comparingByValue
      method, and get the key.
     */
    return Arrays.stream(sentence.replaceAll(" ", "").split(""))
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
        .entrySet()
        .stream().max(Map.Entry.comparingByValue())
        .map(Map.Entry::getKey)
        .get();


  }
}

class TestChallenge10 {

  @Test
  void testChallenge10() {
    var challenge10 = new Challenge10();
    var sentence = "success is a journey not a destination";

    var result = challenge10.solutionChallenge10(sentence);

    assertEquals("s", result);
  }
}