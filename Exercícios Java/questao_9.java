import java.util.Scanner;
public class questao_9 {
    public static void main(String[] args) {
        Scanner maca = new Scanner(System.in);

        System.out.println("Quantas maças foram compradas? ");
        int numero_maca = maca.nextInt();

       double preco;
       if (numero_maca < 12) {
            preco = 1.3;
       } else {
            preco = 1;
        }

       double custo_total = numero_maca + preco;

       System.out.println(custo_total);
    }
}