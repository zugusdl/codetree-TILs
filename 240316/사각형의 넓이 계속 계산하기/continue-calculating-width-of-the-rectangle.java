import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        while(true){
            int width = sc.nextInt();
            int height = sc.nextInt();
            String c = sc.next();

            System.out.println(width * height);

            if(c.equals("C")) break;
        }
    }
}