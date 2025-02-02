package com.javastreamexercises.challenges.challenge15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge15 {

  /**
   * Find the Word with the Most Vowels Given a sentence, find the word that contains the most
   * vowels. String sentence = "education is the key to success"; Expected output: "education"
   **/
  public String solutionChallenge15(String sentence) {
    var vowels = Set.of('a', 'e', 'i', 'o', 'u');
    /*
      First we create a set containing the vowels. With the set created, we then transform the
      sentence to lowercase and to a list of words using the Arrays.stream and split.
      After that, we then convert the newly created list into a map, using the Collectors.toMap function,
      where the keys will be the words, and the values the count of vowels present in each, achived by transforming the
      word in an array of chars, and then filter counting only the vowels present in the word with .filter(vowel::contains) and count().
      To finish, whe get the key with the most vowels using the .max() with the comparingByValue comparator, and then,
      force a map to get the key and return the word or an empty string if not exists.
     */
    return Arrays.stream(sentence.toLowerCase().split(" "))
        .collect(Collectors.toMap(word -> word,
            word -> word.chars()
                .mapToObj(w -> (char) w)
                .filter(vowels::contains)
                .count()))
        .entrySet()
        .stream()
        .max(Map.Entry.comparingByValue())
        .map(Map.Entry::getKey)
        .orElse("");

  }
}

class TestChallenge15 {

  @Test
  void testChallenge15() {
    var challenge15 = new Challenge15();

    var sentence = "education is the key to success";

    var result = challenge15.solutionChallenge15(sentence);

    assertEquals("education", result);

  }
}