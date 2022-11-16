public class Area {
    //Considerando medidas em centímetros

    public static void calcularArea(double lado){
        double area = Math.pow(lado, 2);
        System.out.println(String.format("A área do quadrado de lado %.2fcm é %.2fcm²", lado, area));
    }
    
    public static void calcularArea(double base, double altura){
        double area = base * altura;
        System.out.println(String.format("A área do retângulo de base %.2fcm e altura %.2fcm é %.2fcm²", base, altura, area));
    }

    public static void calcularArea(double baseMenor, double baseMaior, double altura){
        double area = ( (baseMenor + baseMaior) * altura ) / 2;
        System.out.println(String.format("A área do trapézio é de %.2fcm²", area));
    }

    public static double area(double lado){
        double area = Math.pow(lado, 2);
        return  area;
    }

    public static double area(double base, double altura){
        double area = base * altura;
        return area;
    }

    public static double area(double baseMenor, double baseMaior, double altura){
        double area = ( (baseMenor + baseMaior) * altura ) / 2;
        return area;
    }
}
