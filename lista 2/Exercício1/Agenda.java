package Exercício1;
public class Agenda {
    Contato[] lista= new Contato[100];
    int indice=0;
    
    void adicionar (Contato contato){
        lista[indice]=contato;
        indice=indice+1;
    }

    void printar (Contato[] desejado){
        int a;
        for (a=0; a<indice; a++){
            System.out.println("Nome do contato=" +desejado[a].nome);
            System.out.println("Apelido=" +desejado[a].apelido);
            System.out.println("Número=" +desejado[a].numero);
            System.out.println("E-mail=" +desejado[a].eMail);
            System.out.println(" ");
        }
    }
}