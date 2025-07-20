import java.util.*;

public class MulitpleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns for Matrix 1:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        System.out.println("Enter rows and columns for Matrix 2:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] a = new int[row1][col1];
        int[][] b = new int[row2][col2];
        int[][] c = new int[row1][col2];

        // Input Matrix A
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.println("Enter value for Matrix 1 [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        // Input Matrix B
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.println("Enter value for Matrix 2 [" + i + "][" + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        // Multiply matrices
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < col1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
