package arrays;

/*
* Faça um Programa que leia um vetor de 6 caracteres,
* e diga quantas consoantes foram lidas. Imprima as consoantes.
* */

import java.util.Scanner;

public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] caractere = new String[6];
        String[] consoantes = new String[6];
        int numConsoantes = 0;

        for (int i = 0; i < caractere.length; i++){
            System.out.print("Digite o " + (i+1) +"ª caractere: ");
            caractere[i] = scan.next();

            if ( !(caractere[i].equalsIgnoreCase("a") ||
                    caractere[i].equalsIgnoreCase("e") ||
                    caractere[i].equalsIgnoreCase("i") ||
                    caractere[i].equalsIgnoreCase("o") ||
                    caractere[i].equalsIgnoreCase("u")) ){
                consoantes[numConsoantes] = caractere[i];
                numConsoantes++;
            }
        }
        System.out.println("Você digitou " + numConsoantes + " consoantes: ");

        int count = 0;
        while (count < numConsoantes){
            System.out.print(consoantes[count] + " ");
            count++;
        }
    }
}
