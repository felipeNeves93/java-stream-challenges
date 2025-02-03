package com.javastreamexercises.challenges.challenge17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

public class Challenge17 {

  /**
   * Convert a List to a Map<K, V> Given a List of key-value pairs ("key=value" format), convert it
   * into a Map<Integer, String>. List list = List.of("1=Apple", "2=Banana", "3=Cherry"); Expected
   * output: {1=Apple, 2=Banana, 3=Cherry}
   **/
  public Map<Integer, String> solutionChallenge17(List<String> list) {
    /*
    To convert to a map with the given conditions, we have to use the Collectors.toMap() using the substring
    function to extract the pieces that we want from the string to correctly form both the key and values
     */
    return list.stream().collect(
        Collectors.toMap(key -> Integer.parseInt(key.substring(0, key.indexOf("="))),
            value -> value.substring(value.indexOf("=") + 1)));

  }
}

class TestChallenge17 {

  @Test
  void testChallenge17() {
    var challenge17 = new Challenge17();

    var list = List.of("1=Apple", "2=Banana", "3=Cherry");

    var result = challenge17.solutionChallenge17(list);

    assertEquals(3, result.size());
    assertEquals("Apple", result.get(1));
    assertEquals("Banana", result.get(2));
    assertEquals("Cherry", result.get(3));

  }
}