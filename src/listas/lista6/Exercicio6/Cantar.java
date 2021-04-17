package listas.lista6.Exercicio6;

import java.util.Scanner;

public class Cantar {
    public static void main(String[] args) {
        Karaoke karaoke = new Karaoke();
        Scanner teclado = new Scanner(System.in);
        int n,musica;
        n = 1;
        System.out.println("Bem vindo ao Karaoke :");
        while (n != 0) {

            System.out.println("Digite 1 para adicionar uma música na fila.");
            System.out.println("Digite 2 para ver o catálogo em ordem alfabetica pelo nome da música.");
            System.out.println("Digite 3 para ver o catálogo em ordem alfabetica pelo nome do cantor.");
            System.out.println("Digite 4 para ver o que está tocando no momento.");
            System.out.println("Digite 0 para sair.");
            System.out.println("");
            n = teclado.nextInt();

            if (n==1){
                karaoke.getCatalogo();
                System.out.println("Digite o número da música desejada: ");
                musica=teclado.nextInt();
                karaoke.addFila(musica);
                System.out.println("");
            }
            if (n==2){
                karaoke.alfabetica();
            }
            if (n==3){
                karaoke.porArtista();
            }

            if (n==4){
                karaoke.tocandoAgora();
            }
        }
    }
}
