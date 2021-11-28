
package Nivell1_Ex4;


public class LaMevaClasseException extends Exception {
    
    private String missatge="";
    
    public LaMevaClasseException (String missatge) {
        
        super();
        this.missatge = missatge;
    }

        
    public String mostraCadena () {
        return this.missatge;
    }      
    
    
    
}
