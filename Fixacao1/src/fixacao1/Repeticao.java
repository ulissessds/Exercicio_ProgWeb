package fixacao1;

import static fixacao1.Utils.*;

public class Repeticao {
    public static void questao12() {
        System.out.print("Digite um número inteiro de 1 à 10: ");
        int n = INPUT.nextInt();
        if (entre0e10(n))
            tabuada(n);
    }
    
    public static void questao13() {
        double value = 0;
        do {
            System.out.print("Digite um número entre 0 e 10: ");
            value = INPUT.nextDouble();
            if (!entre0e10(value))
                System.out.println("Número inválido! Tente novamente... щ(゜ロ゜щ)");
        } while (!entre0e10(value));
        System.out.println("Número válido! Número = " + value);
    }
    
    public static void questao14() {
        System.out.print("Digite o número total de eleitores: ");
        int[] votos = new int[INPUT.nextInt()];
        System.out.println("Total de eleitores = " + votos.length);
        
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Eleitor número " + (i+1) + " escolha seu canditado:");
            System.out.println("1 - Candidato X");
            System.out.println("2 - Candidato Y");
            System.out.println("3 - Candidato Z");
            int aux = 0;
            while(!votoValido(aux)) {
                System.out.print("Escolha seu candidato(1, 2 ou 3): ");
                aux = INPUT.nextInt();
                if (!votoValido(aux))
                    System.out.println("Escolha inválida! Tente novamente... ╚(•⌂•)╝");
            }
            votos[i] = aux;
        }
        
        checarVotos(votos);
    }
    
    public static void questao15_1() {
        isPrimo(-45);
        isPrimo(2);
        isPrimo(0);
        isPrimo(79931);
        isPrimo(57);
        isPrimo(7);
        isPrimo(1);
    }
    
    public static void questao15_2() {
        int[] vetor = {10, 02, 3, 1, 31, 50, -67, 33, 63, 389};
        for (int v : vetor) {
            isPrimo(v);
        }
    }
    
    public static void questao16() {
        fibonacci(10);
        fibonacci(-1);
        fibonacci(12);
    }
    
    public static void questao17() {
        INPUT.nextLine(); //ignorar a próxima linha de caracteres...
        System.out.print("Digite um número inteiro positivo: ");
        int n = INPUT.nextInt();
        if (isPositivo(n)) 
            System.out.println(n + "! = " + fatorial(n));
    }
    
    public static void questao18() {
        System.out.print("Digite um número maior que 0: ");
        int n = INPUT.nextInt();
        if (n <= 0) {
            System.out.println("Número inválido... ~(>_<。)＼");
        }
        else {
            String numero = String.valueOf(n);
            System.out.print("A soma dos algarismos do número " + numero + " é: ");
            System.out.println(somarAlgarismos(numero));
        }
    }
}
