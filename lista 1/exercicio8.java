import java.util.Scanner;
public class exercicio8 {
    public static void main (String [] args){
        
        Scanner teclado =new Scanner (System.in);
        int n,soma,fixo,soma2;
        System.out.println( "Qual é a ordem da matriz?" );  
        n=teclado.nextInt();
        int [][] matriz = new int [n][n];
        boolean magica=true;
        
        soma=0;
        fixo=0;
        soma2=0;

        for (int a=0; a<n; a++){
            System.out.println( "Insira a " +(a+1) +" linha da matriz:" ); 
            for (int b=0; b<n; b++){
                matriz[a][b]=teclado.nextInt();
            }
        }
        for (int a=0; a<n; a++){
            soma=soma+matriz[a][a];
            soma2=soma2+matriz [a][(n-1)-a];
        }
        if (soma==soma2){
            fixo=soma;;
        }
        else{
            magica=false;
        }
        
        
        for (int a=0; a<n; a++){
            
            if ((soma!=fixo) && (soma2!=fixo)){
                magica=false;
                break;
            }
            
            else if ((soma==fixo) && (soma2==fixo)) {
                soma=0;
                soma2=0;
            }
            
            for (int b=0; b<n; b++){
                soma=matriz[a][b]+soma;
                soma2=matriz[b][a]+soma2;
            }
        }
        if (magica){
            System.out.println( "É um quadrado mágico." ); 
        }
        else {
            System.out.println( "Não é um quadrado mágico." );
        }
    }
}
