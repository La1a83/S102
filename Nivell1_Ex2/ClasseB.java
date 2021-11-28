
package Nivell1_Ex2;

public class ClasseB {

    String missatge;
    
    public ClasseB(String m) {
        this.missatge = m;
    }
    
    
    public  void mostraCaracters (String m) {
        for (int i =0;i<m.length();i++) {
            System.out.print(m.charAt(i)+ " ");
        }
    }
  
    public static void main(String[] args) {
           
            try {

                ClasseB objecte = new ClasseB(null);
                objecte.mostraCaracters(objecte.missatge);
            } catch(Exception e) {
                System.out.println("Objecte null!");
            }
        
    }
    
}
