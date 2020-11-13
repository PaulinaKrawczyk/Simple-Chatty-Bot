import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int value = ((number + 1) * number + 2) * number + 3;
        System.out.println(value);

    }
}