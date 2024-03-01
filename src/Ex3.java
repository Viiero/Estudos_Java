//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Ex3 {

    public static void exercicio() {

        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();

        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();

        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();

        diferenca = A * B - C * D;

        System.out.printf("Diferença: " + diferenca);

    }

}
