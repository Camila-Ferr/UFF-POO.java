package listas.lista7.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner teclado= new Scanner(System.in);
        int n;

        System.out.println("Digite o número desejado :");
        n=teclado.nextInt();

        primo t1 = new primo(n/2,1,1);
        primo t2 = new primo(n,n/2+1,2);
        t1.start();
        t2.start();
        t2.join();

    }
}
