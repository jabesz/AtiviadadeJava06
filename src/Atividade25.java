import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] numAlun = new int[10];
        double[][] scoreAluns = new double[10][4];

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe o numero do " +(i + 1)+ "° aluno: ");
            numAlun[i] = input.nextInt();

            for (int j = 0; j < 4; j++) {
                System.out.print("Informe a " +(j + 1)+ "° nota do aluno " + numAlun[i]+ ": ");
                scoreAluns[i][j] = input.nextDouble();
            }
        }

        double allMed = medAll(scoreAluns);

        System.out.println("A média aritmética de todos os alunos é " + allMed);

        int[] alunRecp = calAlunRec(numAlun, scoreAluns);

        System.out.println("Os numero dos alunos que deverao fazer a recuperacao sao: " );

        for (int num : alunRecp) {
            System.out.println(num);
        }


        input.close();
    }

    public static double medAll(double[][] scoreAluns) {
        double form = 0;
        int count = 0;

        for (double[] scoreAlun : scoreAluns) {
            for (double score : scoreAlun) {
                form += score;
                count++;
            }
        }

        return form / count;
    }

    public static int[] calAlunRec(int[] numAlun, double[][] scoreAluns) {
        int[] alunRec = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            double form = 0;

            for (double score : scoreAluns[i]) {
                form += score;
            }

            if (form / 4 < 6) {
                alunRec[count] = numAlun[i];

                count++;
            }
        }

        int[] res = new int[count];
        System.arraycopy(alunRec, 0, res, 0, count);
        return res;
    }


}
