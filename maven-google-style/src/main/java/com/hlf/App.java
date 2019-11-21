package com.hlf;

import java.util.ArrayList;
import java.util.List;

/** Hello world! */
public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    List<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Pear");
    fruits.add("Orange");
    fruits.add("Blueberry");

    fruits.stream().filter(fruit -> fruit.contains("a")).forEach(System.out::println);
  }

  //  private void doStuff() {
  //    System.out.println("this method never gets called");
  //  }
}
