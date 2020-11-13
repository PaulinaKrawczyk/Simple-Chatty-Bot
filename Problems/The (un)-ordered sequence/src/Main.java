import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean order = true;
        boolean asc = false;
        boolean desc = false;
        int number = scanner.nextInt();
        int next = scanner.nextInt();
        while (next != 0) {
            if (number == next) {
                number = next;
                next = scanner.nextInt();
                if (next == 0) {
                    break;
                }
            }
            if (number < next) {
                if (desc) {
                    order = false;
                    break;
                }
                number = next;
                next = scanner.nextInt();
                order = true;
                asc = true;
            } else if (number > next && !asc) {
                desc = true;
                number = next;
                next = scanner.nextInt();
            } else if (number > next && asc) {
                order = false;
                break;
            }
            if (next == 0) {
                break;
            }
        }
        System.out.println(order);
    }
}


