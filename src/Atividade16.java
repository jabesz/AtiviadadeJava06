import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int[] number = new int[20];

        System.out.println("Informe 20 valores: ");
        for (int i = 0; i < 20; i++){
            System.out.print("Informe o " +(i + 1)+ "° numero: ");
            number[i] = input.nextInt();
        }

        int valorSoma= soma(number);
        System.out.printf("O valor da soma dos valores dos vetores e: %d",valorSoma);
    }

    public static int soma(int[] number){
        int soma = 0;

        for (int i = 0; i < number.length; i++){
            soma += number[i];
        }
        return soma;
    }

}
