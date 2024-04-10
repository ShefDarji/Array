//WAP to input the 5 digit number and then reverse it

import java.util.Scanner;

public class Reverse {

public static void main (String []args) {
    Scanner scanner = new Scanner(System.in);
    int a [] = new int[5];                          //length is decided as we want 5 numbers


for (int i = 0; i <a.length; i++){
    System.out.println("Enter numbers " + (i + 1));
    a[i] = scanner.nextInt();                         //we need to type 5 times thats why in for loop

}         System.out.println("Original number entered is ");

for (int i = 0; i <a.length; i++){

    System.out.println( a[i]);
}
    System.out.println("     ");                        //just to create space between Og and Reversed numbers
System.out.println("Reverse of numbers entered is :-");

for (int i = 4; i>=0; i--){
    System.out.println(a[i]);
}



}
}
