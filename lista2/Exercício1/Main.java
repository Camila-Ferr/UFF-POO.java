import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int n,p;
        Scanner teclado =new Scanner (System.in);
        n=100;
        Agenda novaAgenda=new Agenda ();
        System.out.println("Bem vindo a sua agenda pessoal.");
        
        while (n!=0){
            System.out.println("Digite 1 para adicionar um contato");
            System.out.println("Digite 2 para ver sua agenda");
            System.out.println("Digite 0 para finalizar alterações.");
            n=teclado.nextInt();
            if (n==1){
                Contato primeiro= new Contato ();
                System.out.println("Nome:");
                primeiro.nome=teclado.next();
                System.out.println("Apelido:");
                primeiro.apelido=teclado.next();
                System.out.println("Número:");
                primeiro.numero=teclado.next();
                System.out.println("E-mail:");
                primeiro.eMail=teclado.next();
                novaAgenda.adicionar(primeiro);
            }
            if (n==2){
                novaAgenda.printar(novaAgenda.lista);
            }
        }
    }
}