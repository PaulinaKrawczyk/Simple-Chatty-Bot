import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scan =  scanner.nextInt();
        int max = 0;

        while (scanner.hasNextInt()) {
            scan = scanner.nextInt();
            if (scan % 4 == 0 && scan > max) {
                max = scan;
            }
        }
        System.out.println(max);
    }
}

