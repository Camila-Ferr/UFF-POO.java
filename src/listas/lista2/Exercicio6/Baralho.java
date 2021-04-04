package Exercicio6;
import java.util.Random;
import java.util.Scanner;
public class Baralho {
    Carta[] lista= new Carta[52];
    int indice=0;
    int[] cartas=new int[8];
    Carta[] j1= new Carta[4];
    Carta[] j2= new Carta[4];
    String[] valores=new String[13];
    String[] naipes=new String[4];

    void adicionar(Carta carta,int indice){
        lista[indice]=carta;
    }

    void valores (){
        valores[0]="as";
        valores[1]="2";
        valores[2]="3";
        valores[3]="4";
        valores[4]="5";
        valores[5]="6";
        valores[6]="7";
        valores[7]="8";
        valores[8]="9";
        valores[9]="10";
        valores[10]="J";
        valores[11]="Q";
        valores[12]="K";
        naipes[0]="Ouro";
        naipes[1]="Copas";
        naipes[2]="Paus";
        naipes[3]="Espada";
    
        int cont=0;

        for (int b=0; b<=3;b++){
            for (int a=0; a<=12; a++){
                lista[cont].valor=valores[a];
                lista[cont].naipe=naipes[b];
                cont=cont+1;
            }
        }   
    }
    void printar (int tamanho){
        System.out.println(" ");
        System.out.println("Seu jogo:");
        for (int a=0; a<=tamanho; a++){
            System.out.println("");
            System.out.println("Carta" +(a+1) +": ");
            System.out.println(j1[a].valor +" de " +j1[a].naipe);
        }
    }
    void sorteia (){
        int carta,a;
        Random gerador = new Random();
        for (a=0; a<8; a++){
          carta=gerador.nextInt((52));
          cartas[a]=carta;
        }
        compara();
        for (a=0; a<4; a++){
            j1[a]=lista[cartas[a]];
            j1[a].naipe=lista[cartas[a]].naipe;
            j1[a].valor=lista[cartas[a]].valor;
            j2[a]=lista[cartas[a+4]];
            j2[a].naipe=lista[cartas[a+4]].naipe;
            j2[a].valor=lista[cartas[a+4]].valor;
        }


        printar(3);
    }

    void compara (){
        Random gerador = new Random();
        int n=0;
        for (int a=0; a<8; a++){
            n=0;
            for (int b=0; b<8; b++){
                if (cartas[a]==cartas[b]){
                    n=n+1;
                    if (n==2){
                    cartas[a]=gerador.nextInt((52));
                    }
                }
            }
        }
        if ((n>2)){
            compara();
        }
        }
    int rodada( int tamanho){
        System.out.println("Digite o número da carta que você quer jogar (de 1 á 4):");
        int n,va, vb;
        va=0;
        vb=0;
        int a;
        Scanner teclado =new Scanner (System.in);
        n=teclado.nextInt();
        System.out.println("Seu oponente jogou " +j2[n-1].valor +" de " +j2[n-1].naipe);
        for (a=0; a<=3; a++){
            for (int b=0; b<=3; b++){
                if (j1[n-1].naipe==naipes[b]) {
                    va=b;
                }
                if (j2[n-1].naipe==naipes[b]){
                    vb=b;
                }
            }
        }
    if (va<vb){
        return 1;
    }
    else if (vb<va){
        return 2;
    }
    return 0;
}
void pontuaçao (){
    int p1=0;
    int p2=0;
    int tamanho=0;
    int parada=0;
    while (parada!=4){
        int vitoria= rodada(tamanho);
        
        if (vitoria==1){
            System.out.println("Você ganhou a rodada!");
            p1=p1+1;
        }
        else if (vitoria==2){
            System.out.println("Você perdeu a rodada!");
            p2=p2+1;
        }
        else if (vitoria==0){
            System.out.println("Empate!");
        }
        else {
            tamanho=tamanho+1;
            parada=parada-1;
        }
        System.out.println(" ");
        parada=parada+1;
    }
    if (p1>p2){
        System.out.println("Você ganhou o jogo!");
    }
    else if (p2>p1){
        System.out.println("Você perdeu o jogo!");
    }
    else{
        System.out.println(" O jogo empatou!");
    }
    }
    
    void cartasDoJogo (){
        for (int a=0; a<52; a++){
            System.out.println("");
            System.out.println(lista[a].valor +" de " +lista[a].naipe );
        }
    }
    void embaralha(){
        boolean [] ver=new boolean[52];
        Random gerador = new Random();
        int tamanho,carta;
        tamanho=0;
        for (int a=0; a<52; a++){
            ver[a]=true;

        }
        while (tamanho!=52){
            carta=gerador.nextInt((52));
            if (ver[carta]){
                ver[carta]=false;
                tamanho=tamanho+1;
                System.out.println(lista[carta].valor +" de " +lista[carta].naipe );
                System.out.println("");;
            }


        }
    }
  
}
        
