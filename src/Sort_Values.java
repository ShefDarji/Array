    //WAP to enter array and sort the values in ascending order
import java.util.Arrays;
import java.util.Scanner;

public class Sort_Values {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array");
        int n = scanner.nextInt();                                       // user to input the length/containers of array

        int a [] = new int[n];                                           //initialising and declaring array


        for(int num = 0; num <n; num++) {
            System.out.println("Enter the Number " + (num+1) );
            a[num] = scanner.nextInt();                                     //Replacing i with num as user will input num. Inside the loop as it will work based on the length and loop will run based on the length
        }

        Arrays.sort(a);                                                     //Using inbuilt array sorting method to sort in ascending order
        System.out.println("Ascending order of numbers is");

        for(int num = 0; num <n; num++) {                                   //Using one more loop to display numbers typed earlier

            System.out.println(a[num]);

        }

 }
}