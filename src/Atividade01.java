import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
            var input = new Scanner(System.in);
            int n;

            System.out.print("Informe um valor positivo:");
            n = input.nextInt();

            int res = calcular(n);
            System.out.println("A soma do valores entre 1 e " + n + " é: " +res);
    }

    public static int calcular(int n){
        if (n <= 0){
            System.out.println("Infome um numero inteiro positivo!");
            return -1;
        }

        int soma = 0;

        for (int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }

}