import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int large = 0;
        int smaller = 0;
        int perfect = 0;

        for (int i = 0; i < number; i++) {
            int part = scanner.nextInt();
            if (part == 0) {
                perfect++;
            } else if (part == 1) {
                large++;
            } else if (part == -1) {
                smaller++;
            }
        }
        System.out.println(perfect + " " + large + " " + smaller);
    }
}