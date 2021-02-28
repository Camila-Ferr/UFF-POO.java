package Exercicio2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        boolean n;
        int p;
        n=true;
        System.out.println("Adicione uma nova pessoa");
        
        Pessoa um= new Pessoa ();
        System.out.println("Nome :");
        um.nome=teclado.next();
        System.out.println("Idade :");
        um.idade=teclado.nextInt();
        while (n){
            System.out.println("Digite 1 para adicionar um ano de vida");
            System.out.println("Digite 2 para diminuir um ano de vida");
            System.out.println("Digite 3 para saber quantos anos a pessoa tem");
            System.out.println("Digite 0 para finalizar o sistema.");
            p=teclado.nextInt();
            if (p==1){
                um.idade=(um.idade+1);
            }
            else if (p==2){
                um.idade=(um.idade-1);
            }
            else if (p==3){
                System.out.println("Nome da pessoa=" +um.nome);
                System.out.println("Idade=" +um.idade);
                if (um.idade<0){
                    System.out.println("Confira a idade correta.");

                }
            }
            else if (p==0){
                n=false;
            }
        }   
    }
}
