/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no.pkg2;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Masukkan Angka = ");
        Scanner el = new Scanner(System.in); 
        int a; 
        int b = el.nextInt(); 
        
         for (a = 0; a < (2 * b) + 1; a++) { 
 
            for (int j = 0; j < (2 * b) + 1; j++) { 
 
                if (a < b) { 
                    if ((j > b - a) && (j < b + a)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
                } else { 
 
                    if ((j > a - b) && (j < 3*b-a)) { 
                        System.out.print("*"); 
                    } else { 
                        System.out.print("0"); 
                    } 
 
                } 
            } 
            System.out.println(); 
 
        } 
    }
    
}
