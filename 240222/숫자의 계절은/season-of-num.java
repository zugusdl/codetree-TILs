import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if(month == 12 || month <= 2) {
            System.out.print("Winter");
        }
        else if(month <= 5) {
            System.out.print("Spring");
        }
        else if(month <= 8) {
            System.out.print("Summer");
        }
        else {
            System.out.print("Fall");
        }
    }
}