package squareDigit;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {
    public static void main(String[] args) {
        Integer m = 321;
        String numbers = String.valueOf(m);
        String[] digits1 = numbers.split("");
        List<Integer> digits2 = new ArrayList<>();
        List<Integer> digits3 = new ArrayList<>();


        for (int r = 0; r < digits1.length; r++) {
            Integer in = Integer.parseInt(digits1[r]);
            digits2.add(in);
            System.out.println(in);
            for (int sq = 0; sq < digits2.size(); sq++) {
                Integer dd = (digits2.get(sq)) * (digits2.get(sq));
                digits3.add(dd);
                System.out.println("dd " + dd);
            }
        }
    }
}