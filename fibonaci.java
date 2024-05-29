import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        int fibonacci;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a natural number");
        fibonacci = scanner.nextInt();

        if (fibonacci < 0) {
            System.out.println("error");
            return;
        }

        int sum = 0;
        int f0 = 0;
        int f1 = 1;

        System.out.println(f0);

        if (fibonacci > 0) {
            System.out.println(f1);
        }

        for (int i = 2; i < fibonacci; i++) {
            sum = f0 + f1;
            f0 = f1;
            f1 = sum;
            System.out.println(sum);

        }
    }
}
