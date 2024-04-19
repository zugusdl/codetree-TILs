import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        long answer = 0;
        int n = sc.nextInt(); // 식당 수
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            int customer = sc.nextInt(); // 고객 수
            arr[i] = customer;
        }

        int leader = sc.nextInt(); // 팀장 고객 수
        int member = sc.nextInt(); // 팀원 고객 수
        
        for(int i = 0; i < arr.length; i++) {
            answer += 1; // 팀장 더하기
            arr[i] -= leader; // 팀장 고객 수 빼기
            
            if(arr[i] > 0) {
                double m = Math.ceil((double)arr[i] / member);
                answer += m;
            }
        }

        System.out.print(answer);

    }
}