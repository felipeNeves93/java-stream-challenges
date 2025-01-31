## Java Streams concepts and exercises

* **What are they?** 
  * Java Streams API is used for functional-style operations on collections,
  enabling efficient and declarative data processing. They are divided in types of operations.


* **Creating Streams**

  * _Stream.of()_ – Creates a stream from values.
  * _Arrays.stream(array)_ – Converts an array into a stream.
  * _Collection.stream()_ – Converts a collection into a stream.
  

* **Intermediate Operations (Transformations)**

  * _map(Function<T, R>)_ – Transforms each element.
  * _filter(Predicate<T>)_ – Keeps elements that satisfy a condition.
  * _sorted(Comparator<T>)_ – Sorts elements.
  * _distinct()_ – Removes duplicates.
  * _flatMap(Function<T, Stream<R>>)_ – Flattens nested structures.


* **Terminal Operations (Final Results)**

  * _collect(Collectors.toList())_ – Collects elements into a list.
  * _forEach(Consumer<T>)_ – Iterates over elements.
  * _reduce(BinaryOperator<T>)_ – Aggregates values (e.g., sum, product).
  * _count()_ – Counts elements.
  * _findFirst() / findAny()_ – Retrieves an element.
    

* **Short-Circuiting Operations**

  * _limit(n)_ – Takes the first n elements.
  * _skip(n)_ – Skips the first n elements.
  * _anyMatch() / allMatch() / noneMatch()_ – Tests predicates.
  

* **Parallel Streams**
  * _parallelStream()_ – Enables parallel execution for better performance on large datasets.


* **Exercises to practice** 


* There will be a _challengeN_ package for each proposed challenge inside the _com.java.streamexercises_.
* For each challenge, there will be a **MainClass** with the explained solution, and a nested **TestClass** to 
assert the condition of the challenge
---
  
* **Challenge 1:** Filtering and Mapping
  Given a list of words, return a list of words that contain at least five letters, converted to uppercase.

  List<String> words = List.of("apple", "java", "stream", "lambda", "code");
  
  **Expected output:**
  ("APPLE", "STREAM", "LAMBDA")
---

* **Challenge 2:** Sorting and Distinct Elements
    Given a list of integers, return a sorted list with unique values.
  List<Integer> numbers = List.of(5, 3, 7, 5, 2, 3, 9);
  **Expected output:**
  (2, 3, 5, 7, 9)
---

* **Challenge 3:** Reduce for Aggregation
Find the product of all numbers in a list using reduce().
List<Integer> numbers = List.of(2, 3, 4, 5);
**Expected output:**
120
---

* **Challenge 4:** FlatMap for Nested Lists
Flatten a list of lists into a single list.
List<List<Integer>> nestedList = List.of(
List.of(1, 2, 3),
List.of(4, 5),
List.of(6, 7, 8)
);
**Expected output:**
[1, 2, 3, 4, 5, 6, 7, 8]
---

* **Challenge 5:** Grouping and Counting
Given a list of words, count the occurrences of each word.
List<String> words = List.of("apple", "banana", "apple", "orange", "banana", "apple");
**Expected output:**
{apple=3, banana=2, orange=1}
---

* **Challenge 6:** Finding the First Matching Element
Find the first even number greater than 10 in a list.
List<Integer> numbers = List.of(3, 7, 10, 12, 15, 18);
**Expected output:**
12
---

* **Challenge 7:** Parallel Streams Performance
Write a program that processes a large list of numbers (e.g., summing the squares) 
using both sequential and parallel streams. Compare the execution time.
---

* **Challenge 8:** Find the Longest Word
Given a sentence, find the longest word.
String sentence = "The quick brown fox jumps over the lazy dog";
**Expected output:**
"jumps"
---

* **Challenge 9:** Reverse Each Word in a Sentence
Given a sentence, reverse each word while maintaining the word order.
String sentence = "Java Streams are powerful";
**Expected output:**
"avaJ smaertS era lufrewop"
---

* **Challenge 10:** Find Most Frequent Character (Ignoring Spaces)
Given a string, find the most frequently occurring character. If multiple characters have the same frequency, return any one of them.
String text = "success is a journey not a destination";
**Expected output:**
's' (or any valid most frequent character)
---

* **Challenge 11:** Count Vowel Occurrences
Count the number of occurrences of each vowel (a, e, i, o, u) in a string.
String text = "Functional programming is awesome!";
**Expected output:**
{a=2, e=2, i=3, o=3, u=2}
---

* **Challenge 12:** Find the First Non-Repeating Character
Given a string, find the first character that does not repeat.
String text = "swiss";
**Expected output:**
'w'
---

* **Challenge 13:** Remove Duplicates and Sort Characters in a String
Given a string, remove duplicate characters and return them sorted.
String text = "banana";
**Expected output:**
"abn"
---

* **Challenge 14:** Check If Two Strings Are Anagrams
Check if two strings are anagrams of each other (contain the same letters in any order).
String s1 = "listen";
String s2 = "silent";
**Expected output:**
true
---
* **Challenge 15:** Find the Word with the Most Vowels
Given a sentence, find the word that contains the most vowels.
String sentence = "education is the key to success";
**Expected output:**
"education"
---

* **Challenge 16:** Convert a Map<K, V> to a List<String>
Given a Map<Integer, String>, convert it into a List<String> where each element is in the format "key=value".
Map<Integer, String> map = Map.of(
1, "Apple",
2, "Banana",
3, "Cherry"
);
**Expected output:**
["1=Apple", "2=Banana", "3=Cherry"]
---

* **Challenge 17:** Convert a List<String> to a Map<K, V>
Given a List<String> of key-value pairs ("key=value" format), convert it into a Map<Integer, String>.
List<String> list = List.of("1=Apple", "2=Banana", "3=Cherry");
**Expected output:**
{1=Apple, 2=Banana, 3=Cherry}
---



