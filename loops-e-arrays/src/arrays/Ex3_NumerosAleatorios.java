package arrays;

import java.util.Random;

/*
* Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100)
* armazene-os num vetor. Ao final, mostre os números e seus sucessores.
* */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[20];

        Random gerador = new Random();

        for(int i=0; i<20; i++){
            numerosAleatorios[i] = gerador.nextInt(101);
        }

        for (int valor : numerosAleatorios){
            System.out.println("Valor: " + valor + " | Sucessor: " + (valor+1) );
        }
    }
}
