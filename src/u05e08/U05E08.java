
package u05e08;

import java.util.Scanner;

public class U05E08 {

    public static void main(String args[]) {
        Scanner entrada=new Scanner(System.in);
        int num1;
        char symbol;
        System.out.print("Ingrese un simbolo: ");
        symbol=entrada.next().charAt(0);
        System.out.print("Ingrese la cantidad de veces que quiere que se repita el simbolo ingresado: ");
        num1=entrada.nextInt();
        imprimirSimbolo(num1, symbol);
    }
    static void imprimirSimbolo (int a, char b){
        int i;
        for(i=1; i<=a; i++){
            System.out.print(b);
        }
    }
}