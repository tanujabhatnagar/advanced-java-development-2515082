package _06_02.before;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner scanner =new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println(name);

        System.out.println("Please enter your age: ");
    //    Scanner scanner =new Scanner(System.in);
        int age= scanner.nextInt();
        System.out.println(age);
        scanner.nextLine();
        System.out.println("Please enter your occupation: ");
        //    Scanner scanner =new Scanner(System.in);
        String occupation= scanner.nextLine();
        System.out.println(occupation);


    }

}
