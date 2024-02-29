import java.util.Scanner;

public class questao_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas horas foram trabalhadas esse mês? ");
        int horas_trabalhadas = scanner.nextInt();

        System.out.println("Qual o salário por hora? ");
        double salario_hora = scanner.nextInt();

        int horas_semanais = 40;
        int semanas_mes = 4;
        double hora_extra = 0.5;

        double salarioTotal = 0;

        if (horas_trabalhadas <= horas_semanais * semanas_mes) {
            salarioTotal = horas_trabalhadas * salario_hora;
        } else {
            double horasExtras = horas_trabalhadas - horas_semanais * semanas_mes;
            salarioTotal = horas_semanais * semanas_mes * salario_hora
                    + horasExtras * (1 + hora_extra) * salario_hora;
        }

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
    }
}
