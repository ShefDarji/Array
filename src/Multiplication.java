//Printing multiplication table using do while loop
public class Multiplication {


    public static void main(String[] args) {
        int num = 1;
        int i = 1;
        // int multi = 1;
//for(i = 1, num <=3; i++) just for ref

 do {                                                               //first loop to show 1's table
     System.out.print ((num * i) + "\t");
     num++;
 } while (num <= 3);
        System.out.println();
 int num1 = 1;
 int n =2;
        do {                                                           //second loop to show 2's table
            System.out.print((num1 * n) + "\t");
            num1++;
        } while (num1 <= 3);

        System.out.println();
 int num2 = 1;
 int a = 3;
        do {                                                            //third loop to show 3's table
            System.out.print( (num2 * a) + "\t") ;
            num2++;
        } while (num2 <= 3);
    }
}