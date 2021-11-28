
package Nivell1_Ex4;


public class Main {

    
    public static void main(String[] args) {
        try {
            throw new LaMevaClasseException("Això es un missatge d'error");
            
        }catch (LaMevaClasseException e) {
            System.out.println(e.mostraCadena());
            
        }
    }
    
}
