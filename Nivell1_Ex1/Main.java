
package Nivell1_Ex1;

public class Main {
    
    public static void main(String[] args) {
    
        
        
        try {
            
            Exception e = new Exception("aquest es el missatge del constructor");
            throw e;
        
        }catch (Exception e ) {
            
            System.out.println(e.getMessage());
           
            
        }finally {
                System.out.println("S'ha acabat d'executar el bloc try/catch");
        }
    
    }
    
}

 
