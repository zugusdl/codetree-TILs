import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();
        int max = min;
        int num = 0;

        for(int i=1; i<n; i++) {
            num = sc.nextInt();

            if(min > num) {
                min = num;
            }
            
            if(max < num) {
                max = num;
            }
        }
        System.out.print(min + " " + max);
    }
}