// 1- Pacote
package fundamentos;

// 2- Bibliotecas
import java.util.Scanner;

// 3- Classe
public class Medidas {
    //3.1- Atributos
    static Scanner entrada;

    //3.2- Métodos e Funções
    public static void main(String[] args){
        String opcao;
        entrada = new Scanner(System.in); // Instanciar o obj de leitura do console

        System.out.println("Escolha o cálculo desejado: ");
        System.out.println("(1) Área do quadrado");
        System.out.println("(2) Área do retângulo");
        System.out.println("(3) Área do triângulo");
        System.out.println("(4) Área do círculo");

        opcao = entrada.nextLine(); // Leitura da opção

    }

    public static int calcularAreaDoQuadrado(){
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // Leitura do tamanho do lado
        return lado ^ 2; // Retorna a área do quadrado;
    }
}
