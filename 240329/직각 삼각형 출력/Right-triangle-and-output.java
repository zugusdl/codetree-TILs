import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 0; cnt < n; i += 2) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            cnt++;
            System.out.println();
        }
    }
}