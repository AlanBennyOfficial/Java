import java.util.Scanner;

public class Cargo_weight_calculator {
    public static void main(String[] args) {

        // Try-with-resources, closes scanner once it's done
        try (Scanner SC = new Scanner(System.in)) {

            System.out.print("Enter the cargo weight on Earth (in kg): ");
            int weight = SC.nextInt(); // scan wight
            
            System.out.print("\nSelect a destination planet except earth ( 1 to 7): ");
            int planet = SC.nextInt(); // scan choice of planet
            
            double[] gravity = {0.38 , 0.91 , 0.38 , 2.34 , 1.06 , 0.92 , 1.19}; // Gravity array
            String[] planets = {"Mercury", "Venus", "Mars", "Jupiter", "Saturn", "Urnaus", "Neptune"}; // Planet names array
            
            // Calculate weight on chosen planet

            if(planet > 0 && planet <8)
                System.out.printf("\nThe cargo weight on %s will be: %.2f kg\n", planets[planet-1], weight*gravity[planet-1]);
            else
                System.out.println("\nEnter a valid destination planet");
        }
    }
}
