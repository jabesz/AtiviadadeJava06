import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        double[] temp = new double[12];
        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto",
                          "setembro", "outubro", "novembro", "dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.print("Informe a temperatura media do mes de " + meses[i] + ": ");
            temp[i] = input.nextDouble();

        }

        int indiceMaior = calMaior(temp);
        int indiceMenor = calMenor(temp);

        showTemp("A maior temperatura do ano foi ", temp[indiceMaior], meses[indiceMaior]);
        showTemp("A menor temperatura do ano foi ", temp[indiceMenor], meses[indiceMenor]);

        input.close();
    }

    public static int calMaior(double[] temp) {
        int indMaior = 0;
        double maxTemp = temp[0];

        for (int i = 0; i < 12; i++) {
            if (temp[i] > maxTemp) {
                maxTemp = temp[i];
                indMaior = i;
            }
        }

        return indMaior;
    }

    public static int calMenor(double[] temp) {
        int indMenor = 0;
        double minTemp = temp[0];

        for (int i = 0; i < 12; i++) {
            if (temp[i] < minTemp) {
                minTemp = temp[i];
                indMenor = i;
            }
        }

        return indMenor;
    }

    public static void showTemp(String msg, double temp, String mes) {
        System.out.println(msg + temp + " em " + mes);

    }

}
