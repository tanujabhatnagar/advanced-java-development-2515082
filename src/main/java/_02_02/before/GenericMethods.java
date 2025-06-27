package _02_02.before;

import java.util.Arrays;
import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {
        String[] words = {"apple", "banana", "pear"};
        Integer[] numbers = {1, 5, 7};
        List<String> wordlist=converArrayToList(words);
        List<Integer> numblist=converArrayToList(numbers);
        System.out.println(wordlist);
        System.out.println(numblist);
    }

    private static <T> List<T> converArrayToList(T[] array){
        return Arrays.asList(array);
    }





}
