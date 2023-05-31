/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosgrupo01;

/**
 *
 * @author Estudiantes
 */
public class Stack {

    public Stack() {
        this.peek = null;
        this.size = 0;
    }
    private Nodo peek;
    private int size;

    public Nodo getPeek() {
        return peek;
    }

    public void setPeek(Nodo peek) {
        this.peek = peek;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public boolean isEmpty(){
        return getPeek()==null;
    
    }
    public void push(Object element){
        Nodo nodo = new Nodo((int) element);
        if(isEmpty()){
            setPeek(nodo);
        } else {
            nodo.setNext(getPeek());
            setPeek(nodo);
        } 
        
        size++;
    }
    public void printStack(){
    
        Nodo pointer = getPeek();
        while(pointer.getNext()!=null){
            System.out.println(pointer.getElement());
    
    
        
    }
    }

    
}
