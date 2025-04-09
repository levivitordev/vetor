//ATIVIDADE 38 DA FICHA DE VETORES

import java.util.Arrays;
import java.util.Scanner;

public class atv10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "° numero: ");
            vetor[i] = input.nextInt();
        }
        System.out.println("--------------------------------");
        Arrays.sort(vetor);

        System.out.println("ORDEM CRESCENTE: ");
        for (int valor : vetor) {
            System.out.println(valor + " ");
        }
        input.close();
    }
}
