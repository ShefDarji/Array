import java.util.Scanner;

//WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately
public class Division {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

int i =1;                                                       //declaring and initializing
        if (num>2 && num<=100){
          do {
              if (i % 3 == 0){

                  System.out.println("When divide by 3--> " + i);
          }
              i++;
          } while(i<=num);
        }

            System.out.println();

        int j = 1;                                                  //declaring and initializing
        if (num>2 && num<=100){
            do {
                if (j % 5 == 0){

                    System.out.println("When divide by 5--> " + j);
                }
                j++;
            } while(j<=num);
        } else{
            System.out.println("Enter valid number");
        }

    }
}

