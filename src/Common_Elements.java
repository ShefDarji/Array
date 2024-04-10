//Write a Java program to find the common elements between two arrays (string values).
public class Common_Elements {

    public static void main(String []args){

String a1[] = {"Rosie", "Carol", "Elin", "Jess", "Hayley"};

String a2[] = {"Sonia","Hayley","Sharon","Rosie","Beth"};

for (int i =0; i < a1.length; i++) {                                //for first array

    for (int j = 0; j < a2.length; j++) {                           //for second array
        if (a1[i] == a2[j]){                                        //checking the common elements btwn arrays

            System.out.println("Common Elements are "+ a1[i]);
        }
    }
}

}

}
