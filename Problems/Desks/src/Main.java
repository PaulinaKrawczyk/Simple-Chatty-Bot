import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        int a = first / 2 + first % 2;
        int b = second / 2 + second % 2;
        int c = third / 2 + third % 2;

        int sum = a + b + c;
        System.out.println(sum);
    }
}