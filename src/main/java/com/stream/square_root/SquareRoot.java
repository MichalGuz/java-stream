package com.stream.square_root;

import java.util.stream.IntStream;

public class SquareRoot {
    public Long practice(){
        return IntStream.range(1, 25)
                .mapToObj(x ->IntStream.of(IntStream.range(0,x).sum(), IntStream.range(0,x+1).sum()))
                .map(a -> a.sum())
                .filter(x -> Math.sqrt(x)%1 == 0)
                .count();
    }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        Long result = squareRoot.practice();
        System.out.println(result);
    }
}
