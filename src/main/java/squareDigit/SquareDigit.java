package squareDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {
    public static void main(String[] args) {
        Integer m = 123;
        String numbers = String.valueOf(m);
        String[] digits2 = numbers.split("");
        List<String> digits3 = new ArrayList<>();
        for (String i : digits2) {
            digits3.add(i);
        }
    }
}
