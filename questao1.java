
import java.util.Scanner;

public class main {
    public static void main(String[] args){
    double n1, n2, n3, n4, media, ex, media2;
    Scanner nota = new Scanner(System.in);
    System.out.println("Digite o valor das quatro notas: ");
    n1 = nota.nextFloat();
    n2 = nota.nextFloat();
    n3 = nota.nextFloat();
    n4 = nota.nextFloat();
    media = (n1+n2+n3+n4)/4;
    if (media >= 7){
        System.out.println("Aluno Aprovado " + media);
    } else {
        System.out.println("Nota de Exame Final: ");
        ex = nota.nextFloat();
        media2 = (media + ex)/2;
        if(media2 >= 5){
            System.out.println("Aluno Aprovado em Exame " + media2);
        } else {
            System.out.println("Aluno Reprovado " + media2);
        }
    }
}
            
}
