package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime currentTime = new LocalTime();
    System.out.println("The current local time is: " + currentTime);
    Greeter greeter = new Greeter();
    Runner runner = new Runner();
    System.out.println(greeter.sayHello());
    System.out.println(runner.sayRunner());
  }
}
