package _04_02.before;

public class Main {

    public static void main(String[] args) {
        Greeting helloWorldGreeting = () -> System.out.println("Hello Tanuja");
        helloWorldGreeting.printMessage();
        Greeting goodMorningGreeting=() -> System.out.println("Good Morning");
        goodMorningGreeting.printMessage();
        Greeting goodAfternoonGreeting=()-> System.out.println("Good Afternoon");
        goodAfternoonGreeting.printMessage();
    }

}
