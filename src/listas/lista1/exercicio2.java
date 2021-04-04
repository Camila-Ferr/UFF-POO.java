package listas.lista1;

import java.util.Scanner;
public class exercicio2{
    public static void main (String [] args){
        Scanner teclado =new Scanner (System.in);
        float R,S,T,maior;
        
        System.out.println("Insira R, S e T:");
        R=teclado.nextFloat();
        S=teclado.nextFloat();
        T=teclado.nextFloat();

            if ((R==S) && (R==T) && (S==T)){
                System.out.println("Os três são iguais.");
            }
            else{

                if ((R>=S) && (R>=T)){
                    maior=R;
                } 
            
                else if ((S>=R)&& (S>=T)){
                    maior=S; 
                } 
            
                else {
                    maior=T;;
                }
            System.out.println("O maior é " +maior );
            }
    }
}