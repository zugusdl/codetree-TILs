import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n != 2) {
            if(n == 4 || n == 6 || n == 9 || n == 11) {
                System.out.print(30);
            } else {
                System.out.print(31);
            }
        } else {
            System.out.print(28);
        }
    }
}