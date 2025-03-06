import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            System.out.println("Enter " + n + " numbers:");

            float[] num = new float[n];
            float sum = 0;
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextFloat();
                sum += num[i];
            }
            
            System.out.println("Average of " + n + " numbers is: " + sum / n);
        }
    }
}
