package com.javastreamexercises.challenges.challenge7;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Challenge7 {

  /**
   * Parallel Streams Performance Write a program that processes a large list of numbers (e.g.,
   * summing the squares) using both sequential and parallel streams. Compare the execution time.
   **/
  public Map<String, Long> solutionChallenge7(List<Integer> listOfNumbers) {
    /*
      To achieve the solution, will record the starting and ending time to calculate the squares of a list of 100M of
      numbers using both stream() and parallel stream to see the difference in time, and store the results in a map
      with the keys STREAM and PARALLEL_STREAM.
     */

    var mapOfAmountOfTime = new HashMap<String, Long>();

    var startTimeStream = System.currentTimeMillis();

    listOfNumbers.stream().map(a -> a * a).reduce(Integer::sum);

    var endTimeStream = System.currentTimeMillis();

    var resultTimeStream = endTimeStream - startTimeStream;

    System.out.println(
        "Stream time took in ms: " + resultTimeStream);

    mapOfAmountOfTime.put("STREAM", resultTimeStream);

    var startTimeParallelStream = System.currentTimeMillis();

    listOfNumbers.parallelStream().map(a -> a * a).reduce(Integer::sum);

    var endTimeParallelStream = System.currentTimeMillis();

    var resultTimeParallelStream = endTimeParallelStream - startTimeParallelStream;

    System.out.println(
        "Parallel Stream time took in ms: " + resultTimeParallelStream);

    mapOfAmountOfTime.put("PARALLEL_STREAM", resultTimeParallelStream);

    return mapOfAmountOfTime;

  }

  protected static List<Integer> generateBigListOfNumbers() {
    return IntStream.rangeClosed(0, 100_000_000).boxed().toList();
  }
}

class TestChallenge7 {

  @Test
  void testChallenge7() {
    final var streamKey = "STREAM";
    final var parallelStreamKey = "PARALLEL_STREAM";

    var challenge7 = new Challenge7();
    var bigStreamListOfNumbers = Challenge7.generateBigListOfNumbers();

    var result = challenge7.solutionChallenge7(bigStreamListOfNumbers);

    assertTrue(result.get(streamKey) > result.get(parallelStreamKey));
  }

}