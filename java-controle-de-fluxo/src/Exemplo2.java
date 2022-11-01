import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um dia da semana: (MAIÚSCULO) ");
        String dia = scanner.next();
        int numero = 0;

        switch (dia){
            case "DOMINGO":
                numero = 1;
                break;
            case "SEGUNDA":
                numero = 2;
                break;
            case "TERÇA":
                numero = 3;
                break;
            case "QUARTA":
                numero = 4;
                break;
            case "QUINTA":
                numero = 5;
                break;
            case "SEXTA":
                numero = 6;
                break;
            case "SABADO":
                numero = 7;
                break;
            default:
                System.out.println("DIA Inválido");
        }

        System.out.println("Número: " + numero);

        switch (numero){
             case 1:
             case 2:
             case 3:
                 System.out.println("Certo");
                 break;
             case 4:
                 System.out.println("Errado");
                 break;
             case 5:
                 System.out.println("Talvez");
                 break;
             default:
                 System.out.println("Valor Inválido!");
         }
    }
}
