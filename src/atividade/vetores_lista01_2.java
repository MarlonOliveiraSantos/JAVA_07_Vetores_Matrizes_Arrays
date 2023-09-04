package atividade;

import java.util.Scanner;
public class vetores_lista01_2 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vetor[] = {2,5,1,3,4,9,7,8,10,6}, impar = 0, par = 0,media;
        double soma = 0;
        String indiceImpares = "", indicePares =" ";

        for(int c = 1; c < vetor.length; c += 2){
            indiceImpares += vetor[c] + " ";
        }
        for(int c = 0; c < vetor.length; c ++){
            if (vetor[c] % 2 == 0) {
                indicePares += vetor[c] + " ";
            }
            soma = soma + vetor[c];
        }
        System.out.println("Elementos nos índices ímpares: " + indiceImpares);
        System.out.println("Elementos nos índices pares: " + indicePares);
        System.out.println("Soma: "+ soma);
        System.out.printf("Média: %.2f", soma/vetor.length);
    }
}
