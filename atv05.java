//ATIVIDE 8 DA FICHA DE VETORES

public class atv05{
    public static void main(String [] args){

        int[] vetor = new int[6];
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        vetor[5] = 60;
     
        for(int i = 0; i< vetor.length; i++ ){
            System.out.println("VETOR NA ORDEM CORRETA: " + vetor[i]);
        }
        System.out.println("---------------------------------");
        for(int i = vetor.length - 1; i>=0; i--){
            System.out.println("VETOR NA ORDEM INVERSA: " + vetor[i]);
        }
    }
}