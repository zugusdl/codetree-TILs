import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] arr = new double[n];
        double sum = 0;
        String grade;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = sum / n;
        if(avg >= 4.0) {
            grade = "Perfect";
        } else if (avg >= 3.0) {
            grade = "Good";
        } else {
            grade = "Poor";
        }

        System.out.printf("%.1f\n%s", avg, grade);
    }
}