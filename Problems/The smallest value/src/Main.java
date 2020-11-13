import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long fact = 1;
        int number = 1;
        while (n >= fact) {
            number++;
            fact *= number;
        }
        System.out.println(number);
    }
}