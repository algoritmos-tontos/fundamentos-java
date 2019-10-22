/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NotaEstudiante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class NotaEstudianteWhile {
    
    public static void main(String[] args) {
        int est;
        float notaT=0, ex_f;
        String cod_m, name_m, cod_e, name_e;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de estudiantes: ");
        
        DecimalFormat df = new DecimalFormat("0.0");
        
        est = sc.nextInt();
        int i = 1;
        while(i<=est) {
            System.out.println("Ingrese código de la materia: ");
            cod_m = sc.next();
            
            System.out.println("Ingrese nombre de la materia: ");
            name_m = sc.next();
            
            System.out.println("Ingrese código del estudiante: ");
            cod_e = sc.next();
            
            System.out.println("Ingrese nombre del estudiante: ");
            name_e = sc.next();
            
            for(int j = 1; j<=3; j++) {
                System.out.println("Ingrese nota " + j + ": ");
                notaT += sc.nextFloat();
            }
            notaT = notaT / 3 * 0.7f;
            
            System.out.println("Ingrese nota examen final: ");
            ex_f = sc.nextFloat() * 0.3f;
            
            notaT += ex_f;
            
            System.out.println("Código de la materia: " + cod_m);
            System.out.println("Nombre de la materia: " + name_m);
            System.out.println("Código del estudiante: " + cod_e);
            System.out.println("Nombre del estudiante: " + name_e);
            System.out.println("Su nota final es: " + (df.format(notaT)));
            
            if (notaT < 2) {
                System.out.println("Reprobó");
            } else if(notaT < 3) {
                System.out.println("Habilita");
            } else {
                System.out.println("Aprueba");
            }
            
            System.out.println("**************************");
            System.out.println("**************************");
            
            i++;
            
        }
        
        
        
    }
    
}
