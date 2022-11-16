
public class Emprestimo {
    public static void valorFinalEmprestimo(double valorEmprestimo, int tempo){
        //Considerando tempo em meses
        final double SELIC = 13.75;
        double montante = valorEmprestimo * Math.pow(1 + SELIC/100, tempo);
        System.out.println(String.format("O valor final do empréstimo será: %.2f",montante));
    }
}
