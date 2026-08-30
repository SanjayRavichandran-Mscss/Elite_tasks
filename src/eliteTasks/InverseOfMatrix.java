package eliteTasks;

import java.util.Scanner;

public class InverseOfMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int determinant = (matrix[0][0] * matrix[1][1])
                        - (matrix[0][1] * matrix[1][0]);

        if (determinant == 0) {
            System.out.println("Inverse does not exist");
        } else {

            System.out.println("Inverse of Matrix:");

            System.out.println(
                (double) matrix[1][1] / determinant + " " +
                (double) -matrix[0][1] / determinant
            );

            System.out.println(
                (double) -matrix[1][0] / determinant + " " +
                (double) matrix[0][0] / determinant
            );
        }

        sc.close();
    }
}