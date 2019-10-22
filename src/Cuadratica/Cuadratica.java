package Cuadratica;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose
 */
public class Cuadratica {
    public static void main(String Data[]) {
        float a, b, c, n, x1, x2;
        
        /*
        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese A: "));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese B: "));
        c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese C: "));
        */
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese A: ");
        a = myObj.nextFloat();
        System.out.println("Ingrese B: ");
        b = myObj.nextFloat();
        System.out.println("Ingrese C: ");
        c = myObj.nextFloat();
        
        if (a == 0) {
            System.out.println("Solución indeterminada");
        } else {
            n = b * b - 4 * a * c;
            if (n < 0) {
                System.out.println("Solución imaginaria");
            } else {
                x1 = (float)( -b + Math.sqrt(n)) / (2 * a); // Option casting
                x2 = (-b - (float)Math.sqrt(n)) / (2 * a);  // option casting
                
                System.out.println("X1: " +  x1 + "\nX2: " + x2);
            }
        }
    }
}
