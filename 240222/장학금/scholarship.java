import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();

        if(score1 >= 90) {
            if(score2 >= 95) {
                System.out.print(100000);
            }
            else if(score2 >= 90) {
                System.out.print(50000);
            }
            else {
                System.out.print(0);
            }
        }
        else {
            System.out.print(0);
        }
    }
}