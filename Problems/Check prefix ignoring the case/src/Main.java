import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        boolean prefix = text.toLowerCase().startsWith("j");

        System.out.println(prefix);
    }
}