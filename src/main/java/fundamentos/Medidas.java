// 1- Pacote
package fundamentos;

// 2- Bibliotecas
import java.util.Scanner;

// 3- Classe
public class Medidas {
    //3.1- Atributos
    static int lado;
    static Scanner entrada = new Scanner(System.in); // Instanciar o obj de leitura do console
    static int base;
    static int altura;

    //3.2- Métodos e Funções
    public static void main(String[] args){
        String opcao;
        int area = 0; // Recebe os cálculos das áreas

        System.out.println("Escolha o cálculo desejado: ");
        System.out.println("(1) Área do quadrado");
        System.out.println("(2) Área do retângulo");
        System.out.println("(3) Área do triângulo");
        System.out.println("(4) Área do círculo");

        opcao = entrada.nextLine(); // Leitura da opção

        switch (opcao){
            case "1":
               area = calcularAreaDoQuadrado();
               break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriângulo();
                break;
//            case "4":
//                area = (int) calcularAreaDoCirculo();
//                break;
            default:
                System.out.println("Opção inválida: " + opcao);
        }

        if(area > 0) {
            System.out.println("A área é de " + area + "m²");
        }
    }

    public static int calcularAreaDoQuadrado(){
        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        return lado * lado; // Retorna a área do quadrado;
    }

    public static int calcularAreaDoRetangulo(){
        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura;
    }

    public static int calcularAreaDoTriângulo(){
        System.out.println("Digite o tamanho da base: ");
        base = entrada.nextInt();
        System.out.println("Digite o tamanho da altura: ");
        altura = entrada.nextInt();
        return base * altura / 2;
    }

//    public static float calcularAreaDoCirculo(){ // RESOLVER
//        int perimetro;
//        float raio, r;
//
//        System.out.println("Digite o tamanho do perímetro do círculo: ");
//        perimetro = (int) entrada.nextFloat();
//        raio = (float) perimetro / 2;
//        r = 3,14 * raio ^ 2;
//    }
}
