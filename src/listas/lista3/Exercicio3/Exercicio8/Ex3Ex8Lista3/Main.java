package listas.lista3.Exercicio3.Exercicio8.Ex3Ex8Lista3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        Celular novo=new Celular();

        int escolha;
        
        while (novo.getEstado()){
        
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
                novo.setEstadoCel();
                System.out.println(" ");
            }
        }      
    }
}
    
