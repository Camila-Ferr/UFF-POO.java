package Ex3Ex5Lista3;
import java.util.Scanner;
import java.util.Random;

public class Televisao {
    Controle controle= new Controle(false,false,0,0);
    

    void mudarEstado (){
        controle.setEstado();
    }

    void mudarCanal (){
        Scanner teclado =new Scanner (System.in);
        int n,p,canal;
        System.out.println("Digite 1 para ir para o próximo canal."); 
        System.out.println("Digite 2 para ir para voltar ao canal anterior.");
        System.out.println("Digite 3 para um canal específico.");
        System.out.println("");
        n=teclado.nextInt();
        canal=controle.getCanal();
        if (n==1){
            if (canal==99){
                controle.setCanal(0);
            }
            else{
                controle.setCanal(canal+1);
            }
        }
        else if (n==2){
            if (canal==0){
                controle.setCanal(99);
            }
            else {
                controle.setCanal(canal-1);
            }
        }
        else if (n==3){
            System.out.println("Aperte o número do canal desejado:");
            p=teclado.nextInt();
            if ((p<0)||(p>99)){
                System.out.println("Erro 1998. Esse canal não existe.");
            }
            else{
                controle.setCanal(p);
            }

        }
    }
    void mudarVolume (){
        Scanner teclado =new Scanner (System.in);
        int n,volume;
        Boolean silencio;
        System.out.println("Digite 1 para aumentar o volume."); 
        System.out.println("Digite 2 para diminuir o volume.");
        System.out.println("Digite 3 para silenciar ou dessilênciar a TV.");
        System.out.println("");
        n=teclado.nextInt();
        volume=controle.getVolume();
        
        if (n==1){
            if (controle.getVolume()==10){
                System.out.println("Volume máximo atingido.");
            }
            else {
                controle.setVolume(volume+1);
            }
        }
        else if (n==2){
            if (controle.getVolume()==0){
                System.out.println("Volume mínimo atingido.");
            }
            else {
                controle.setVolume(volume-1);
            }
        }
        else if (n==3){
            controle.setSilenciar();
            silencio=controle.getSilenciar();
            if (silencio){
                controle.setVolume(0);
            }

        }
    }
    void printar (){
        int prog;
        Random gerador = new Random();
        if (controle.getEstado()){
            
            System.out.println ("Canal: " +controle.getCanal());
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
            
            if (controle.getSilenciar()==false){
                System.out.println("Volume: "+controle.getVolume());
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


