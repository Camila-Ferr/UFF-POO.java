package listas.lista3.Exercicio3.Exercício1.Ex3Ex1Lista3;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int p;
        boolean n;
        String nome,apelido,numero,eMail;
        Scanner teclado =new Scanner (System.in);
        n=true;
        Agenda novaAgenda=new Agenda ();
        System.out.println("Bem vindo a sua agenda pessoal.");
        
        while (n){
            System.out.println("Digite 1 para adicionar um contato");
            System.out.println("Digite 2 para ver sua agenda");
            System.out.println("Digite 0 para finalizar alterações.");
            p=teclado.nextInt();
            if (p==1){
                System.out.println("Nome:");
                nome=teclado.next();
                System.out.println("Apelido:");
                apelido=teclado.next();
                System.out.println("Número:");
                numero=teclado.next();
                System.out.println("E-mail:");
                eMail=teclado.next();
                Contato primeiro= new Contato (nome,apelido,numero,eMail);
                novaAgenda.adicionar(primeiro);
            }
            else if (p==2){
                novaAgenda.printar(novaAgenda.lista);
            }
            else if (p==0){
                n=false;
            }
        }
    }
}