public class OperacoesBasicas {
    public static void somar(double valor1, double valor2){
        double soma = valor1 + valor2;
        System.out.println("A soma de " + valor1 + " com " + valor2 + " é igual a " + soma);
    }

    public static void subtrair(double valor1, double valor2){
        double resposta = valor1 - valor2;
        System.out.println("A subtração de " + valor1 + " com " + valor2 + " é igual a " + resposta);
    }

    public static void multiplicar(double valor1, double valor2){
        double produto = valor1 * valor2;
        System.out.println("A multiplicação de " + valor1 + " com " + valor2 + " é igual a " + produto);
    }

    public static void dividir(double valor1, double valor2){
        if (valor2 != 0){
            double quociente = valor1 / valor2;
            System.out.println(String.format("A divisão de %.2f com %.2f é igual a %.2f", valor1, valor2, quociente));
        }else{
            System.out.println("Impossível dividir por 0.");
        }
    }
}
