import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int a = scanner.nextInt();
            if (a % 6 == 0) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
}