import java.util.Scanner;

public class JavaBasics {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        printStarPattern2(input);
    }

    public static void printStarPattern1(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j < x - i) {
                    System.out.printf(" * ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void printStarPattern2(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (j <= i) {
                    System.out.printf(" * ");
                }
            }
            System.out.printf("\n");
        }
    }

    public static void printSquarePattern(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.printf(" * ");
            }
            System.out.printf("\n");
        }
    }

    public static void printReverseNumber(int x) {
        int reverse = 0;
        int temp = x;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        System.out.println(reverse);
    }

    public static Boolean isPrimeNumber(int x) {
        if (x < 2) {
            return false;
        } else if (x == 2) {
            return true;
        } else if (x % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i <= Math.sqrt(x); i += 2) {
                if (x % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

}
