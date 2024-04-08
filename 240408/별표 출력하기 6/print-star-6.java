import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            int star = (2 * n) - (2 * i) - 1;
            for(int j =0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 0; i < n - 1; i++) {
            int space = n - i - 2;
            for(int j = 0; j < space; j++) {
                System.out.print("  ");
            }

            int star = 3 + (2 * i);
            for(int j =0; j < star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }    
    }
}