import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        boolean b = -15 < a && a <= 12;
        boolean c = 14 < a  && a < 17;
        boolean d = 19 <= a;

        if (b || c || d) {

            System.out.println("True");

        } else {
            System.out.println("False");
        }
    }
}