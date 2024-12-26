package fundamentos;

import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {
    public static void main(String[] args){
        System.out.print("Deseja calcular a tabuada? S/N");
        String resposta = entrada.nextLine();

        switch (resposta){
            case "S":
            case "s":
                tabuada();
                break;
            case "N":
            case "n":
                System.out.println("Você saiu!");
                break;
            default:
                System.out.println("Você digitou um número diferente");
        }
    }
}
