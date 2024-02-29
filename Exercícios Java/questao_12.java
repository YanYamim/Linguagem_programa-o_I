import java.util.Scanner;
public class questao_12 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);

        System.out.println("Fale um número ");
        double valor_1 = valores.nextInt();

        System.out.println("Outro número ");
        double valor_2 = valores.nextInt();

        if(valor_1 > valor_2){
            System.out.println(valor_1 + "É maior que " + valor_2);
        } else {
            System.out.println(valor_2 + "É maior que " + valor_1);
        }
    }
}