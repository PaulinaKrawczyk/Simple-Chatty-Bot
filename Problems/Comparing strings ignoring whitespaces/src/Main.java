import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine().replaceAll(" ", "");
        String second = scanner.nextLine().replaceAll(" ", "");

        System.out.println(first.equals(second));
    }
}