import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}