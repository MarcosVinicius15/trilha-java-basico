package loops;

import java.util.Scanner;

/*
* Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!=5.4.3.2.1=120
* */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero, fatorial = 1;

        System.out.print("Digite o número: ");
        numero = scan.nextInt();

        for (int i = 2; i <= numero; i++){
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}
