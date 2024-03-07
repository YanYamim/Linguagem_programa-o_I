public class Calculo_fracoes {
    private int numerador;
    private int denominador;

    public Calculo_fracoes(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            System.out.println("Denominador não pode ser zero. Atribuindo 1 como padrão.");
            this.denominador = 1;
        }
    }

    public Calculo_fracoes somar(Calculo_fracoes outra_fracao) {
        int novo_numerador = this.numerador * outra_fracao.denominador + outra_fracao.numerador * this.denominador;
        int novo_denominador = this.denominador * outra_fracao.denominador;
        return new Calculo_fracoes(novo_numerador, novo_denominador);
    }

    public Calculo_fracoes subtrair(Calculo_fracoes outra_fracao) {
        int novo_numerador = this.numerador * outra_fracao.denominador - outra_fracao.numerador * this.denominador;
        int novo_denominador = this.denominador * outra_fracao.denominador;
        return new Calculo_fracoes(novo_numerador, novo_denominador);
    }

    public Calculo_fracoes multiplicar(Calculo_fracoes outra_fracao) {
        int novo_numerador = this.numerador * outra_fracao.numerador;
        int novo_denominador = this.denominador * outra_fracao.denominador;
        return new Calculo_fracoes(novo_numerador, novo_denominador);
    }

    public Calculo_fracoes dividir(Calculo_fracoes outra_fracao) {
        if (outra_fracao.numerador != 0) {
            int novo_numerador = this.numerador * outra_fracao.denominador;
            int novo_denominador = this.denominador * outra_fracao.numerador;
            return new Calculo_fracoes(novo_numerador, novo_denominador);
        } else {
            System.out.println("Divisão por zero não é permitida. Retornando a fração original.");
            return this;
        }
    }

    public void exibir() {
        System.out.println(numerador + "/" + denominador);
    }

    public static void main(String[] args) {
        Calculo_fracoes fracao1 = new Calculo_fracoes(1, 2);
        Calculo_fracoes fracao2 = new Calculo_fracoes(3, 4);

        System.out.println("Fracao1:");
        fracao1.exibir();

        System.out.println("Fracao2:");
        fracao2.exibir();

        System.out.println("Soma:");
        Calculo_fracoes resultado_soma = fracao1.somar(fracao2);
        resultado_soma.exibir();

        System.out.println("Subtração:");
        Calculo_fracoes resultado_subtracao = fracao1.subtrair(fracao2);
        resultado_subtracao.exibir();

        System.out.println("Multiplicação:");
        Calculo_fracoes resultado_multiplicacao = fracao1.multiplicar(fracao2);
        resultado_multiplicacao.exibir();

        System.out.println("Divisão:");
        Calculo_fracoes resultado_divisao = fracao1.dividir(fracao2);
        resultado_divisao.exibir();
    }
}