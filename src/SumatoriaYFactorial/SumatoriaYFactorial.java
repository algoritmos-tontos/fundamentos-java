/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SumatoriaYFactorial;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class SumatoriaYFactorial {
    public static void main(String[] args) {
        int a, n;
        long fac_n=1;
        float sum = 0, op=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el valor a sumar");
        a = sc.nextInt();
        System.out.println("Ingrese el número de iteracciones");
        n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.println("SUMA A: " + sum);
            
            fac_n = fac_n * i;
            System.out.println("Fact: " + fac_n);
            System.out.println("A: " + a);
            System.out.println("I: " + i);
            
            op = (float)((a + i) / fac_n);
            System.out.println("Operación: " + op);
            
            
            sum = sum + op;
            System.out.println("SUMA D: " + op);
            
        }
        
        System.out.println("Suma es: " + sum);
    }
}