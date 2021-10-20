import java.util.Scanner;

public class alphabeticRangoli {
    public static void printRangoli(int n) {
        for (int i = 0; i < n; i++) {                                           // traverse row upper part of the pattern
            for (int j = 0; j < ((n-1)-i); j++) {       
                System.out.print("--");                                         // initial spaces

            }
            if (i != 0) {
                for (int j = 0; j < i; j++) {                                   // left side of the middle column
                    System.out.print((char)(97 + (n-1) - j));                   // alphabets
                    System.out.print ("-");                                     // dashes

                }
            }
            System.out.print((char)(97 + (n-1) - i));                           // middle column

            if (i != 0) {
                for (int j = 0; j < i; j++) {                                   // right side of the middle column
                    System.out.print ("-");                                     // dashes
                    System.out.print ((char)(97 + (n-1) - i + (j+1)));          // alphabets

                }
            }
            for (int j = 0; j < ((n-1) - i); j++) {
                System.out.print ("--");                                        // final spaces

            }
            System.out.println();

        }
        for (int i = n-2; i > -1; i--) {                                        // lower part of the pattern
            for (int j = 0; j < ((n-1) - i); j++) {
                System.out.print ("--");                                        // initial spaces

            }
            if (i != 0) {
                for (int j = 0; j < i; j++) {                                   // left side of the middle column
                    System.out.print ((char)(97 + (n-1) - j));                  // alphabets
                    System.out.print ("-");                                     // dashes

                }
            }
            System.out.print ((char)(97 + (n-1) - i));                          // middle column

            if (i != 0) {
                for (int j = 0; j < i; j++) {                                   // right side of the middle column                 
                    System.out.print ("-");                                     // dashes
                    System.out.print ((char)(97 + ((n-1) - i) + (j+1)));        // alphabets

                }
            }
            for (int j = 0; j < ((n-1) - i); j++) {
                System.out.print("--");                                         // final spaces
                
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int size = input.nextInt();
        printRangoli (size);
        input.close();

    }
}
