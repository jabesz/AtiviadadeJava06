import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int number1, number2;

        System.out.print("Insira o valor de n1: ");
        number1 = input.nextInt();

        System.out.print("Insira o valor de n2: ");
        number2 = input.nextInt();

        int mdc = mdc(number1, number2);
        System.out.printf("O mdc de %d e %d é: %d",number1, number2, mdc);

    }

    public static int mdc(int n1, int n2) {
        int form;

        while(n2 != 0){
            form = n2;
            n2 = n1 % n2;
            n1 = form;
        }

        return n1;
    }

}
