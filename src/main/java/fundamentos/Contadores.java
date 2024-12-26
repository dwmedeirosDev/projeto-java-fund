package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args) {
        System.out.println("Deseja realizar a contagem regressiva? S/N");
        String resposta = entrada.nextLine();

        if (resposta.equals("S") || resposta.equals("s")) {
            ContadoresMedidas.regressiva();
        }
        else{
            System.out.println("Você saiu");
        }
    }

}
