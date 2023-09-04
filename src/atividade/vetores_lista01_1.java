package atividade;

import java.util.Scanner;

public class vetores_lista01_1 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int vetor[] = {2,5,1,3,4,9,7,8,10,6}, n;
        boolean achou = false;

        System.out.println("Digite o número que você deseja encontrar:");
        n = ler.nextInt();

        for(int i = 0; i < vetor.length; i++){
            int resul = vetor[i];
            if (resul == n) {
                System.out.println("O número " + n + " está localizado na posição: " + i);
                achou = true;
            }
        }
        if (achou == false){
            System.out.println("O número " + n + " não foi encontrado!");
        }
    }
}
