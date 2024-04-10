import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the how many rows in array");  //user to decide no of rows
        int r = scanner.nextInt();

        System.out.println("Enter the how many columns in array");//user to decide no of col
        int c = scanner.nextInt();

        int a[][] = new int[r][c];                                 //2d array syntax

        System.out.println("Enter the numbers for rows and columns");
        for (int i = 0; i < r; i++) {                                //loop to print row nos
            for (int j = 0; j < c; j++) {                            //loop to print col nos

                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original matrix is ");
        for (int i = 0; i < r; i++) {                                //Loop to display rows
            for (int j = 0; j < c; j++) {                            //loop to display col nos
                System.out.print(a[i][j] + "\t");

            }
            System.out.println(" ");
        }
        System.out.println("Transpose matrix is ");
        for (int i = 0; i < c; i++) {                                //Loop to display col
            for (int j = 0; j < r; j++) {                            //loop to display rows
                System.out.print(a[j][i] + "\t");                     //reverse loop and sout to print transpose matrix

            }
            System.out.println(" ");
 }
 }
}
