import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\.");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        String c = "-";
        System.out.print(m + c + d + c + y);
    }
}