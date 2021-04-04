package Ex3Ex8Lista3;
import java.util.Random;
import java.util.Scanner;

public class Celular {  
    private boolean estado=true;
    Bateria nova= new Bateria();
    
    public boolean getEstado() {
        return this.estado;
    }

    void setEstadoCel() {
        this.estado = !estado;
    }

    void mensagem (){
        verificarBateria();
        Scanner teclado =new Scanner (System.in);
        String mensagem,numero;
        System.out.println("Escreva a mensagem");
        mensagem=teclado.nextLine();
        System.out.println("Nome ou número do destinatário:");
        mensagem=teclado.nextLine();
        nova.setCarga(1);
        nova.setUsado("Mensagem");
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
        nova.setCarga(tempo/5);
        System.out.println("Sua ligação levou " +tempo +"segundos.");
        nova.setUsado("Ligação");
        verificarBateria();
    }

    void tirarFoto (){
        System.out.println("Diga X");
        verificarBateria();
        nova.setCarga(1);
        nova.setUsado("Câmera");
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
        nova.setUsado("Música");
        nova.setCarga(2);

        System.out.println("Para ouvir outra digite 1.");
        System.out.println("Para voltar ao menu, aperte 0");
        n=teclado.nextInt();
        verificarBateria();
        if (n==1){
            ouvirMusica();
        }
    }
    
    void verificarBateria(){
        if (nova.getCarga()<=0){
            System.out.println("Desligando celular");
            estado=false;
        }
    }
    void BateriaGasta(){
        int a;
        verificarBateria();
        System.out.println("Nível de bateria " +nova.getCarga() +"%.");
        for (a=0; a<nova.getTamanho(); a++){
            System.out.println(nova.getUsado(a));
        }
    }
}
