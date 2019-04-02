/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Praktikan
 */
public class MODUL8 {

    public static void main(String[] args) throws IOException {
        System.out.println("Bilangan Fibonacci");  
        System.out.print("Masukkan Input : ");
        BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));
        int a = 1;
        int b = 1;
        int c;
        int d;
        int banyak = 0;
        String input;
        
          try {
            input = dataInput.readLine();
            banyak = Integer.parseInt(input);
        } catch (NumberFormatException error) {
            System.out.println("salah");
        }
        System.out.print("Bilangan Fibonacci = " + a + " " + b + " ");
        for (d = 0; d < banyak - 2; d++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println("");     
    }      
}
     

