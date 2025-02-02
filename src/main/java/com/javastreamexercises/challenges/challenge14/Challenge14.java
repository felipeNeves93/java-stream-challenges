package com.javastreamexercises.challenges.challenge14;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge14 {

  /**
   * Check If Two Strings Are Anagrams Check if two strings are anagrams of each other (contain the
   * same letters in any order). String s1 = "listen"; String s2 = "silent"; Expected output: true
   **/
  public boolean solutionChallenge14(String s1, String s2) {
    /*
    We are creating here two maps containing the frequency of each chars from each string,
    and then, we are using the equals function to ensure that every char is present on both maps with the same frequency
     */
    return s1.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
        .equals(
            s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
        );


  }
}

class TestChallenge14 {

  @Test
  void testChallenge14() {
    var challenge14 = new Challenge14();

    var str1 = "listen";
    var str2 = "silent";

    var result = challenge14.solutionChallenge14(str1, str2);

    assertTrue(result);

  }
}