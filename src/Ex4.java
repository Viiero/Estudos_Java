//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

    public static void exercicio() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valor, salario;

        System.out.println("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor por hora: ");
        valor = sc.nextDouble();

        salario = horasTrabalhadas * valor;

        System.out.println("Número do funcionário: " + numeroFuncionario);
        System.out.printf("Salário: R$%.2f%n", salario);

    }

}
