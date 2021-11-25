
package javaapplication17;

import java.util.Scanner;


public class Exer5 {
    // Crie um vetor A com 5 elementos inteiros. Após criado o vetor A faça B[i] = A[i] * 2.
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int[] vetorA = new int[5];
         int[] vetorB = new int[vetorA.length];
         
         for (int i=0; i<vetorA.length; i++){
             System.out.println("Entre com o valor da posição "+i+":");
             vetorA[i] = scan.nextInt();
             
             vetorB[i] = vetorA[i] * 2;
         }
         
         System.out.println("Array A = ");
         for (int i=0; i<vetorA.length;i++){
             System.out.println(vetorA[i]+" ");
         }
         System.out.println();
         
         System.out.println("Array B = ");
         for (int i=0; i<vetorB.length;i++){
             System.out.println(vetorB[i]+" ");
         }
     }
}
