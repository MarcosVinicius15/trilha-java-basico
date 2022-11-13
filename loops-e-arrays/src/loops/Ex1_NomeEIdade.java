package loops;

import java.util.Scanner;

/*
* Faça um programa que leia conjuntos de dois valores, o primeiro
* representando o nome do aluno e o segundo representando a sua idade.
* (Pare o programa inserindo o valor 0 no campo nome)
* */

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        String nome;
        int idade;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")){
                break;
            }
            System.out.print("Idade: ");
            idade = scanner.nextInt();
        }
    }
}
