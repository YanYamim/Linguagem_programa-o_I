import java.util.Scanner;
public class questao_5 {
    public static void main(String[] args) {
        Scanner venda = new Scanner(System.in);

        System.out.println("Informe o salário fixo ");
        double salario_fixo = venda.nextDouble();

        System.out.println("Informe a comissão fixa ");
        double comissao_fixa = venda.nextDouble();

        System.out.println("Informe total de vendas ");
        double total_vendas = venda.nextDouble();

        System.out.println("Informe o total de carros vendidos ");
        double carros_vendidos = venda.nextDouble();

        double final_vendas = total_vendas * 0.05;
        double final_carros = carros_vendidos * comissao_fixa;

        double salario_final = final_vendas + final_carros + salario_fixo;

        System.out.println(salario_final);
    }
}