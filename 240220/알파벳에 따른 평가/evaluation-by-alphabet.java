import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.equals("S")) {
            System.out.print("Superior");
        } else if(str.equals("A")) {
            System.out.print("Excellent");
        } else if(str.equals("B")) {
            System.out.print("Good");
        } else if(str.equals("C")) {
            System.out.print("Usually");
        } else if(str.equals("D")) {
            System.out.print("Effort");
        } else {
            System.out.print("Failure");
        }
    }
}