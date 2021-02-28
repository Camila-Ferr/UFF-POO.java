package Exercicio8;
import java.util.Random;
import java.util.Scanner;

public class Celular {  
    boolean estado;
    Bateria nova= new Bateria();

    void adicionar (){
        nova.carga=100;
        nova.limite=100;
        nova.tamanho=0;
    }

    void mensagem (){
        verificarBateria();
        Scanner teclado =new Scanner (System.in);
        String mensagem,numero;
        System.out.println("Escreva a mensagem");
        mensagem=teclado.nextLine();
        System.out.println("Nome ou número do destinatário:");
        mensagem=teclado.nextLine();
        nova.carga=nova.carga-1;
        nova.usado[nova.tamanho]="Mensagem";
        nova.tamanho=nova.tamanho+1;
        verificarBateria();
    }
    
    void ligacao (){
        verificarBateria();
        Scanner teclado =new Scanner (System.in);
        Random gerador = new Random();
        String numero;
        int tempo;
        System.out.println("Digite o número ou nome do contato");
        numero=teclado.next();
        tempo=gerador.nextInt(300);
        nova.carga=(nova.carga-(tempo/5));
        System.out.println("Sua ligação levou " +tempo +"segundos.");
        nova.usado[nova.tamanho]="Ligação" ;
        nova.tamanho=nova.tamanho+1;
        verificarBateria();
    }

    void tirarFoto (){
        System.out.println("Diga X");
        verificarBateria();
        nova.carga=nova.carga-1;
        nova.usado[nova.tamanho]="Câmera" ;
        nova.tamanho=nova.tamanho+1;
        verificarBateria();
    }

    void ouvirMusica (){
        Scanner teclado =new Scanner (System.in);
        String musica;
        int n;
        n=1;

        verificarBateria();

        System.out.println("Digite a música desejada:");
        musica=teclado.nextLine();
        
        System.out.println("Tocando agora " +musica +"...");
        nova.usado[nova.tamanho]="Música" ;
        nova.tamanho=nova.tamanho+1;
        nova.carga=nova.carga-2;

        System.out.println("Para ouvir outra digite 1.");
        System.out.println("Para voltar ao menu, aperte 0");
        n=teclado.nextInt();
        verificarBateria();
        if (n==1){
            ouvirMusica();
        }
    }
    
    void verificarBateria(){
        if (nova.carga<=0){
            System.out.println("Desligando celular");
            estado=false;
        }
    }
    void BateriaGasta(){
        int a;
        verificarBateria();
        System.out.println("Nível de bateria " +nova.carga +"%.");
        for (a=0; a<nova.tamanho; a++){
            System.out.println(nova.usado[a]);
        }
    }
}
