/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumerosIgualesParesImpares;

/**
 *
 * @author jose
 */
public class NumerosIgualesParesImpares {
    public static void main(String[] args) {
        int res = 0, c1=0, c2=0, c3=0, c4, n=0;
        
        for(int i = 1000; i<10000; i++) {
            c1 = i / 1000;
            res = i % 1000;
            c2 = res / 100;
            res = res % 100;
            c3 = res / 10;
            c4 = res % 10;
            
            
            if(c1 + c3 == c2 + c4) {
                n = n + 1;
                System.out.println("Iguales: " + i);
            }
        }
        System.out.println("Total N° " + n);
    }
}
