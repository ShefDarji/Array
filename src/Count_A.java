import java.util.Scanner;
//WAP to enter any String and count total number of 'a' in that String

public class Count_A {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String line = scanner.nextLine();
        int total = 0;

        char a []= line.toCharArray();                      //Syntax to convert String into Char Array

        for (int i = 0; i <line.length();i ++) {            //will go to each letter and line

            if (a[i]=='a' || a[i]=='A') {
                total++;

            }
        }System.out.println(total);

    }
}