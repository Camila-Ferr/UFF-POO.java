package listas.lista3.Exercicio3.Exercicio6.Ex3Ex6Lista3;
import java.util.Random;
public class Baralho {
    private Carta[] lista= new Carta[52];
    private String[] valores=new String[13];
    private String[] naipes=new String[4];

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
                lista[cont].setValor(valores[a]);
                lista[cont].setNaipe(naipes[b]);
                cont=cont+1;
            }
        }   
    }
    void cartasDoJogo (){
        for (int a=0; a<52; a++){
            System.out.println("");
            System.out.println(lista[a].getValor() +" de " +lista[a].getNaipe() );
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
                System.out.println(lista[carta].getValor() +" de " +lista[carta].getNaipe() );
                System.out.println("");;
            }


        }
    }
  
}
        
