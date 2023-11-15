import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int number;

        System.out.print("Informe um valor inteiro e positivo: ");
        number = input.nextInt();

        if (number < 0){
            System.out.println("O valor deve ser inteiro e positivo!");
        } else {
            double res = soma(number);
            System.out.printf("O valor da soma de e: %.2f",res);
        }

        input.close();
    }

    public static double soma(int number){
        double form = 0.0, valor;

        for (int i = 1; i <= number; i++){
            valor = (Math.pow(i, 2) + 1) / (i + 3);
            form += valor;
        }

        return form;
    }

}
