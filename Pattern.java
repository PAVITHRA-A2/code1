import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");

        int n = sc.nextInt();
        int start = n / 2 + 1;
        int space = 0;

        for (int i = 0; i < n; i++) {
            // Print left stars
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }

            // Print spaces
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            // Print right stars
            for (int j = 0; j < start; j++) {
                System.out.print("*");
            }

            System.out.println(); // Move to next line

            // Update values based on row index
            if (i < n / 2) {
                start -= 1;
                space += 2;
            } else if (i == n / 2) {
                space = n - 3;
                start = 2;
            } else {
                start += 1;
                space -= 2;
            }
        }
    }
}
