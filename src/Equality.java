import java.util.Scanner;
//Write a Java program to test the equality of two arrays

public class Equality {

    public static void main(String[] arga) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of First Array");                  //input first array length
        int n1 = scanner.nextInt();

        int a1 [] = new int[n1];
        System.out.println("Enter the length of Second Array");                 //input second array length
        int n2 = scanner.nextInt();

        int a2 [] = new int[n2];

        System.out.println("Enter the Numbers for First Array");

        for (int i = 0; i <n1; i++) {                                             //loop to print numbers based on lenght of 1st array
        a1[i]= scanner.nextInt();

        }
        System.out.println("Enter the Numbers for Second Array");
        for (int i =0; i < n2; i++){                                              //loop to print numbers based on lenght of 1st array
        a2[i]= scanner.nextInt();

        }

       if (a1.length ==a2.length){                                              //to check the equality of both arrays
          System.out.println("Both the arrays are Equal");
       }
       else {
            System.out.println("Both the arrays are Not Equal");
        }

    }
}