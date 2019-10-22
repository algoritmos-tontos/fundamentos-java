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
public class NotaEstudianteEquals {
    
    public static void main(String[] args) {
        float nota=0, notaT=0, ex_f;
        String cod_m, name_m, cod_e, name_e, next="si";
        
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        while(next.equals("si")) {
            System.out.println("Ingrese código de la materia: ");
            cod_m = sc.next();
            
            System.out.println("Ingrese nombre de la materia: ");
            name_m = sc.next();
            
            System.out.println("Ingrese código del estudiante: ");
            cod_e = sc.next();
            
            System.out.println("Ingrese nombre del estudiante: ");
            name_e = sc.next();
            
            int j = 1;
            while(j<=3){
                System.out.println("Ingrese nota " + j + ": ");
                nota = sc.nextFloat();
                int a = 0;
                while(nota >= 0 && nota <=5 && a == 0){
                    notaT += nota;
                    j++;
                    a++;
                }
            }
            notaT = notaT / 3 * 0.7f;
            
            System.out.println("Ingrese nota examen final: ");
            ex_f = sc.nextFloat() * 0.3f;
            while(ex_f >=0 && ex_f <= 5) {
                ex_f = sc.nextFloat() * 0.3f;
            }
            
            
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
            
            System.out.println("Desea continuar: Si o No");
            next = sc.next();
            next = next.toLowerCase();
            
            
        }
        
        
        
    }
    
}
