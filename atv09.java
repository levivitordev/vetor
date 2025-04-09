//ATIVIDADE 17 DA FICHA DE VETORES

import java.util.Scanner;

public class atv09 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + " número: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                vetor[i] = 0;
            }
        }

        System.out.println("VALOR NEGATIVO SUBSTITUÍDO:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "  ");
        }
       input.close();
    }
}
