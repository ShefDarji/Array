import java.util.Scanner;

public class Armstrong_Numbers {

 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter any number");
    int num = scanner.nextInt();
    int count = 0;
    int temp = num;
    int sum = 0;
    int x = num;                                            //creating tos tore value of num

 while (temp>0){

    temp = temp/10;                                         //function to find no of digits
    count++;
     }
 while(num>0){

     int b = num%10;
     sum = (int) (sum+Math.pow(b,count));
     num = num/10;

 }
if (sum==x){

    System.out.println(x + " is an Armstrong number");
}
else {
    System.out.println(x + " is not an Armstrong number");
}

}
}
