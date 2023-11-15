import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int num, count = 0;

        System.out.print("Informe um numero inteiro positivo maior que 100: ");
        num = input.nextInt();

        while(count < 3){
            if (primo(num)){
                System.out.println(num);
                count++;
            }

            num++;
        }

        input.close();
    }

    public static boolean primo(int num){

        if (num <= 1){
            return false;
        }

        for (int i = 2; i < Math.sqrt(num); i++){

            if (num % i == 0){
                return false;
            }

        }

        return true;
    }

}
