import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int num;

        System.out.print("Informe um valor: ");
        num = input.nextInt();

    verificar(num);

    }

    public static void verificar(int num){
        if(num < 0) {
            System.out.println("É negativo.");
        } else if (num > 0){
            System.out.println("É positivo.");
        } else {
            System.out.println("É zero.");
        }

    }

}
