
package Nivell1_Ex3;


public class ArraysException {

    public static void main(String[] args) {
       
        int [] array = new int [5];
        
        array[0] = 5;
        array[1] = 2;
        array[2] = 6;
        array[3] = 6;
        array[4] = 8;
        
        
        try {
           array[5] = 9;//S'afegeix un element en una posició d'index fora del límit. 
           
        
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("S'ha sobrepassat el límit de capacitat de l'array");
        } 
        
    }
    
}
