
package javaapplication17;

import java.util.Scanner;


public class exer3 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        double[] vetorA = new double[5];
        
        for(int i = 0; i<vetorA.length; i++){
            System.out.println("insira um valor: ");
            vetorA[i] = scan.nextDouble();
        }
        for(int i = 0; i<vetorA.length; i++){
            System.out.println(vetorA[i]);
        }
    }
}
