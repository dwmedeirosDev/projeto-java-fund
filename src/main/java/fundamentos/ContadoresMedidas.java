package fundamentos;
import static fundamentos.Medidas.entrada;

public interface ContadoresMedidas{
    static void regressiva() {
        System.out.println("Digite um número: ");
        int numero = entrada.nextInt();

        for(int i = numero; i >= 1; i--){
            System.out.println("Número: " + i);
        }
        System.out.println("Entrou na Interface");
    }
}
