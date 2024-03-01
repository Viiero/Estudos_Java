//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;

public class Ex1 {

    public static void exercicio() {

        Scanner sc = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.println("Soma: " + soma);

        sc.close();

    }

}
