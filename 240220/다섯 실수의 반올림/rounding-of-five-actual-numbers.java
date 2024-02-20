import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int count = 1;
        for(double i = 0; count <= 5; count++) {
            i = sc.nextDouble();
            System.out.printf("%.3f\n", i);
        }
    }
}