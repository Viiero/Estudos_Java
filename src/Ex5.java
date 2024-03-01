//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

    public static void exercicio() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int c1, n1, c2, n2;
        double v1, v2, vt;

        System.out.println("Código da peça 1:");
        c1 = sc.nextInt();

        System.out.println("Quantia de peças 1:");
        n1 = sc.nextInt();

        System.out.println("Valor unitário da peça 1:");
        v1 = sc.nextDouble();

        System.out.println("Código da peça 2:");
        c2 = sc.nextInt();

        System.out.println("Quantia de peças 2:");
        n2 = sc.nextInt();

        System.out.println("Valor unitário da peça 2:");
        v2 = sc.nextDouble();

        vt = (n1 * v1) + (n2 * v2);

        System.out.printf("Valor a pagar: R$%.2f%n", vt);

        sc.close();
    }

}