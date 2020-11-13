import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int even = number % 2;
        if (even == 1) {
            System.out.print(number + 1);
        } else {
            System.out.print(number + 2);
        }
    }
}