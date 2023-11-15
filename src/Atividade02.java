import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int h, m, s;
        System.out.println("Informe um valor para hora minuto e segundo:");
        System.out.println(" ");

        System.out.print("Informe a hora: ");
        h = input.nextInt();

        System.out.print("Informe os minutos: ");
        m = input.nextInt();

        System.out.print("Informe os segundo: ");
        s = input.nextInt();

        int resSec = convertSec(h, m, s);
        System.out.println(h + "h \t" + m + "min \t" + s + "s correspondem a\t" + resSec + "segundos");
    }

    public static int convertSec(int h, int m, int s){
        if (h < 0 || m < 0 || s < 0){
            System.out.println("Insira valores positivos!");
            return -1;
        }

        int totalSec = h * 3600 + m * 60 + s;
        return totalSec;
    }
}
