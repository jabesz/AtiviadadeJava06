import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[][] matriz = new int[10][10];

        for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++) {

                System.out.println("Informe o elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = input.nextInt();

            }
        }

        int max = maxDig(matriz);

        System.out.println("O maior elemento acima da diagonal principal e: " + max );

    }

        public static int maxDig(int[][] matrix){
            int max = Integer.MAX_VALUE;

            for (int i = 0; i < 10; i++){

                for (int j = 0; j < 10; j++) {
                    if (matrix[i][j] > max){
                        max = matrix[i][j];
                    }

                }
            }

            return max;
        }

}
