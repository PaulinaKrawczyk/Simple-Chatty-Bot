import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reese = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean nah = reese >= 10 && reese <= 20 && !isWeekend;
        boolean weekend = reese >= 15 && reese <= 25 && isWeekend;
        System.out.println(nah || weekend);

    }
}