/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosgrupo01;

/**
 *
 * @author Estudiantes
 */
public class Funciones {
    
    public Stack sumStacks(Stack stack1, Stack stack2) {
        Stack sumStack= new Stack();
        
        Nodo pointer1 = stack1.getPeek();
        Nodo pointer2 = stack2.getPeek();
        
        while (pointer1!=null && pointer2!=null){
            Object Node3=((int) pointer1.getElement() + (int) pointer2.getElement());
            pointer1 = pointer1.getNext();
            pointer2 = pointer2.getNext();
            sumStack.push(Node3);
        
       }sumStack.printStack();
        return sumStack;
       
    }
}
    
    

