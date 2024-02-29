import java.util.Scanner;
public class questao_10 {
    public static void main(String[] args) {
        Scanner prova = new Scanner(System.in);

        System.out.println("Qual a nota da P1? ");
        int p1 = prova.nextInt();

        System.out.println("Qual a nota da P2? ");
        int p2 = prova.nextInt();

        double media = (p1 + p2)/2;

        String situacao;
        if (media >= 6){
            situacao = ("O aluno foi aprovado");
        } else {
            situacao = ("O aluno foi reprovado");
        }

        System.out.println("A nota da P1 foi " + p1);
        System.out.println("A nota da P2 foi " + p2);
        System.out.println("Sua média é " + media);
        System.out.println(situacao);
    }
}