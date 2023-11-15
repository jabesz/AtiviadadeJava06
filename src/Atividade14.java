import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        verificar();

    }

    public static void verificar() {
        var input = new Scanner(System.in);

        int tam = 30;
        int[] x = new int[tam];
        int[] a = new int[x.length];
        int[] b = new int[x.length];

        for (int i = 0; i < tam; i++){
            System.out.print("Informe o " +(i + 1)+ "° valor: ");
            x[i] = input.nextInt();

        }

        for (int i = 0; i < x.length; i++) {
            if (x[i] > 0) {
                a[i] = x[i];
                System.out.println("Os valores maiores que zero sao: " + a[i]);
            } else {
                b[i] = x[i];
                System.out.println("Os valores menores ou igual a zero sao: " + b[i]);
            }
        }

    }


}
