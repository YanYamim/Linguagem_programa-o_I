import java.util.Scanner;
public class questao_11 {
    public static void main(String[] args) {
        Scanner eleitor = new Scanner(System.in);

        System.out.println("Em que ano estamos? ");
        int ano_atual = eleitor.nextInt();

        System.out.println("Em que ano você nasceu ? ");
        int ano_nascimento = eleitor.nextInt();

        if(ano_atual - ano_nascimento >= 16){
            System.out.println("Você pode votar");
        } else {
            System.out.println("Você não tem idade pra votar");
        }
    }
}