import java.util.Scanner;
public class questao_8 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Insira um número ");
        int valor = numero.nextInt();
            if (valor >= 0) {
                System.out.println("Esse número é positivo");
            } else {
                System.out.println("Esse número é negativo");
            }
    }
}