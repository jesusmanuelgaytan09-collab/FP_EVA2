/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multiplicar;

import java.util.Scanner;

/**
 *
 * @author range
 */
public class EVA2_12_TABLA_MULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("Ingresa un numero del 1 al 10: ");
        num = captu.nextInt();
        for(int i = 1; i <=10; i++)
            System.out.println(num + "x" + i + " = " + (num*i));
            
    }
    
}
