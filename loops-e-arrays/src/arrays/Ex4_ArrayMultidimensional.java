package arrays;

/*
* Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
* Após isso determine o menor número da matriz e a sua posição(linha, coluna).
* */

import java.util.Random;

public class Ex4_ArrayMultidimensional {
    public static void main(String[] args) {
        Random gerador = new Random();

        int[][] m = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = gerador.nextInt(10);
            }
        }

        System.out.println("Matrix M 4X4 gerada:");
        for(int[] linha : m){
            for(int valor : linha){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
