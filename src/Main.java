import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (; ; ) {

            System.out.println("Введите число: ");

            int value = new Scanner(System.in).nextInt();

            for (int factor = 0; factor <= value; factor++) {

                for (int factor2 = 0; factor2 <= value; factor2++) {

                    if (factor * factor2 == value) {

                        System.out.println(factor + "*" + factor2);
                    }
                }
            }

        }
    }
}