package Ex3Ex6Lista3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner teclado =new Scanner (System.in);
       Baralho novoBaralho=new Baralho();
       int indice=0;
       int n;
       n=1;

      for (int a=0; a<52; a++){
         Carta carta=new Carta();
         novoBaralho.adicionar(carta,indice);
         indice=indice+1;
      }
      novoBaralho.valores();
      while (n!=0){
        System.out.println("Digite 1 para ver o baralho inteiro.");
        System.out.println("Digite 2 para ver o baralho embaralhado.");
        System.out.println("Digite 0 para sair do menu.");
        n=teclado.nextInt();

        if (n==1){
          System.out.println("Aqui serão apresentadas todas as cartas do jogo:");
          novoBaralho.cartasDoJogo();
        }
        else if (n==2){
          System.out.println("Aqui serão apresentadas todas as cartas do jogo de modo aleatório:");
          novoBaralho.embaralha();
        }
      }
    }
  }

  
        
        

