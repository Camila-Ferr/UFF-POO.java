package Ex2Ex3Lista3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        boolean n;
        int p,idade;
        String nome;
        n=true;
        System.out.println("Adicione uma nova pessoa");
        
    
        System.out.println("Nome :");
        nome=teclado.next();
        System.out.println("Idade :");
        idade=teclado.nextInt();
        Pessoa um= new Pessoa (nome,idade);

        while (n){
            System.out.println("Digite 1 para adicionar um ano de vida");
            System.out.println("Digite 2 para diminuir um ano de vida");
            System.out.println("Digite 3 para saber quantos anos a pessoa tem");
            System.out.println("Digite 0 para finalizar o sistema.");
            p=teclado.nextInt();
            if (p==1){
                idade=(idade+1);
                um.setIdade(idade);
            }
            else if (p==2){
                idade=(idade-1);
                um.setIdade(idade);
            }
            else if (p==3){
                System.out.println("Nome da pessoa=" +um.getNome());
                System.out.println("Idade=" +um.getIdade());
                if (um.getIdade() <0){
                    System.out.println("Confira a idade correta.");

                }
            }
            else if (p==0){
                n=false;
            }
        }   
    }
}