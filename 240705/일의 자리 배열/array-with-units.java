import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++) {
            if(i < 2) {
                arr[i] = sc.nextInt();
            } else {
                arr[i] = (arr[i - 1] + arr[i - 2]) % 10;
            }

            System.out.print(arr[i] + " ");
        }
    }
}