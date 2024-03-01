//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio^2
//Considere o valor de π = 3.14159

import java.util.Scanner;
import java.util.Locale;

public class Ex2 {

    public static void exercicio() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area, pi = 3.14159;

        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();

        area = pi * raio * raio;

        System.out.printf("A área do círculo é: %.4f%n", area);

        sc.close();
    }

}
