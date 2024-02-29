import java.util.Scanner;
public class questao_4 {
    public static void main(String[] args) {
        Scanner carro = new Scanner(System.in);

        System.out.println("Custo de fábrica ");
        double custo_fabrica = carro.nextDouble();

        double porc_distribuidor = custo_fabrica * 0.28;

        double porc_impostos = custo_fabrica * 0.45;

        double custo_final = custo_fabrica + porc_impostos + porc_distribuidor;

        System.out.println(custo_final);
    }
}