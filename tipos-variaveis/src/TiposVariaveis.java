public class TiposVariaveis {
    public static void main(String[] args) {
        //Tipos Primitivos

        double salarioMinimo = 1500;
        byte idade = 123;
        short ano = 2022;
        int cep = 13354087;
        long cpf = 12345678903L;
        float pi = 3.1415F;
        double salario = 2252.89;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;
        System.out.println(numero);
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.1415;

        char sexo = 'M';
    }
}