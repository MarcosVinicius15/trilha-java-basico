
public class Main {
    public static void main(String[] args) {
        //Operações Básicas
        System.out.println("Operações Básicas:");
        OperacoesBasicas.somar(1.4, 2.7);
        OperacoesBasicas.subtrair(20, 13);
        OperacoesBasicas.multiplicar(3, 7);
        OperacoesBasicas.dividir(1, 0);
        OperacoesBasicas.dividir(10, 5);

        //Mensagens
        System.out.println("\n\nMensagens:");
        Mensagem.mensagem(5);
        Mensagem.mensagem(9);
        Mensagem.mensagem(12);
        Mensagem.mensagem(15);
        Mensagem.mensagem(18);
        Mensagem.mensagem(22);
        Mensagem.mensagem(3);
        Mensagem.mensagem(24);
        Mensagem.mensagem(0);
        Mensagem.mensagem(26);

        //Empréstimo
        System.out.println("\n\nEmpréstimo:");
        Emprestimo.valorFinalEmprestimo(8000, 36);

        //Áreas
        System.out.println("\n\nÁreas:");
        Area.calcularArea(5.3);
        Area.calcularArea(6, 8);
        Area.calcularArea(9, 5, 8);


        System.out.println(String.format("Area Quadrado: %.2f", Area.area(5.3)));
        System.out.println(String.format("Area Retângulo: %.2f", Area.area(6, 8)));
        System.out.println(String.format("Area Trapézio: %.2f", Area.area(9,5,8)));

    }
}