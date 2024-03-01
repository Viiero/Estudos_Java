//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

    public static void exercicio() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double A, B, C, areaTR, areaC, areaT, areaQ, areaR, pi = 3.14159;

        System.out.println("Insira os valores de A, B e C:");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        areaTR = (A * C) / 2;
        areaC = pi * C * C;
        areaT = (A + B) * C / 2;
        areaQ = B * B;
        areaR = A * B;

        System.out.printf("Área do triângulo retângulo: R$%.3f%n", areaTR);
        System.out.printf("Área do círculo: R$%.3f%n", areaC);
        System.out.printf("Área do trapézio: R$%.3f%n", areaT);
        System.out.printf("Área do quadrado: R$%.3f%n", areaQ);
        System.out.printf("Área do retângulo: R$%.3f%n", areaR);

        sc.close();
    }

}