import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[10][5];

        rdMatrix(matrix, input);
        double sum = sixRow(matrix);


        System.out.println("A soma de todos os elementos abaixo da sexta linha é: " + sum);

        input.close();
    }

    public static void rdMatrix(double[][] matrix, Scanner input) {

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = input.nextDouble();

            }
        }

    }

    public static double sixRow(double[][] matrix) {
        double sum = 0;

        for (int i = 5; i < 10; i++) {

            for (int j = 0; j < 5; j++) {
                sum += matrix[i][j];
            }
        }

        return sum;
    }
}
