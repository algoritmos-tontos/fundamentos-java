/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fibonnaci;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Finonacci {
    public static void main(String[] args) {
        int n;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número: ");
        n = sc.nextInt();
        
        // with array
        int f[] = new int[n];
        for(int i = 0; i< n; i++) {
            if (i==0 || i==1) f[i] = i;
            else {
                f[i] = f[i-1] + f[i-2];
            }
        }
        System.out.println("Array Fibonacci: " + Arrays.toString(f));
        
        // With variables
        String fib="";
        int n1=0, n2=1, n3=0;
        for (int j=1; j<=n; j++) {
            fib = fib + n1 + ", ";
            n3 = n1+n2;
            n1 = n2;
            n2 = n3; 
        }
        System.out.println("Variable Fibonacci: " + fib);
    }
}
