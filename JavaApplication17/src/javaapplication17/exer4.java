
package javaapplication17;

import java.util.Scanner;


public class exer4 {
     public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i<vetorA.length; i++) {
           System.out.println("Entre com o valor da posição: " + i);
           vetorA[i] = ler.nextInt();

           vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++) {
           System.out.print(vetorA[i] + " ");
        }
        System.out.println(); // apenas para pular linha

        System.out.print("Vetor B = ");
        for (int i=0; i<vetorB.length; i++) {
           System.out.print(vetorB[i] + " ");
        }
        System.out.println(); // apenas para pular linha
     }
}
