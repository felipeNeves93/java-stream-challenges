package com.javastreamexercises.challenges.challenge16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class Challenge16 {

  /**
   * Convert a Map<K, V> to a List Given a Map<Integer, String>, convert it into a List where each
   * element is in the format "key=value". Map<Integer, String> map = Map.of( 1, "Apple", 2,
   * "Banana", 3, "Cherry" ); Expected output: ["1=Apple", "2=Banana", "3=Cherry"]
   **/
  public List<String> solutionChallenge16(Map<Integer, String> map) {
    /*
    To convert to a map, first we have to get the entrySet, and then, use the map function to transform
    to the desired format, in this case .map(key=value), and then sort by natural order with sorted()
     */
    return map.entrySet()
        .stream()
        .map(entry -> entry.getKey() + "=" + entry.getValue())
        .sorted()
        .toList();

  }
}

class TestChallenge16 {

  @Test
  void testChallenge16() {
    var challenge16 = new Challenge16();

    var map = Map.of(1, "Apple", 2,
        "Banana", 3, "Cherry");

    var result = challenge16.solutionChallenge16(map);

    assertEquals(3, result.size());
    assertEquals("1=Apple", result.get(0));
    assertEquals("2=Banana", result.get(1));
    assertEquals("3=Cherry", result.get(2));

  }
}