//ATIVIDADE 10 DA FICHA DE VETORES

import java.util.Scanner;

public class atv06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetorNotas = new double[15];

        for (int i = 0; i < vetorNotas.length; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
            vetorNotas[i] = input.nextDouble();
        }
        double somaDasNotas = 0;
        for (int i = 0; i < vetorNotas.length; i++) {
            somaDasNotas += vetorNotas[i];
        }
        double mediaDaTurma = somaDasNotas / 15;
        System.out.println("A media da geral da turma é: " + mediaDaTurma);
        input.close();
    }
}
