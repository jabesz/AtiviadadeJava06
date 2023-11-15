import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {

        calMedia();

    }

    public static void calMedia() {
        var input = new Scanner(System.in);
        double media;
        int num = 0, soma = 0;
        int valor;

        System.out.println("Informe os valores positivos (0 para encerrar)");

        do {
            System.out.print("Informe um valor positivo: ");
            valor = input.nextInt();

            if (valor > 0) {
                soma += valor;
                num++;
            } else if (valor < 0) {
                System.out.println("Valor invalido insira um numero positivo!");
            }
        } while (valor != 0);

        if (num > 0) {
           media = (double) soma / num;
            System.out.printf("A media dos valores positivos é: %.1f" ,media);
        } else {
            System.out.println("Nenhum valor positivo foi inserido");
        }
        input.close();

    }

}
