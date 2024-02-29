import java.util.Scanner;
public class questao_2 {
    public static void main (String[] args){
        Scanner votos = new Scanner(System.in);

        System.out.println("Há quantos eleitores? ");
        int eleitor = votos.nextInt();

        System.out.println("Quantos votos válidos? ");
        int voto_valido = votos.nextInt();

        System.out.println("Quantos votos brancos? ");
        int voto_branco = votos.nextInt();

        System.out.println("Quantos votos nulos? ");
        int voto_nulo = votos.nextInt();

        double porcentual_valido = voto_valido * 100/eleitor;
        double porcentual_branco = voto_branco * 100/eleitor;
        double porcentual_nulo = voto_nulo * 100/eleitor;

        System.out.println(eleitor + " Pessoas votaram, sendo que " + porcentual_valido + "% tiveram o voto válido "
                + porcentual_branco + "% votou branco e " + porcentual_nulo + "% votaram nulo");
    }
}