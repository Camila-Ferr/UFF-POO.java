import java.util.Scanner;
import java.util.Random;

public class Televisao {
    Controle controle= new Controle();
    void adicionar (){
        controle.estado=false;
        controle.silenciar=false;
        controle.canal=0;
        controle.volume=0;
    }

    void mudarEstado (){
        controle.estado=! controle.estado;
    }

    void mudarCanal (){
        Scanner teclado =new Scanner (System.in);
        int n,p;
        System.out.println("Digite 1 para ir para o próximo canal."); 
        System.out.println("Digite 2 para ir para voltar ao canal anterior.");
        System.out.println("Digite 3 para um canal específico.");
        System.out.println("");
        n=teclado.nextInt();

        if (n==1){
            if (controle.canal==99){
                controle.canal=0;
            }
            else{
                controle.canal= (controle.canal+1);
            }
        }
        else if (n==2){
            if (controle.canal==0){
                controle.canal=99;
            }
            else {
                controle.canal=(controle.canal-1);
            }
        }
        else if (n==3){
            System.out.println("Aperte o número do canal desejado:");
            p=teclado.nextInt();
            if ((p<0)||(p>99)){
                System.out.println("Erro 1998. Esse canal não existe.");
            }
            else{
                controle.canal=p;
            }

        }
    }
    void mudarVolume (){
        Scanner teclado =new Scanner (System.in);
        int n;
        System.out.println("Digite 1 para aumentar o volume."); 
        System.out.println("Digite 2 para diminuir o volume.");
        System.out.println("Digite 3 para silenciar ou dessilênciar a TV.");
        System.out.println("");
        n=teclado.nextInt();
        
        if (n==1){
            if (controle.volume==10){
                System.out.println("Volume máximo atingido.");
            }
            else {
                controle.volume=controle.volume+1;
            }
        }
        else if (n==2){
            if (controle.volume==0){
                System.out.println("Volume mínimo atingido.");
            }
            else {
                controle.volume=controle.volume-1;
            }
        }
        else if (n==3){
            controle.silenciar=! controle.silenciar;
            if (controle.silenciar){
                controle.volume=0;
            }

        }
    }
    void printar (){
        int prog;
        Random gerador = new Random();
        if (controle.estado){
            
            System.out.println ("Canal: " +controle.canal);
            prog=gerador.nextInt((6));
            
            if (prog==1){
                System.out.println("Television Premium: Clássicos Disney.");
            }
            else if (prog==2){
                System.out.println("Maratona Bruxa: Seja bem vindo a magia.");
            }
            else if (prog==3){
                System.out.println("Nina conhece o mundo: Aprendendo e se divertindo.");
            }
            else if (prog==4){
                System.out.println("A casa mais vigiada do país: GGG."); 
            }
            else if (prog==5){
                System.out.println("Roda de conversa: Os paradigmas da sociedade brasileira."); 
            }
            else if (prog==0){
                System.out.println("Na trave do Gol");
            }
            
            if (controle.silenciar==false){
                System.out.println("Volume: "+controle.volume);
            }
            else {
                System.out.println("Modo silenciar ativado");
            }
        }
        else {
            System.out.println("Desligada.");
        }
        System.out.println(" ");
        
    }
}


