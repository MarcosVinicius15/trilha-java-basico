package loops;

import java.util.Scanner;

/*
* Faça um programa que leia 5 números e informe o maior número e a média desses números.
* */

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, maior;
        double media, soma=0;

        System.out.print("Digite o 1º número: ");
        numero = scan.nextInt();

        maior = numero;
        soma += numero;

        for (int i = 1; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numero = scan.nextInt();

            soma += numero;

            if (numero > maior) maior = numero;
        }
        media = soma/5;
        System.out.println("A média dos números é: " + media);
        System.out.println("O maior número digitado foi o: " + maior);
    }


}
