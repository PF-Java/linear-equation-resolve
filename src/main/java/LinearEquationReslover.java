import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearEquationReslover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, x;

        System.out.println("Giải phương trình bậc nhất 1 ẩn: ax + b = 0");
        System.out.print("Nhập vào số a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập vào số b: ");
        b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0)
                System.out.print("Phương trình có vô số nghiệm");
            else
                System.out.print("Phương trình vô nghiệm");
        } else {
            x = -b / a;
            System.out.println("Phương trình có nghiệm duy nhất là x = " + x);
        }
    }
}
