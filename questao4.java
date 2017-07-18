package minmax;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor: ");
        int n = scan.nextInt();
        int i;
        int[] vec = new int[n];
        System.out.println("insira os valores: ");
        for(i = 0; i < n; i++){
            vec[i] = scan.nextInt();
        }
        minmax(vec, n);
    }
    public static void minmax (int vec[], int n){
            int min = vec[0];
            int max = vec[0];
            int i;
            
            for(i = 1; i < n; i++){
                if (vec[i] < min){
                    min = vec[i];
                }
                if (vec[i] > max){
                    max = vec[i];
                }
            }
            System.out.printf("maior: %s %n"
                    + "menor: %s %n", max, min);
        }
    
}
