import java.util.Scanner;
public class exercicio1{
    public static void main (String [] args){
        
        Scanner teclado =new Scanner (System.in);
        int n, inteiro, cont;
        cont=0;
        n=teclado.nextInt();
        
        for (int a=1; a<=n; a++){
            inteiro=teclado.nextInt();
            
            if (inteiro<0){
                cont=cont+1;
            }
        }
        System.out.println("Valores negativos= " +cont );

    }
}