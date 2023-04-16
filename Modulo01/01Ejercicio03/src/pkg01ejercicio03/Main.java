/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


 */

/*
4. Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
package pkg01ejercicio03;

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
        System.out.println("Ingrese la temperatura en grados celcius:");
        double grado= leer.nextDouble();
        System.out.println("La temperatura en drados F es: "+(32+(9*grado/5)));
        
        
        
        
    }
    
}
