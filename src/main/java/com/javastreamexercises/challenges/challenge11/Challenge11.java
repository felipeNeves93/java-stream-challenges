package com.javastreamexercises.challenges.challenge11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge11 {

  /**
   * Challenge 11: Count Vowel Occurrences Count the number of occurrences of each vowel (a, e, i,
   * o, u) in a string. String text = "Functional programming is awesome!"; Expected output: {a=3,
   * e=2, i=3, o=3, u=1}
   **/
  public Map<String, Long> solutionChallenge11(String sentence) {
    var vowelSet = Set.of("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");
    /*
      First transform into a stream of strings.
      After that we filter to let only the vowels present
      To finish we collect counting the amount of times each vowel appears.
     */
    return Arrays.stream(sentence.split(""))
        .filter(vowelSet::contains)
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
  }
}

class TestChallenge11 {

  @Test
  void testChallenge11() {
    var challenge11 = new Challenge11();
    var sentence = "Functional programming is awesome!";

    var result = challenge11.solutionChallenge11(sentence);

    assertEquals(3, result.get("a"));
    assertEquals(2, result.get("e"));
    assertEquals(3, result.get("i"));
    assertEquals(3, result.get("o"));
    assertEquals(1, result.get("u"));
  }
}