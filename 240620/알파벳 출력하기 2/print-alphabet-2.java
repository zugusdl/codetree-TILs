import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {

                if(cnt < i) {
                    System.out.print("  ");
                    cnt++;
                } else {
                    System.out.print(ch + " ");
                    ch++;
                }

                if(ch > 'Z') {
                    ch = 'A';
                }
            }
            cnt = 0;
            System.out.println();
        }
    }
}