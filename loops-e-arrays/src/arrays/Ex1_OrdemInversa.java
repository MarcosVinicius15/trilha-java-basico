package arrays;

import java.util.Scanner;

/*
* Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa
* */
public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {12, -7, -85, 67, 14};

        System.out.println("Vetor:");
        int count = 0;
        while (count < vetor.length){
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVetor na ordem inversa: ");
        for (int i = (vetor.length - 1); i >= 0 ; i--) {
            System.out.print(vetor[i]+ " ");
        }
    }
}
