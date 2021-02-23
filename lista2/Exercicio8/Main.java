import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        Celular novo=new Celular();

        int escolha;
        novo.estado=true;
        novo.adicionar();
        
        while (novo.estado){
        
            System.out.println("Menu principal:");
            System.out.println("Aperte 1 para mandar mensagem. ");
            System.out.println("Aperte 2 para realizar uma ligação. ");
            System.out.println("Aperte 3 para tirar foto.");
            System.out.println("Aperte 4 para ouvir música. ");
            System.out.println("Aperte 5 para ver seu Gasto de bateria.");
            System.out.println("Aperte 0 para desligar o celular");
            escolha=teclado.nextInt();

            if (escolha==1){
                novo.mensagem();
                System.out.println(" ");
            }
            else if (escolha==2){
                novo.ligacao();
                System.out.println(" ");
            }
            else if (escolha==3){
                novo.tirarFoto();
                System.out.println(" ");
            }
            else if (escolha==4){
                novo.ouvirMusica();
                System.out.println(" ");
            }
            else if (escolha==5){
                novo.BateriaGasta();
                System.out.println(" ");
            }
            else if (escolha==0){
                novo.estado=false;
                System.out.println(" ");
            }
        }      
    }
}
    
