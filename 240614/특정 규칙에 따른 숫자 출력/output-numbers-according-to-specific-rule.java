import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print(a + " ");
                    a++;
                }

                if(a > 9) {
                    a = 1;
                }
            }
            System.out.println();
        }
    }
}