import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt;
        
        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 1; i <= 6; i++) {
            cnt = 0;

            for(int j : arr) {
                if(i == j) {
                    cnt++;
                }
            }

            System.out.println(i + " - " + cnt);
        }
    }
}