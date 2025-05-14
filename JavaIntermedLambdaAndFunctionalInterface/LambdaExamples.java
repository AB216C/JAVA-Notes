package JavaIntermedLambdaAndFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaExamples {
    public static void main(String[] args) {

        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Double every single integer in the list
        List<Integer> doubled = new ArrayList<>();

        for (int number : numbers) {
            doubled.add(number * 2);
        }

        System.out.println(doubled);
    }
}