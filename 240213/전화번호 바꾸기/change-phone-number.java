import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String con = "-";
        sc.useDelimiter(con);
        String a = sc.next();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(a + con + c + con + b);
    }
}