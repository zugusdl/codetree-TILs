import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();
        if(age >= 19) {
            if(gender == 0) {
                System.out.print("MAN");
            } else {
                System.out.print("WOMAN");
            }
        } else {
            if(gender == 0) {
                System.out.print("BOY");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}