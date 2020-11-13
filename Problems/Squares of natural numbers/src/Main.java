import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = scanner.nextInt();
        int s = 1;
        int square;

        while ((square = s * s++) <= max) {
            System.out.println(square);

        }
    }
}





