import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int a = number % 10;
        int b = (number % 100 - a) / 10;
        int c = (number - number % 100) / 100;

        int sum = a + b + c;

        System.out.println(sum);
    }
}