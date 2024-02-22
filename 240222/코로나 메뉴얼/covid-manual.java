import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String symp;
        int temp;
        int count = 0;

        for(int i=0; i<3; i++) {
            symp = sc.next();
            temp = sc.nextInt();
            if(symp.equals("Y") && temp >= 37) {
                count++;
            }
        }

        if(count >= 2) {
            System.out.print("E");
        }

        
    }
}