package PerfectNum;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> listPerfNum = new ArrayList<>();

        System.out.println("Please enter a positive Integer");
        int input = s.nextInt();

        boolean check = input > 0;
        if (check) {
            for (int i = 1; i <= input; i++) {
                if (isPerfect(i)) {

                    listPerfNum.add(i);
                }
            }
            System.out.println("List of Perfect Number in between 1 and "+input+" is "+listPerfNum);
        } else {
            System.out.println("You have entered a NEGATIVE integer");
        }
    }


    public static boolean isPerfect_functional_style(int input) {
        List<Integer> divisors = IntStream.range(1, input).filter(i -> input % i == 0).boxed().collect(Collectors.toList());
        int sum = divisors.parallelStream().mapToInt(integer -> integer).sum();
        return input == sum;
    }
    public static boolean isPerfect(int input) {
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i < input; i++) {
            if (input % i == 0) {
                divisor.add(i);
            }
        }
        int sumOfDivisor = 0;
        for (Integer integer : divisor) {

            sumOfDivisor += integer;
        }
        return input == sumOfDivisor;
    }
}
