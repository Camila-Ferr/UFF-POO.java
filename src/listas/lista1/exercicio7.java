package listas.lista1;

import java.util.Scanner;
public class exercicio7 {
    public static void main (String [] args){
        Scanner teclado =new Scanner (System.in);

        float cont,pessimas,ruins,boas,otimas,nota;
        boolean parada=false;
        cont=0;
        pessimas=0;
        ruins=0;
        boas=0;
        otimas= 0;
        
        System.out.println( "Escreva as notas:" );   

        while (parada==false){
            nota=teclado.nextInt();
            if (nota>=0 && nota<=100){

                if (nota>=0 && nota<=25){
                    pessimas=pessimas+1;
                }
                else if (nota>25 && nota<=50){
                    ruins=ruins+1;
                }
                else if (nota>50 && nota<=75){
                    boas=boas+1;
                }
                else {
                    otimas=otimas+1;
                }
                cont=cont+1;
            }
            else{
                parada=true;
            }
    }
    System.out.println("Péssimas = " +((100*pessimas)/(cont)) +"%");
    System.out.println("Ruins = " +((100*ruins)/(cont)) +"%");
    System.out.println("Boas = " +((100*boas)/(cont)) +"%");
    System.out.println("Ótimas = " +((100*otimas)/(cont)) +"%");
}
}
