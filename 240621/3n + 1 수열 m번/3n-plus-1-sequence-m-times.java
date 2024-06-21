import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int cnt = 0;

            for(int j = n; j != 1;) {
                if(j % 2 == 0) {
                    j /= 2;
                    cnt++;
                } else {
                    j = (j * 3) + 1;
                    cnt++;
                }
            }

            System.out.println(cnt);
        }
    }
}