/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg27.pkg11.pkg17.luca.esempio.app2;

import java.util.stream.IntStream;

/**
 *
 * @author tss
 */
public class LucaEsempioApp2 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int[] numeri = IntStream.of(0,1,2,3,4,5,6,7).toArray();
        for (int i = 0; i < numeri.length; i++) {
            int valore = numeri[i];
            System.out.println(valore);
        }
            
            
        }
           // TODO code application logic here
    }
    
