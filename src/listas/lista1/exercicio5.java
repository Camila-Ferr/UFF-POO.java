package listas.lista1;

import java.util.Scanner;
public class exercicio5 {
    public static void main (String [] args){
        System.out.println("Insira o número:");
        Scanner teclado =new Scanner (System.in);
        
        int N,soma; 
        N=teclado.nextInt();
        soma=1;

        if (N<0){
            System.out.println("Não foi possível continuar a operação");
            System.out.println("-1");
        }
        else if (N>0){
            for (int a=1; a<=N; a++){
                soma = soma*a;
        }
        System.out.println("O fatorial de " +N +" é " +soma);
    }
        
        else {
            soma=1;
            System.out.println("O fatorial de " +N +" é " +soma);
        }
    }
}