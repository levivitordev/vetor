//ATIVIDADE 1 DA FICHA DE VETORES

public class atv07 {
    public static void main(String[] args) {
        int[] A = new int[6];

        A[0] = 1;
        A[1] = 0;
        A[2] = 5;
        A[3] = -2;
        A[4] = -5;
        A[5] = 7;

        int somaDosVetores = A[0] + A[1] + A[5];
        System.out.println("A soma deste vetores sao: " + somaDosVetores);

        A[4] = 100;

        for (int i = 0; i < A.length; i++) {
            System.out.println("VETOR DE POSIÇÃO " + i + ": " + A[i]);
        }
    }
}
