package fixacao1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {
    public static final double PI = 3.14;
    
    public static final Random rd = new Random();
    
    public static Scanner INPUT = new Scanner(System.in);
    
    public static void br() {
        System.out.println("");     
    }
    
    public static void saudar() {
        System.out.println("Olá mundo...");
        System.out.println("§(*￣▽￣*)§");
    }
        
    public static void pedirNumero() {
        System.out.print("Digite um número: ");
        int num = INPUT.nextInt();
        System.out.println("O número informado foi " + num);
    }
    
    public static double media3numeros(double n1, double n2, double n3) {
        return (n1 + n2 + n3)/3;
    }
    
    public static double ponderada3numeros(double n1, double p1, double n2, double p2) {
        return ((n1 * p1) + (n2 * p2))/(p1 + p2);
    }
    
    public static double metroParaCm(double n) {
        return n * 100;
    }
    
    public static double areaCirculo(double r) {
        return PI * r * r;
    }
    
    public static double menorValor(double[] valores) {
        double menor = valores[0];
        for (double valor : valores) {
            if (menor > valor)
                menor = valor;
        }
        return menor;
    }
    
    public static double maiorValor(double[] valores) {
        double maior = valores[0];
        for (double valor : valores) {
            if (maior < valor)
                maior = valor;
        }
        return maior;
    }
    
    public static void aprovado(double n1, double n2) {
        double media = (n1+n2) / 2;
        boolean aprovado = media >= 7;
        System.out.println("Média do aluno: " + media);
        System.out.print("Situação: ");
        if (aprovado) {
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("REPROVADO...");
        }
    }
    
    public static void aprovadoFinal(double n1, double n2) {
        double media = (n1+n2) / 2;
        System.out.println("Média do aluno: " + media);
        String situacao = "";
        
        if (media < 7 && media >= 4) {
            situacao = "AF";
            System.out.println("Situação do Aluno: " + situacao);
            double af = 7.8;
            System.out.println("Nota da AF: " + af);
            System.out.println("Cálculo da Média + AF:");
            aprovado(af, media);
            return;
        }
        else if (media >= 7) {
            situacao = "APROVADO";
        }
        else if (media < 4) {
            situacao = "REPROVADO";
        }
        
        System.out.println("Situação do Aluno: " + situacao);
        System.out.println("Média do aluno: " + media);
    }
    
    public static boolean isEven(int n) {
        return n%2 == 0;
    }
    
    public static String evenOdd(int n) {
        if(isEven(n))
            return "Par";
        return "Ímpar";
    }
    
    public static void tabuada(int n) {
        for(int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n*i));
        }
    }
    
    public static boolean entre0e10(double n) {
        return (n > 0 && n <= 10);
    }
    
    public static boolean votoValido(int n) {
        return (n == 1 || n == 2 || n ==3);
    }
    
    public static void checarVotos(int[] votos) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int v : votos) {
            switch (v) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }
        
        System.out.println("Votos no Candidato X = " + count1);
        System.out.println("Votos no Candidato Y = " + count2);
        System.out.println("Votos no Candidato Z = " + count3);
        System.out.println("");
        System.out.print("Vencedor: ");
        double[] counts = {count1, count2, count3};
        double maior = maiorValor(counts);
        ArrayList vencedores = new ArrayList();
        
        if (count1 == maior)
            vencedores.add("Candidato X");
        if (count2 == maior)
            vencedores.add("Candidato Y");
        if (count3 == maior)
            vencedores.add("Candidato Z");
        
        vencedores.forEach((Object v) -> {
            if (vencedores.indexOf(v) == (vencedores.size()-1))
                System.out.println(v + "!!!");
            else
                System.out.print(v + ", ");
        });
    }
    
    public static void isPrimo(int num) {
        if (num <= 1) {
            System.out.println(num + " NÃO é primo...");
            return;
        }
        
        int flag = 0;
        
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                flag = 1;
                break;
            }
        }
        
        if (flag == 0)
            System.out.println(num + " É PRIMO!");
        else
            System.out.println(num + " NÃO é primo...");
    }
    
    public static void fibonacci(int n) {
        List<Integer> sequencia = new ArrayList();
        sequencia.add(0);
        sequencia.add(1);
        
        for(int i = 2; i < n; i++) {
            int nextNumber = sequencia.get(i-1) + sequencia.get(i-2);
            sequencia.add(nextNumber);
        }
        
        System.out.println(sequencia);
    }
    
    public static int somarAlgarismos(String s) {
        char[] algarismos = new char[s.length()];
        s.getChars(0, s.length(), algarismos, 0);
        
        int soma = 0;
        for (char c : algarismos) {
            soma += Character.getNumericValue(c);
        }
        return soma;
    }
    
    public static boolean isPositivo(int n) {
        return n >= 0;
    }
    
    public static double fatorial(int n) {
        if (n == 0) {
            return 1;
        }
        
        double total = 1;
        for (int i = n; i > 1; i--){
            total *= i;
        }
        return total;
    }
    
    public static int[] criaVetorInt(int n) {
        int[] vetor = new int[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(100);
        }
        return vetor;
    }
    
    public static void vetorRealDesc(int n) {
        float[] vetor = new float[n];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextFloat();
        }
        Arrays.sort(vetor);
        List<Float> vetorNovo = new ArrayList();
        for (int i = vetor.length-1; i >= 0; i--) {
            vetorNovo.add(vetor[i]);
        }
        System.out.println(vetorNovo);
    }
    
    public static int somaVetor(int[] v) {
        int soma = 0;
        for(int i = 0; i < v.length; i++) {
            soma += v[i];
        }
        return soma;
    }
    
    public static int multVetor(int[] v) {
        int total = 1;
        for(int i = 0; i < v.length; i++) {
            total *= v[i];
        }
        return total;
    }
    
    public static void vetorParImpar(int[] vetor) {
        List<Integer> vetorPar = new ArrayList();
        List<Integer> vetorImpar = new ArrayList();
        
        for (int v : vetor) {
            if (isEven(v)) {
                vetorPar.add(v);
            }
            else {
                vetorImpar.add(v);
            }
        }
        
        System.out.print("Vetor Original: ");
        System.out.println(Arrays.toString(vetor));
        System.out.print("Vetor Par: ");
        System.out.println(vetorPar);
        System.out.print("Vetor Ímpar: ");
        System.out.println(vetorImpar);
    }
    
    public static boolean sameLength(String s1, String s2) {
        return s1.length() == s2.length();
    }
    
    public static void checarFrases(String s1, String s2) {
        String tamanho;
        String conteudo;
        
        if (sameLength(s1, s2))
            tamanho = "IGUAIS";
        else
            tamanho = "DIFERENTES";
        
        if (s1.equals(s2))
            conteudo = "IGUAIS";
        else
            conteudo = "DIFERENTES";
                
        System.out.println("!!!（￣︶￣）↗　Informações das frases ♪(^∇^*) !!!");
        System.out.println("1ª - " + s1 + " | Comprimento = " + s1.length() + " caracteres");
        System.out.println("2ª - " + s2 + " | Comprimento = " + s2.length() + " caracteres");
        System.out.println("As frases possuem tamanhos " + tamanho + "!");
        System.out.println("O conteúdo das frases são " + conteudo + "!");
    }
    
    public static boolean cpfValido(String s) {
        
        if (s == null)
            return false;
        
        Pattern regraCPF = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}-[0-9]{2}");
        
        return regraCPF.matcher(s).matches();
    }
    
    public static int sinal() {
        if (rd.nextInt(2) == 0)
            return -1;
        return 1;
    }
    
    public static int soma3args(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    
    public static String numeroInverso(int n) {
        String numero = String.valueOf(n);
        String novoNumero = "";
        
        for (int i = numero.length(); i > 0; i--) {
            novoNumero += numero.charAt(i-1);
        }
        
        return novoNumero;
    }
    
    public static void mostraResultado(double n1, double n2, String s) {
        double resultado;
        String operador = "";
        switch (s) {
            case "soma":
                resultado = n1 + n2;
                operador = " + ";
                break;
            case "subtracao":
                resultado = n1 - n2;
                operador = " - ";
                break;
            case "multiplicacao":
                resultado = n1 * n2;
                operador = " x ";
                break;
            case "divisao":
                resultado = n1 / n2;
                operador = " : ";
                break;
            default:
                System.out.println("!!!Operação inválida!!! (╯°□°）╯︵ ┻━┻");
                System.out.println(". \n.. \n... \nSaindo do programa... ┗|｀O′|┛");
                return;
        }
        
        System.out.println(n1 + operador + n2 + " = " + resultado);
    }
}