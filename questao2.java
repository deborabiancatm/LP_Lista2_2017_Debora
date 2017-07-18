
package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int n;
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um número: ");
        n = numero.nextInt();
        if ((n%2) == 0){
            System.out.println("O valor " + n + " é Par.");
        } else {
            System.out.println("O valor " + n + " é Impar.");
        }
    }
    
}
