




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
        String [] famosos = {"Taylor Swift", "Lionel Messi", "Elon Musk", "Beyoncé", "Dwayne The Rock Johnson", "Oprah Winfrey", "Cristiano Ronaldo", "Rihanna", "Barack Obama", "Greta Thunberg"};

    }
    public static void ordena_buble(String []vetor){
        //int j = vetor.length - 1; //valor do ultimo indice
        //fez a primeira troca
        for(int j=vetor.length-1; j>0; j--){
            for (int i=0; i<vetor.length; i++){
                if (vetor[i].compareTo(vetor[i+1]) >= 0 && i<j){
                    swap(vetor, i, i+1);
                }
            }
        }
    }
    public static void ordena_insertion(){

    }
    public static void ordena_selection(){

    }
    public static void swap(String [] vetor, int p1, int p2){
        String temp = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = temp;
    }
}