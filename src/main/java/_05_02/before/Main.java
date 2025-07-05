package _05_02.before;

import _05_02.before.ThreadExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Thread threadone=new ThreadExample();
        Thread threadtwo=new ThreadExample();

        threadone.setName("first");
        threadtwo.setName("second");

        threadone.start();
        threadtwo.start();
    }

}
