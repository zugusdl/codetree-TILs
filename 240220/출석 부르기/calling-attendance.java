import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 1) {
            System.out.print("John");
        } else if(num == 2) {
            System.out.print("Tom");
        } else if(num == 3) {
            System.out.print("Paul");
        } else {
            System.out.print("Vacancy");
        }
    }
}