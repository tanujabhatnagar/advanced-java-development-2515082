package _02_03.before;

import java.util.Arrays;
import java.util.List;

public class BoundedGenerics {

    public static void main(String[] args) {
        Double[] doubles = {1.3, 30.4, 30.2};
        Integer[] numbers = {1, 5, 7};
        List<Double> wordsList = convertArrayToList(doubles);
        List<Integer> numbersList = convertArrayToList(numbers);
        System.out.println(wordsList);
        System.out.println(numbersList);
    }

    private static <T extends Number> List<T> convertArrayToList(T[] array) {
        return Arrays.asList(array);
    }


}