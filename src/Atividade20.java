import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        double totalSalary = 0, maxSalary = 0;
        int totalChild = 0, count = 0, countBelow380 = 0;

        while (true) {
            System.out.print("Informe o salario: ");
            double salary = input.nextDouble();

            if (salary == -1){
                break;
            }

            System.out.print("Informe o numero de filhos: ");
            int child = input.nextInt();

            totalSalary += salary;
            totalChild += child;
            count++;

            if (salary > maxSalary) {
                maxSalary = salary;
            }

            if (salary < 380) {
                countBelow380++;
            }

            double medSalary = calculate(totalSalary, count);
            double medChild = calculate(totalChild, count);
            double percentBelow380 = ((double) countBelow380 / count) * 100;

            System.out.println("Média de salário da população: " + medSalary);
            System.out.println("Média do número de filhos: " + medChild);
            System.out.println("Maior salário: " + maxSalary);
            System.out.println("Percentual de pessoas com salário inferior a R$ 380,00: " + percentBelow380 + "%");

        }

        input.close();
    }

    public static double calculate(double total, int count) {
        return total / count;
    }


}
