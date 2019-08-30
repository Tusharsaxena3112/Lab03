package question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amt = input.nextDouble();
        long amt1 = (int) (amt * 100);
        long rupees = (amt1 - (amt1 % 100)) / 100;
        long paise = amt1 % 100;
        System.out.println(rupees + " rupees " + " and " + paise + " paise");
    }
}
