/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosgrupo01;
/**
 *
 * @author Estudiantes
 */
public class EjerciciosGrupo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //541 y 535
        Stack pila1 = new Stack();
        Stack pila2 = new Stack();
        
        for(int i =0;i<10;i++){
            pila1.push(i);
            pila2.push(i+2);
        
        
        }
        
        Funciones funcion = new Funciones();
        funcion.sumStacks(pila1, pila2);
        
    }
    
}
