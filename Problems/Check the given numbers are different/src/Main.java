import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean ab = a != b;
        boolean ac = a != c;
        boolean bc = b != c;

        System.out.println(ab && ac && bc);
    }
}