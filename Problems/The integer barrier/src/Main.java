import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        while (a != 0) {
            sum = sum + a;
            a = scanner.nextInt();
            if (sum >= 1000) {
                System.out.println(sum - 1000);
                break;
            }
        } if (a == 0 && sum < 1000)  {
            System.out.println(sum);
        }
    }
}

