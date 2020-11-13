import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean crash = false;

        for (int i = 1; i < b; i++) {
            int c = scanner.nextInt();
            if (c <= a) {
                crash = true;
                System.out.println("Will crash on bridge " + i);
                break;
            }
        } if (!crash) {
            System.out.println("Will not crash");
        }


    }
}

