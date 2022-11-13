package loops;

import java.util.Scanner;

/*
* Faça um programa que peça N números inteiros. Calcule e mostre
* a quantidade de números pares e a quantidade de números impares.
* */


public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero, quantPares=0, quantImpares=0;
        int count = 0;

        System.out.print("Digite o quantos números deseja verificar: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.print("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0){
                quantPares++;
            }else {
                quantImpares++;
            }
            count ++;
        }while (count < quantNumeros);

        System.out.println("Você digitou " + quantPares + " números pares.");
        System.out.println("Você digitou " + quantImpares + " números ímpares.");
    }
}
