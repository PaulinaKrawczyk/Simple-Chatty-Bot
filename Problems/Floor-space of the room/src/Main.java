import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.next();

        switch (figure) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double s = (a +b + c) / 2;
                double x = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(x);
                break;
            case "rectangle":
                double e = scanner.nextInt();
                double f = scanner.nextInt();
                double g = e * f;
                System.out.println(g);
                break;
            case "circle":
                double h = scanner.nextInt();
                double i = 3.14 * h * h;
                System.out.println(i);
                break;
            default:
                break;
        }
    }
}
