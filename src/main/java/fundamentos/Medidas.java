// 1- Pacote
package fundamentos;

// 2- Bibliotecas

import java.util.Scanner;
import java.lang.Math;

// 3- Classe
public class Medidas {
    // 3.1- Atributos
    static Scanner entrada = new Scanner(System.in); // Instanciar o obj de leitura do console
    static int base;
    static int altura;
    static double area = 0; // Recebe os cálculos das áreas

    // 3.2- Métodos e Funções
    public static void main(String[] args){
        String opcao;

        while(true) {
            System.out.println("Escolha o cálculo desejado: ");
            System.out.println("(1) Área do quadrado");
            System.out.println("(2) Área do retângulo");
            System.out.println("(3) Área do triângulo");
            System.out.println("(4) Área do círculo");
            System.out.println("(5) Tabuada");
            System.out.println("(6) Fibonacci");
            System.out.println("(7) Contagem regressiva");
            System.out.println("(S) Sair");

            opcao = entrada.nextLine(); // Leitura da opção

            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    break; // Para o while
                case "2":
                    area = calcularAreaDoRetangulo();
                    break;
                case "3":
                    area = calcularAreaDoTriangulo();
                    break;
                case "4":
                    area = calcularAreaDoCirculo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    regressiva();
                    break;
                case "S":
                case "s":
                    System.out.println("Agradecemos pela preferência");
                    break;
                default:
                    System.out.println("Opção inválida: " + opcao);
                    break;
            }

            if (area > 0) {
                System.out.println("A área é de " + area + "m²");
            }
        }
    }

    public static int calcularAreaDoQuadrado(){
        System.out.println("Digite o tamanho do lado: ");
        int lado = entrada.nextInt(); // Leitura do tamanho do lado

        // Desenhar o quadrado
        for(int linha = 1; linha <= lado; linha+=2) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");
            }
            System.out.println(" ");
        }
        System.out.println(" "); // Pular de linha
        return lado * lado; // Retorna a área do quadrado;
    }

    public static int calcularAreaDoRetangulo(){
        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura;
    }

    public static int calcularAreaDoTriangulo(){
        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura / 2;
    }

    public static double calcularAreaDoCirculo(){
        System.out.println("Digite o tamanho do perímetro do círculo: ");
        double diametro = entrada.nextFloat();
        return 3.1416 * Math.pow((diametro/2), 2);
    }

    public static void tabuada(){
        System.out.println("Você quer calcular a tabuada de qual número? ");
        byte numero = entrada.nextByte();

        for(byte i = 1; i <= 10; i++){
            System.out.println(numero * i);
        }
    }

    public static void fibonacci(){
        System.out.println("Quantos deseja calcular na sequência? ");
        byte numero = entrada.nextByte();

        switch (numero) {
            case 0:
                System.out.println("A sequência está vazia");
                break;
            case 1:
                System.out.println("Seguência de Fibonacci: 1");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                for (int i = 1; i <= numero; i++) {
                    System.out.println("A sequência é: " + num1);
                    num1 = num1 + num2;
                    num2 = num1 - num2;
                }
        }
    }

    public static void regressiva(){
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        System.out.print("Pulando de quantos em quantos número p/ vez? ");
        int decr = entrada.nextInt();

        for(int i = numero; i >= 1; i-= decr){
            System.out.println("Número: " + i);
        }
    }
}