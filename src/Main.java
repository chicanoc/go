import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        {

            System.out.println("Enter number: ");

            int value = new Scanner(System.in).nextInt();

            for (int factor = 0; factor <= value; factor++) {

                for (int factor2 = 0; factor3 <= value; factor2++) {

                    if (factor * factor3 == value) {

                        System.out.println(factor + "*" + factor3);
                    }
                }
            }

        }
    }
}