import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;

        for(int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            if(i % 5 == 0) sum += i;
        }

        System.out.print(sum);
    }
}