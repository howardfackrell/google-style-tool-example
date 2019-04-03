package hello;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
  public static void main(String[] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());

      List<String> fruits = new ArrayList<>();
      fruits.add("Apple");
      fruits.add("Banana");
      fruits.add("Pear");
      fruits.add("Orange");
      fruits.add("Blueberry");

      fruits
              .stream()
              .filter(fruit ->
                      fruit.contains("a"))
              .forEach(System.out::println);
  }
}
