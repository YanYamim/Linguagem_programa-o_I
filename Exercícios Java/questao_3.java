import java.util.Scanner;
public class questao_3 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Salário atual ");
        double salario_atual = salario.nextDouble();

        System.out.println("porcentual de reajuste ");
        double reajuste = salario.nextDouble();

        double valor_reajuste = salario_atual * (reajuste/100);

        double novo_salario = salario_atual + valor_reajuste;

        System.out.println(novo_salario);
    }
}