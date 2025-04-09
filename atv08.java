//ATIVIDADE 13 DA FICHA DE VETORES

import java.util.Scanner;

public class atv08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = input.nextInt();
        }

        int maiorValor = vetor[0];
        int posicaoMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaior = i;
            }
        }

        int menorValor = vetor[0];
        int posicaoMenor = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menorValor) {
                menorValor = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O maior valor é: " + maiorValor + " e sua posição no vetor é : " + posicaoMaior);
        System.out.println("O menor valor é: " + menorValor + " e sua posição no vetor é : " + posicaoMenor);

        input.close();
    }
}
