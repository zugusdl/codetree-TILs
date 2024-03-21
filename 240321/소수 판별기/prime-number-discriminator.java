import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        boolean satisfied = false;
        int n = sc.nextInt();

        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                satisfied = true;
                break;
            }
        }

        System.out.print(satisfied ? "C" : "P");
        
    }
}