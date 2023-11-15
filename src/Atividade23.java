import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        double a, b, c;

        System.out.print("Informe o comprimento do primeiro lado: ");
        a = input.nextDouble();

        System.out.print("Informe o comprimento do segundo lado: ");
        b = input.nextDouble();

        System.out.print("Informe o comprimento do terceiro lado: ");
        c = input.nextDouble();

        if (triangulo(a, b, c)) {
            System.out.println("Os lados informados formam um triangulo: " +type(a, b, c));

        } else {
            System.out.println("Os lados informados não formam um triângulo.");
        }

    }

    public static boolean triangulo(double a, double b, double c) {
        return a < b + c && b < a + c && c < a + b;

    }

    public static String type(double a, double b, double c){
        if (a == b && b == c) {
            return "Equilatero";

        } else if (a == b || b == c || c == a) {
            return "Isosceles";

        } else {
            return "Escaleno";

        }
    }


}
