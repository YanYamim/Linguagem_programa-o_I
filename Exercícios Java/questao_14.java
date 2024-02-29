import java.util.Scanner;
public class questao_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a hora de início do jogo (inteira): ");
        int hora_inicio = scanner.nextInt();

        System.out.println("Informe a hora de fim do jogo (inteira): ");
        int hora_fim = scanner.nextInt();

        int duracao_jogo = calculo_jogo(hora_inicio, hora_fim);

        System.out.println("A duração do jogo é de " + duracao_jogo + " horas.");
    }
    private static int calculo_jogo(int inicio, int fim) {
        final int MAX_HORAS_DIA = 24;

        if (inicio <= fim) {
            return fim - inicio;
        } else {
            // O jogo começou em um dia e terminou no dia seguinte
            return MAX_HORAS_DIA - inicio + fim;
        }
    }
}
