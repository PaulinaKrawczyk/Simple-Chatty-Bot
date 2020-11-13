import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int newFirst = number % 10;
        int newSecond = (number % 100) / 10;
        int newThird = number / 100;

        int newNumber = newFirst * 100 + newSecond * 10 + newThird;

        System.out.println(newNumber);
    }
}