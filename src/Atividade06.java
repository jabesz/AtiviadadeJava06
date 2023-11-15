import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double altura;
        char sexo;

        System.out.print("Informe a altura: ");
        altura = input.nextDouble();

        System.out.print("Informe o sexo:");
        sexo = input.next().charAt(0);

        double pesoIdeal = calcularPeso(altura, sexo);

        System.out.printf("O peso ideal e %.1fKg", pesoIdeal);

    }

    public static double calcularPeso(double altura, char sexo){
        double pesoIdeal;

        if (sexo == 'M' || sexo == 'm'){
            pesoIdeal = 72.2 * altura - 58;
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Forneça um sexo válido ('M' para masuculino, 'F' para feminino)!!");
            return -1.0;
        }
        return pesoIdeal;
    }


}
