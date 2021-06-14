package fixacao1;

import static fixacao1.Utils.*;
import java.util.Arrays;

public class StringsVetores {
    
    public static void questao19() {
        int[] vetor = criaVetorInt(5);
        System.out.println(Arrays.toString(vetor));
    }
    
    public static void questao20() {
        vetorRealDesc(10);
    }
    
    public static void questao21() {
        int[] vetor = criaVetorInt(5);
        System.out.println(Arrays.toString(vetor));
        System.out.println("Soma: " + somaVetor(vetor));
        System.out.println("Multiplicação: " + multVetor(vetor));
    }
    
    public static void questao22() {
        int[] vetor = criaVetorInt(20);
        vetorParImpar(vetor);
    }
    
    public static void questao23() {
        INPUT.nextLine(); //ignorar a próxima linha de caracteres...
        System.out.println("Digite a primeira frase:");
        String frase1 = INPUT.nextLine();
        br();
        System.out.println("Digite a segunda frase:");
        String frase2 = INPUT.nextLine();
        br();
        checarFrases(frase1, frase2);
    }
    
    public static void questao24() {
        System.out.println("Digite seu CPF:");
        String cpf = INPUT.nextLine();
        if (cpfValido(cpf))
            System.out.println("CPF Válido!");
        else
            System.out.println("Entrada Inválida...");
    }
    
    public static void questao25() {
        int arg1 = sinal() * rd.nextInt(50);
        int arg2 = sinal() * rd.nextInt(50);
        int arg3 = sinal() * rd.nextInt(50);
        
        System.out.println("Argumento 1 = " + arg1);
        System.out.println("Argumento 2 = " + arg2);
        System.out.println("Argumento 3 = " + arg3);
        br();
        System.out.println("Soma dos argumentos = " + soma3args(arg1, arg2, arg3));
    }
    
    public static void questao26() {
        System.out.print("Número inteiro informado = ");
        int num = rd.nextInt(501);
        System.out.println(num);
        System.out.print("Inverso do número informado = ");
        System.out.println(numeroInverso(num));
    }
    
    public static void questao27() {
        System.out.print("Digite o 1º valor: ");
        double valor1 = INPUT.nextDouble();
        System.out.print("Digite o 2º valor: ");
        double valor2 = INPUT.nextDouble();
        INPUT.nextLine(); //ignorar a próxima linha de caracteres...
        System.out.println("Qual a operação? (soma, subtracao, multiplicacao, divisao)");
        String operacao = INPUT.nextLine();
        br();
        System.out.println("Resultado （づ￣3￣）づ╭❤～");
        mostraResultado(valor1, valor2, operacao);
    }
}
