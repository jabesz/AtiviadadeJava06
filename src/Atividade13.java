import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        int numHabitantes = 15;

        int [] idades = new int[numHabitantes];
        int [] numFilhos = new int[numHabitantes];
        char [] sexos = new char[numHabitantes];
        double [] salarios = new double[numHabitantes];

        for (int i = 0; i < numHabitantes; i++){
            System.out.print("Informe a idade do " + (i + 1) + "º habitante: ");
            idades[i] = input.nextInt();

            System.out.print("Informe o sexo do "  + (i + 1) + "º habitante: ");
            sexos[i] = input.next().charAt(0);

            System.out.print("Informe o salario do "  + (i + 1) + "º habitante: ");
            salarios[i] = input.nextDouble();

            System.out.print("Informe o numero de filhos do "  + (i + 1) + "º habitante: ");
            numFilhos[i] = input.nextInt();
            input.nextLine();
        }

            double medSalario = mediaSalario(salarios);
            int menIdade = menorIdade(idades);
            int marIdade = maiorIdade(idades);
            int mulheres = mulher3Filho500(sexos, salarios, numFilhos);

            System.out.printf("A media dos salarios e: %.2f \n",medSalario);
            System.out.printf("A menor idade entre os habitantes e: %d \n",menIdade);
            System.out.printf("A maior idade entre os habitantes e: %d \n",marIdade);
            System.out.printf("Mulheres com tres filhos que recebem até R$ 500: %d \n",mulheres);


        input.close();
    }

    public static double mediaSalario(double[] salarios){
        double form = 0;

            for (double salario : salarios){
                form += salario;
            }

            return form / salarios.length;
    }

    public static int menorIdade(int[] idades){
        int menor = idades[0];

        for (int idade : idades){
            if (idade < menor) {
                menor = idade;
            }
        }

        return menor;
    }

    public static int maiorIdade(int[] idades){
        int maior = idades[0];

        for (int idade : idades){
            if (idade > maior) {
                maior = idade;
            }
        }

        return maior;
    }

    public static int mulher3Filho500(char[] sexos, double[] salarios, int[] numFilhos){
           int cont = 0;

            for (int i = 0; i < sexos.length; i++){
                if (sexos[i] == 'F' && salarios[i]  <= 500.00 && numFilhos[i] == 3){
                    cont++;
                }
            }

            return cont;
    }

}
