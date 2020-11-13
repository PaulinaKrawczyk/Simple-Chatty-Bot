import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int up = scanner.nextInt();
        int down  = scanner.nextInt();
        int endOfTheDay = 0;
        for (int i = 1; i <= height; i++) {
            int beginningOfTheDay = up + endOfTheDay;
            endOfTheDay = beginningOfTheDay - down;

            if (beginningOfTheDay >= height) {
                System.out.println(i);

                break;
            }
        }
    }
}