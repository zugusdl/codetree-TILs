import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;

        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            if(n >= 0 && n <= 200) {
                sum += n;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, (double)sum / cnt);
    }
}