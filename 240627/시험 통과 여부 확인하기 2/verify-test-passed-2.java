import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int student = sc.nextInt();
        int passCnt = 0;
        int[] score = new int[4];

        for(int i = 0; i < student; i++) {
            for(int j = 0; j < 4; j++) {
                score[j] = sc.nextInt();
            }

            int sum = 0;

            for(int j = 0; j < 4; j++) {
                sum += score[j];
            }

            if((double)sum / 4 >= 60) {
                System.out.println("pass");
                passCnt++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(passCnt);


    }
}