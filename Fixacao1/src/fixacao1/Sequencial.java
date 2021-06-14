package fixacao1;

import static fixacao1.Utils.*;

public class Sequencial {
    
    public static void questao1() {
        saudar();
    }
    
    public static void questao2() {
        pedirNumero();
    }
    
    public static void questao3() {
        double n1 = 6.7;
        double n2 = 9.8;
        double n3 = 9.2;
        System.out.print("A média aritmética de " + n1 + ", " + n2 + " e " + n3);
        System.out.println(" é: " + media3numeros(6.7, 9.8, 9.2));
    }
    
    public static void questao4() {
        double n1 = 8.2;
        double p1 = 2;
        double n2 = 9.8;
        double p2 = 4;
        System.out.println("Média ponderada");
        System.out.println("Valor 1: " + n1 + " / Peso: " + p1);
        System.out.println("Valor 2: " + n2 + " / Peso: " + p2);
        System.out.println(ponderada3numeros(8.2, 2, 9.8, 4));
    }
    
    public static void questao5() {
        double n1 = 8;
        System.out.println("Converter de metros para centímetros");
        System.out.println(n1 + " m = " + metroParaCm(n1) + " cm");
    }
    
    public static void questao6() {
        double n1 = 7.5;
        System.out.println("Raio do Círculo = " + n1);
        System.out.println("Área do Círculo = " + areaCirculo(n1));
    }
}
