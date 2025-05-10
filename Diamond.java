
public class Diamond {
    public static void main(String[] args) {

        int n = 6;
        // System.err.println("Enter the number of rows:");
        // try (Scanner sc = new Scanner(System.in)){
        //     n = sc.nextInt();
        // }

        // for (int i = 0; i < n; i++) {

        //     System.out.println(" ".repeat(n));
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        for (int i = 0; i < n; i++) {

            
            for (int j = 0; j < i; j++) {
                System.out.print(" ".repeat(i));
                System.out.print("*".repeat(j));
            }
            System.out.print("\n");
        }
    }
}
