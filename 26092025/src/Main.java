import java.util.ArrayList;
import java.util.List;

/*
Para esta atividade, vocês devem utilizar o que já vimos até agora.

Utilizando uma proposta própria de solução ou o conceito de "Grandes Ícones Históricos (Pessoas)" você deve criar seu projeto.

O projeto deve conter, pelo menos:
    3 vetores (1 para Bubble, 1 para Insertion e 1 para Selection);
    3 Ordenações vistas em cada vetor;
    e conter a alteração do vetor.
 */
public class Main {
    public static void main(String[] args) {
        //ORDENAÇÃO BUBLE
        String [] famosos = {"Taylor Swift", "Lionel Messi", "Elon Musk", "Beyoncé", "Dwayne The Rock Johnson", "Oprah Winfrey", "Cristiano Ronaldo", "Rihanna", "Barack Obama", "Greta Thunberg"};
        System.out.print("Vetor antes de ordenar: ");showarray(famosos);
        ordena_buble(famosos);
        System.out.print("Vetor depois de ordenar buble: ");showarray(famosos);

        //ORDENAÇÃO INSERTION
        int [] numeros = {1, 7, 5, 28, 4, 23, 11, 5, 4, 32};
        showarray(numeros);
        ordena_insertion(numeros);
        showarray(numeros);

        //ORDENAÇÃO SELECTION
        double [] numeros_double = {1.32, 2.63, 1.30, 0.55, 1.357, 6.54, 2.34, 4.76, 0.92};
        showarray(numeros_double);
        ordena_selection(numeros_double);
        showarray(numeros_double);


    }
    public static void ordena_buble(String []vetor){
        for(int j=vetor.length-1; j>0; j--){
            for (int i=0; i<vetor.length-1; i++){
                if (vetor[i].compareTo(vetor[i+1]) >= 0 && i < j){
                    swap(vetor, i, i+1);
                }
            }
        }
    }
    public static void ordena_insertion(int []vetor){
        for(int j=1; j<vetor.length-1; j++){
            //Primeira posição ordenada 1
            int key = vetor[j];//Chave que será alocada
            int i = j-1;
            //verifica a parte ordenada
            while (i>=0 && vetor[i]>key){
                // 3 5 5 7
                vetor[i+1] = vetor[i];
                i--;
            }
            vetor[i+1] = key;
        }
    }
    public static void ordena_selection(double []vetor){
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            //pega o menor vetor da parte não ordenada
            for (int j = vetor.length - 1; j > i; j--) {
                if(vetor[j] < vetor[menor]) {
                    menor = j;
                }
            }
            swap(vetor, i, menor);
        }
    }
    public static void swap(String [] vetor, int p1, int p2){
        String temp = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = temp;
    }
    public static void swap(double [] vetor, int p1, int p2){
        double temp = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = temp;
    }
    public static void showarray(String [] array){
        System.out.println("Array: ");
        for (String p: array){
            System.out.print(p + ", ");
        }
        System.out.println();
    }
    public static void showarray(int [] array){
        System.out.println("Array: ");
        for (int p: array){
            System.out.print(p + ", ");
        }
        System.out.println();
    }
    public static void showarray(double [] array){
        System.out.println("Array: ");
        for (double p: array){
            System.out.print(p + ", ");
        }
        System.out.println();
    }
}