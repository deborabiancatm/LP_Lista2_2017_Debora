
package ordena;

public class Ordena {

    public static void main (String args []){  
         int elementos[] = {3,4,8,7,1};  
         ordem(elementos);
         System.out.println("Numeros Ordenados: ");
         for (int numero : elementos){
        	 System.out.println(numero);
         }
     }  
    public static void ordem(int elementos[]){  
        int cont1, cont2,aux;  
        for(cont1 =0; cont1<5; cont1++){  
            for(cont2 =0; cont2 <4; cont2++){  
                if(elementos[cont2]> elementos[cont2+1]){  
                    aux = elementos[cont2];  
                    elementos[cont2] = elementos[cont2+1];  
                    elementos[cont2+1] = aux;  
                }  
            }  
        }              
    }
}
