import java.util.Scanner;
public class questao_7 {
    public static void main(String[] args) {
        Scanner maiorque = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int valor = maiorque.nextInt();

        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
