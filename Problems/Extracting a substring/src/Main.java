import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(text.substring(scanner.nextInt(), scanner.nextInt() + 1));

    }
}