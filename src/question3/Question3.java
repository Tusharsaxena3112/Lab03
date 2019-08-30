package question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(celsius);
    }
}
