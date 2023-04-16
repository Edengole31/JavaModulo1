/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().

*/
package pkg01ejercicio05;

import java.util.Scanner;

/**
 *
 * @author kike
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nuemro sobre el cual desea operar:");
        int num = leer.nextInt();
        System.out.println("El doble de " +num+ " es: " +(num*2));
        
        System.out.println("El triple de " +num+ " es: " +(num*3));
        
        System.out.println("La raiz de  " +num+ " es: " +(Math.sqrt(num)));
    }
    
}
