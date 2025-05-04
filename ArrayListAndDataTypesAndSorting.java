import java.util.ArrayList;
import java.util.Collections;
public class ArrayListAndDataTypesAndSorting {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //For ArrayList, you can not use primitive Data Types(int, boolean, double, char, etc)
        //You need to use Object or Wrapper Class Equivalent(Integer, Boolean, Double, Character)

        numbers.add(34);
        numbers.add(12);
        numbers.add(100);
        numbers.add(-22);

        System.out.println(numbers);

        //Removing element at index 1
//
//        numbers.remove(1);
//        System.out.println(numbers);

        //Second methods

        numbers.remove(Integer.valueOf(1));
        System.out.println(numbers);

        //sorting  using Collections.sort()

        Collections.sort(numbers);
        System.out.println(numbers);

    }
}
