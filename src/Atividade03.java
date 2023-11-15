import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int n1, n2;

        System.out.print("Informe o primeiro valor: ");
        n1 = input.nextInt();
        System.out.print("Informe o segundo valor: ");
        n2 = input.nextInt();

        int res = divisor(n1, n2);

        if (res == 0){
            System.out.println(n1 + " e divisivel por " + n2);
        } else {
            System.out.println(n1 + " não é divisivel por " + n2 + ". Proximo divisor " +res);
        }

    }

    public static int divisor(int n1, int n2){
        if (n2 < 0){
            System.out.println("Informe um numero positivo!");
            return -1;
        }

        if (n1 % n2 == 0){
            return 0;

        } else {
            int nextDiv = (n1 / n2 + 1) * n2;
            return nextDiv;
        }
    }

}
