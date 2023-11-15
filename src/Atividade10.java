import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int number;

        System.out.print("Informe um valor inteiro e positivo: ");
        number = input.nextInt();

        if (number < 1) {
            System.out.println("O valor deve ser maior ou igual a 1!");
        } else {
            double res = sequencia(number);
            System.out.printf("O valor da sequencia e: %.2f",number, res);
        }

        input.close();
    }

    public static double sequencia(int number){
        double form = 0.0;

        for (int i = 1; i <= number; i++){
            form += 1.0 / i;
        }

        return form;
    }

}
