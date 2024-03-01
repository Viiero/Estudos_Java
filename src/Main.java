//Função Main para escolher qual Ex realizar

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual exercício executar (Escolher um número entre 1-6)? ");
        int numero = sc.nextInt();

        switch(numero){
            case 1:
                Ex1.exercicio();
                break;
            case 2:
                Ex2.exercicio();
                break;
            case 3:
                Ex3.exercicio();
                break;
            case 4:
                Ex4.exercicio();
                break;
            case 5:
                Ex5.exercicio();
                break;
            case 6:
                Ex6.exercicio();
                break;
            default:
                System.out.println("Opção Inválida");
        }

        sc.close();
    }
}