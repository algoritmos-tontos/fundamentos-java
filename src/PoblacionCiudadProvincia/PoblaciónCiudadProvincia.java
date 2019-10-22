/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PoblacionCiudadProvincia;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class PoblaciónCiudadProvincia {
    public static void main(String[] args) {
        int prov = 0, city=0, p1=0, p2=0, c=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese número de provincias: ");
        prov = sc.nextInt();
        
        for(int i = 1; i <= prov; i++) {
            System.out.println("Provincia N° " + i);
            System.out.println("Ingrese número de ciudades: ");
            city = sc.nextInt();
            
            for(int j = 1; j<=city; j++) {
                System.out.println("Ingrese población de ciudad N° " + j );
                p1 = sc.nextInt();
                
                if(p1 > p2) {
                    p2 = p1;
                    c = j;
                }
            }
            
            System.out.println("La ciudad con mayor población fue: " + c + " y su población fue de: " + p2);          
            System.out.println("============================================");
        }
    }
}
