package listas.lista2.Exercicio6;
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
        System.out.println("Digite 1 para jogar o jogo da Vida.");
        System.out.println("Digite 2 para ver o baralho inteiro.");
        System.out.println("Digite 3 para ver o baralho embaralhado.");
        System.out.println("Digite 0 para sair do menu.");
        n=teclado.nextInt();

        if (n==1){
          
          System.out.println(" ");
          System.out.println("Bem vindo ao jogo da Vida.");
          System.out.println("Atenção as regras do jogo: ");
          System.out.println("Você receberá 4 cartas aleatórias do baralho.");
          System.out.println("Seu objetivo é jogar uma carta com valor maior que a carta da máquina.");
          System.out.println("As cartas seguem uma hierarquia de naipe, sendo: Ouro, Copas, Paus e Espada. ");
          System.out.println("Se a carta for do mesmo naipe, vocês empataram!");
          System.out.println("Cuidado para não jogar carta repetida, para sua maior diversão no jogo.");
          System.out.println("Serão 4 rodadas e ao final, ganha quem pontuar mais. Boa Sorte! ");
          novoBaralho.sorteia();
          novoBaralho.pontuaçao();
        }

        else if (n==2){
          System.out.println("Bônus: Conhecendo o baralho.");
          System.out.println("Aqui serão apresentadas todas as cartas do jogo:");
          novoBaralho.cartasDoJogo();
        }
        else if (n==3){
          System.out.println("Bônus: Conhecendo o baralho.");
          System.out.println("Aqui serão apresentadas todas as cartas do jogo de modo aleatório:");
          novoBaralho.embaralha();
        }
      }
    }
  }

  
        
        

