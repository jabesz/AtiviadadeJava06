import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        var input  = new Scanner(System.in);
        double raio;

        System.out.print("Informe o valor do raio: ");
        raio = input.nextInt();

        double volume = calcularVolume(raio);

        System.out.printf("O volume da esfera com o raio %.1f é %.1f",raio, volume);

    }

    public static double calcularVolume(double raio){
        if (raio < 0){
            System.out.println("Informe um numero positivo");
            return -1;
        }

        double volume = (4/ 3) * Math.PI * Math.pow(raio, 3);
        return volume;
    }

}
