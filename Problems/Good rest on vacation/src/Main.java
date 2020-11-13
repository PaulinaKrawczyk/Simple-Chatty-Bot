import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int food = scanner.nextInt();
        int plane = scanner.nextInt();
        int hotel = scanner.nextInt();

        int cost = duration * food + 2 * plane + (duration - 1) * hotel;

        System.out.print(cost);
    }
}