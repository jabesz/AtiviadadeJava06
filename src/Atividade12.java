import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int x, z;

        System.out.print("Informe um valor para X: ");
        x = input.nextInt();

        System.out.print("Informe um valor para Z: ");
        z = input.nextInt();

        long res = expo(x, z);
        System.out.printf("%d elevado a %d e igual a: %d",x ,z ,res);

    }

    public static long expo(int x, int z){
        long res = 1;

        for (int i = 1; i <= z; i++){
            res *= x;
        }

        return res;
    }

}
