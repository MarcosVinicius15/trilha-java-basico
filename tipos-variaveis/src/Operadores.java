public class Operadores {
    public static void main(String[] args) {
        /*String nomeCompleto = "Marcos" + "Vinicius";

        System.out.println(nomeCompleto);

        String concatenacao = "?";
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        int numero = 5;
        System.out.println(-numero);

        System.out.println(numero);

        numero = - numero;

        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero ++; //Incremento de valor
        System.out.println(numero);

        numero --; //Decremento de valor
        System.out.println(numero);

        System.out.println(--numero);

        //Operador Ternário
        int a,b;
        a = 9;
        b = 7;
        String resultado;
        resultado = a==b ? "Iguais" : "Diferentes";
        System.out.println(a + " e " + b + " são " + resultado);

        //Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean igual = numero1 == numero2;
        System.out.println("Número1 é igual a número2? " + igual);

        boolean diferente = numero1 != numero2;
        System.out.println("Número1 é diferente do número2? " + diferente);

        boolean simNao = numero1 > numero2;
        System.out.println("Número1 é maior que o número 2 ? " + simNao);

        simNao = numero2 > numero1;
        System.out.println("Npúmero2 é maior que o número1 ? " + simNao);


        String nomeUm = "Marcos";
        String nomeDois = "Marcos";
        System.out.println(nomeUm.equals(nomeDois));

        //Operadores Lógicos

        boolean condicao1 = false;
        boolean condicao2 = false;

        String mensagem;
        mensagem = condicao1 && condicao2 ? "Duas Verdadeiras" : condicao1 || condicao2 ? "Apenas uma delas são verdadeiras" : "As duas são falsas";
        System.out.println(mensagem);

    }
}
