//WAP to remove specific element from an array
import java.util.Scanner;
public class Remove_Element {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the length of array");
    int n = scanner.nextInt();                                       // user to input the length

    int a[] = new int[n];                                           //initialising and declaring array

for(int num = 0; num <n; num++) {
        System.out.println("Enter number " + (num+ 1));
        a[num]= scanner.nextInt();

}
System.out.println("Enter the number which you want to remove " );
int num1= scanner.nextInt();                                            //outside loop as just need a number

for(int i= num1 ; i <num1; i++){                                        //loop to run for deleting a number

    a[i]= a[i+1];                                                       //assigning value from next container to previous container
}
n--;
for(int num = 0; num <n; num++) {                                   //same loop as first one to show after deleting
    System.out.println(a[num]);

    }

}
}

