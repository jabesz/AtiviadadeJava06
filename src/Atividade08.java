import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n;
        long res;

        System.out.print("Informe um valor positivo: ");
        n = input.nextInt();

        if (n > 0){
            res = fatorial(n);
            System.out.printf("O numero fatorial de %d é: %d",n ,res);
        }

    }

    public static int fatorial(int n){

        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * fatorial(n - 1);
        }

    }


}
