import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = 0;
        double d = 0;

        for (double i = a; i <= b; i++) {
            if (i % 3 == 0) {
                c += i;
                d++;
            }
        }
        double e = c / d;
        System.out.println(e);
    }
}