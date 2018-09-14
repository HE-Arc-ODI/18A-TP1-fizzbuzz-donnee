import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz fb;

  @Before
  public void setup(){
  }

  @Test
  public void testListSize() {
    // Arrange
    FizzBuzz fb = new FizzBuzz(3);
    List<String> expected = Arrays.asList(null, null, null);
    // Act
    List<String> actual = fb.getNumbers();
    // Assert
    assertThat(actual.size(), is(expected.size()));
  }

  /**
   * Replaces 3 by Fizz
   */
  @Test
  public void replace3ByFizz() {
    // Arrange
    List<String> expected = Arrays.asList("1", "2", "Fizz");
    FizzBuzz fb = new FizzBuzz(expected.size());
    // Act
    List<String> actual = fb.generateList();
    // Assert
    assertThat(actual, is(expected));
  }

}