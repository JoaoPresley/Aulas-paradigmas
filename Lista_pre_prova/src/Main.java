import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa Gilberto = new Pessoa("Gilberto", 50);
        Aluno Joao = new Aluno("Joao", 23, "CC");
        Gato Garfield = new Gato();
        Cachorro Bidu = new Cachorro();

        Gilberto.apresentar();
        Joao.apresentar();
        Garfield.falar();
        Bidu.falar();
        System.out.println("---------");

        //Exercicio 8
        int cons = 5;
        int numeros [] = new int[cons];

        //Coleta os 100 numeros
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<cons; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Vetor sem ordenação: ");
        showarray(numeros);


        //ordena o vetor
        for (int i = 0; i < numeros.length; i++){
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++){
                if (numeros[j] < numeros[i]){
                    menor = j;
                }
            }
            swap(numeros, menor, i);
        }

        System.out.println("Vetor com ordenação: ");
        showarray(numeros);

    }
    public static void showarray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void swap(int []array, int index_a, int index_b){
        int temp = array[index_a];
        array[index_a] = array[index_b];
        array[index_b] = temp;
    }
}