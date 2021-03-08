package Ex3Ex1Lista3;
public class Agenda {
    String nome, apelido,numero,eMail;
    Contato[] lista= new Contato[100];
    int indice=0;
    
    void adicionar (Contato contato){
        lista[indice]=contato;
        indice=indice+1;
    }

    void printar (Contato[] desejado){
        int a;
        for (a=0; a<indice; a++){
            nome=lista[a].getNome();
            apelido=lista[a].getApelido();
            numero=lista[a].getNumero();
            eMail=lista[a].geteMail();

            System.out.println("Nome do contato=" +nome);
            System.out.println("Apelido=" +apelido);
            System.out.println("Número=" +numero);
            System.out.println("E-mail=" +eMail);
            System.out.println(" ");
        }
    }
}