package com.javastreamexercises.challenges.challenge9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge9 {

  /**
   * Challenge 9: Reverse Each Word in a Sentence Given a sentence, reverse each word while
   * maintaining the word order. String sentence = "Java Streams are powerful"; Expected output:
   * "avaJ smaertS era lufrewop"
   **/
  public String solutionChallenge9(String sentence) {
    /*
      First we transform the string into a list using split() and Arrays.stream
      After this, we use the map() together with the StringBuilder to reverse each word in the list
      To finish the operation we collect joining the strings in the list with a space
     */
    return Arrays.stream(sentence.split(" "))
        .map(str -> new StringBuilder(str).reverse().toString())
        .collect(Collectors.joining(" "));

  }
}

class TestChallenge9 {

  @Test
  void testChallenge9() {
    var challenge9 = new Challenge9();
    var sentence = "Java Streams are powerful";

    var result = challenge9.solutionChallenge9(sentence);

    assertEquals("avaJ smaertS era lufrewop", result);
  }
}