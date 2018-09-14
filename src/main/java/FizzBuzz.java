import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

  private List<String> numbers;

  public FizzBuzz(int length) {
    numbers = new ArrayList<>();
    for(int i=0; i<length; i++){
      numbers.add(String.valueOf(i+1));
    }
  }

  public List<String> generateList(){
    // TODO implement the FizzBuzz
    return numbers;
  }

  public List<String> getNumbers() {
    return numbers;
  }
}
