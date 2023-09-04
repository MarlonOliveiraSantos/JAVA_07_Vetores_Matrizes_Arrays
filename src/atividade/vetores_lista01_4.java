package atividade;

import java.util.Scanner;

public class vetores_lista01_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;
        double matriz[][] = new double[1][10], n1, n2, n3, n4;

        for (int c = 0; c < 10; c++) {
            System.out.println("Digite a nota 1º: ");
            n1 = ler.nextDouble();
            System.out.println("Digite a nota 2º: ");
            n2 = ler.nextDouble();
            System.out.println("Digite a nota 3º: ");
            n3 = ler.nextDouble();
            System.out.println("Digite a nota 4º: ");
            n4 = ler.nextDouble();

            double media = (n1+n2+n3+n4) / 4;
            matriz[0][c] = media;
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("Média do aluno %d: %.1f%n", (i + 1), matriz[0][i]);
        }
    }
}
