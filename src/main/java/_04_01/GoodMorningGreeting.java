package _04_01;

import _04_01.Greeting;

public class GoodMorningGreeting implements Greeting {

    @Override
    public void printMessage() {
        System.out.println("Good morning");
    }
}
