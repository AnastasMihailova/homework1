package task;

import java.util.stream.IntStream;

public class task2 {
    public static void main(String[] args) {
 //[3, 4, 2, 7], 10 -> [3, 7] - вывести пару менно в скобках, которые дают сумму - 10
        int[] input = {2, 4, 3, 3};
        int sum = 10;
        IntStream.range(0,  input.length)
                .forEach(i -> IntStream.range(0,  input.length)
                        .filter(j -> i != j && input[i] + input[j] == sum)
                        .forEach(j -> addPairs(input[i], input[j]))
                );

    }

    private static void addPairs(int i, int i1) {
    }
}
