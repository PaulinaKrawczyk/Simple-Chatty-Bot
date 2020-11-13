import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int d = 0;
        int c = 0;
        int b = 0;
        int a = 0;

        for (int j = 0; j < number; j++) {
            int i = scanner.nextInt();
            if (i == 2) {
                d++;
            } else if (i == 3) {
                c++;
            } else if (i == 4) {
                b++;
            } else if (i == 5) {
                a++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);
    }
}