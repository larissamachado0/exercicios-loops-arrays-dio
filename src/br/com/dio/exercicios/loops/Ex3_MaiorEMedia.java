package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 númerose informe o maior número e a média desses números.
Realizado atrasvés da aula sobre Estruturas de Repetição e Arrays.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;
        } while(count < 5);

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (soma/5));

    }
}
