import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        int cnt = 0;

        for(int i = 0; i < 10; i++) {
            arr[i] = n * (i + 1);

            System.out.print(arr[i] + " ");

            if(arr[i] % 5 == 0) {
                cnt++;
            }

            if(cnt == 2) {
                break;
            }
        }
    }
}