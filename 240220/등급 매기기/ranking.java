import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if(score >= 90) {
            System.out.print("A");
        } else if(score >= 80) {
            System.out.print("B");
        } else if(score >= 70) {
            System.out.print("C");
        } else if(score >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}