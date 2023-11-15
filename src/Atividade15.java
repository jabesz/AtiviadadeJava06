import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        int[] number = new int[15];

        System.out.println("Informe os 15 valores inteiros:");
        System.out.println();
        for (int i = 0; i < 15; i++){
            System.out.print("Informe o " +(i + 1)+ "° valor: ");
            number[i] = input.nextInt();
        }

        int contPar =  pares(number);
        System.out.println("A quantidade de valores pares sao: " +contPar);

        input.close();
    }

    public static int pares(int[] n){
        int pares = 0;


        for (int i = 0; i < n.length; i ++){
            if (n[i] % 2 == 0){
                pares++;
            }
        }
        return pares;
    }

}