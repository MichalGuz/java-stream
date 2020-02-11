package squareDigit;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareDigit {
    public static void main(String[] args) {
        Integer m = 123;
        String numbers = String.valueOf(m);
        String[] digits2 = numbers.split("");
        List<String> digits3 = new ArrayList<>();
        for (String i : digits2) {
            digits3.add(i);
            System.out.println(i);
        }

        List<Integer> ddd = digits3.stream()
                .mapToInt(v -> digits3.indexOf(v))
                .map(v -> v*v)
                .mapToObj(o -> o)
                .collect(Collectors.toList());

        for(Integer ints: ddd) {
            System.out.println(ints);
        }
    }
}
