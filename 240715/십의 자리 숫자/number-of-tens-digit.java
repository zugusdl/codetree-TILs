import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int cnt;

        for(int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 0) {
                break;
            }
        }

        for(int i = 1; i < 10; i++) {
            cnt = 0;
            for(int j : arr) {
                if(j == 0) {
                    break;
                }

                if(j / 10 == i) {
                    cnt++;
                }
            }
            System.out.println(i + " - " + cnt);
        }
    }
}