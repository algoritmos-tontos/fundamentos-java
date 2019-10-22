/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class FactorialCalcule {
    public static void main(String[] args) {
        int fac; 
        long result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        fac = sc.nextInt();
        
        for(int i = 1; i<= fac; i++) {
            result = result * i;
        }
        
        System.out.println("El factorial de " + fac + " es: " + result);
    }
}
