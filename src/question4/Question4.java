package question4;

public class Question4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= i) {
                    System.out.printf("%d  ", i);
                }
            }
            System.out.println();
        }
    }

}
