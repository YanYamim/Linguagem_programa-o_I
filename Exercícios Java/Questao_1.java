import java.util.Scanner;
public class Questao_1 {
    public static void main (String[] args){
        Scanner idade = new Scanner(System.in);

        System.out.println("Fale sua idade em anos ");
        int anos = idade.nextInt();

        System.out.println("E quantos meses ");
        int meses = idade.nextInt();

        System.out.println("E quantos dias ");
        int dias = idade.nextInt();

        int ano_total = anos * 365;
        int meses_totais = meses * 30;

        int idade_total = (ano_total + meses_totais + dias);
        System.out.println(idade_total + "Dias de vida");
    }
}
