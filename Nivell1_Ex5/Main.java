
package Nivell1_Ex5;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    
    public static void main (String [] args) {
        
        boolean exception= true;
        Scanner sc = new Scanner(System.in);
        int edat=0;
        while (exception) {
            System.out.println("Introdueix la teva edat: ");
            try {
                edat = sc.nextInt();
                exception = false;
                  
                } catch(InputMismatchException e) {
                    System.out.println("Error, no has introduït un enter");
                    exception = true;
                    sc.nextLine();
                    
                }
        }
        System.out.println("Tens: "+ edat + " anys.");
        
        
    }
    
    
    
}
