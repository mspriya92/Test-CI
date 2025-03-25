package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class RunnerTest {
  
  private Runner runner = new Runner();

  @Test
  public void runnerSaysRunner() {
    assertThat(runner.sayRunner(), containsString("Test"));
  }

}
