import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class questao_13 {
    public static void main(String[] args) {
        Scanner ordem = new Scanner(System.in);

        System.out.println("Fale um número ");
        double valor_1 = ordem.nextDouble();

        System.out.println("Outro número ");
        double valor_2 = ordem.nextDouble();

        ArrayList<Double> lista = new ArrayList<>();
        lista.add(valor_1);
        lista.add(valor_2);

        Collections.sort(lista);

        for (double valor : lista) {
            System.out.println(valor);
        }
    }
}