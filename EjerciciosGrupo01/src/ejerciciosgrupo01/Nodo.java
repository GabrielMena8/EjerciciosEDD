/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosgrupo01;

/**
 *
 * @author Estudiantes
 */
public class Nodo { 

    

    Object element;
    Nodo next;
    
    public Nodo(int element) {
        this.element = element;
        this.next = null;
    }
    
    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
}
