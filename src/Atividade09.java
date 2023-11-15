import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n;

        System.out.print("Informe um numero positivo: ");
        n = input.nextInt();

        int res = divisores(n);
        System.out.printf("A soma dos divisores de %d é: %d",n ,res);

    }

    public static int divisores(int n){

        if (n <= 0) {
            System.out.println("Valor invalido!");
            return 0;
        }

        int div = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                div += i;
            }
        }

        return div;
    }

}
