import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 == 1 && num % 3 == 0) {
                sum += num;
            }
        }

        System.out.print(sum);
    }
}