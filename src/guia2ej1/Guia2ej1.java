/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2ej1;

import java.util.Scanner;



/**
 *
 * @author meli
 */
public class Guia2ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ingrese el primer numero");
       
       Scanner lectura = new Scanner (System.in);
       
       int num1 = lectura.nextInt();
       
       System.out.println("Ingrese el segundo numero");
       
       int num2 = lectura.nextInt();
       
       int total = num1 + num2;
       
       System.out.println("El total de la suma es: " + total);
       
       
       
    }
    
}
