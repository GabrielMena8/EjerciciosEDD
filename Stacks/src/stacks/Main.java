/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacks;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Ejercicio 1 
        /*
        Stack stack = new Stack();
        Stack stack2=new Stack();
        Stack stack3=new Stack();
        
       
        stack.push(1);
        stack.push(4);
        stack.push(5);
        
       
        
        stack2.push(5);
        stack2.push(3);
        stack2.push(5);
      
        Nodo pointer = stack.getPeek();
        Nodo pointer2 = stack2.getPeek();
        
        //Ejercicio 1
        while (pointer!=null && pointer2 !=null){
            Object node3= (int) pointer.getElement() + (int) pointer2.getElement();
            pointer=pointer.getNext();
            pointer2=pointer2.getNext();
            
            stack3.push(node3);
            
        
        
        }
       /* stack3.push((int) stack.getPeek().getElement() + (int) stack2.getPeek().getElement());
        stack3.push((int) stack.getPeek().getNext().getElement() + (int) stack2.getPeek().getNext().getElement());
        stack3.push((int) stack.getPeek().getNext().getNext().getElement() + (int) stack2.getPeek().getNext().getNext().getElement());
        stack3.printStack();*/
        
        Stack stack = new Stack();
        
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
      
        //Ejercicio 2 Reverse
        
       /* Nodo pointer=stack.getPeek();
        Nodo aux=stack.getPeek();
        
            while(pointer.getNext()!=null){
               Nodo pointer2=pointer.getNext();
               if(pointer!=aux.getNext()){
               
               stack.push(pointer2.getElement());
               stack.push(pointer.getElement());
               
               pointer=pointer.getNext();
               stack.pop();
               }
               else{
                       break;}
               
               }
               
                        
        //stack.push(pointer.getElement());
        stack.printStack();*/
       
       /*Ejercicio 3, palindromo
       
       String reverse="";
        
       String inputString = sc.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
       
        Nodo pointer = stack.getPeek();
        reverse+=(char) pointer.getElement();
       
        
        while( pointer.getNext()!=null){
            pointer=pointer.getNext();
            reverse=reverse + (char) pointer.getElement();
            }
        
        if(inputString.equals(reverse)){
            System.out.println(inputString +"La palabra es palindromo");
        
        } else{
            System.out.println(inputString +"La palabra no es palindromo");
        
        }*/
       
       
       
       
       /* Ejercicio 5 promedio
       
       for (int i = 0; i < 55; i+=5) {
            stack.push(i);
        }

       int sum=0;
       Nodo pointer=stack.getPeek();
       int cont=0;
       while(pointer.getNext()!=null){
           sum+=(int) pointer.getElement();
           pointer=pointer.getNext();
           cont++;
       
       }
       double avr=sum/cont;
       
        System.out.println("El promedio es:" + avr);
        
    
    */
    }
    
    
}
