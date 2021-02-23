import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        int n;
        n=1;
        System.out.println("Adicione uma nova pessoa");
        
        Pessoa um= new Pessoa ();
        System.out.println("Nome :");
        um.nome=teclado.next();
        System.out.println("Idade :");
        um.idade=teclado.nextInt();
        while (n!=0){
            System.out.println("Digite 1 para adicionar um ano de vida");
            System.out.println("Digite 2 para diminuir um ano de vida");
            System.out.println("Digite 3 para saber quantos anos a pessoa tem");
            System.out.println("Digite 0 para finalizar o sistema.");
            n=teclado.nextInt();
            if (n==1){
                um.idade=(um.idade+1);
            }
            else if (n==2){
                um.idade=(um.idade-1);
            }
            else if (n==3){
                System.out.println("Nome da pessoa=" +um.nome);
                System.out.println("Idade=" +um.idade);
                if (um.idade<0){
                    System.out.println("Confira a idade correta.");

                }
            }
        }   
    }
}
