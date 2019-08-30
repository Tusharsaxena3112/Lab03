package question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }
        System.out.println(sum);
    }
}
