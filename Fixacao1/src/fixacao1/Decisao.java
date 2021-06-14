package fixacao1;

import static fixacao1.Utils.*;

public class Decisao {
    
    public static void questao7() {
        System.out.println("Qual dos 3 preços é o mais barato?");
        System.out.print("Digite o 1º preço: ");
        double p1 = INPUT.nextDouble();
        System.out.print("Digite o 2º preço: ");
        double p2 = INPUT.nextDouble();
        System.out.print("Digite o 3º preço: ");
        double p3 = INPUT.nextDouble();
        double[] precos = {p1, p2, p3};
        double menor = menorValor(precos);
        System.out.println("O produto mais barato vale: " + menor);     
    }
    
    public static void questao8() {
        aprovado(4.0, 8.0);
        aprovado(9.0, 9.57);
    }
    
    public static void questao9() {
        aprovadoFinal(3.5, 10);
        br();
        aprovadoFinal(9.5, 8.4);
    }
    
    public static void questao10() {
        double[] valores = {78.56, 83.20};
        System.out.print("O maior valor entre ");
        System.out.println(valores[0] + " e " + valores[1] + " é: " + maiorValor(valores));
    }
    
    public static void questao11() {
        int n1 = 29;
        int n2 = 12946;
        System.out.println("O número " + n1 + " é " + evenOdd(n1));
        System.out.println("O número " + n2 + " é " + evenOdd(n2));
    }
}
