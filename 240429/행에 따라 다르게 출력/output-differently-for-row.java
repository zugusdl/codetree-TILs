import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = 0; // 출력 숫자
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    num++;
                } else {
                    num += 2;
                }
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }
}