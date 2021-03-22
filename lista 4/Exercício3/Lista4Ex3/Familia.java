package Lista4Ex3;
import java.util.Scanner;
public class Familia {
    public static void main(String[] args) {
        int n;
        Scanner teclado =new Scanner (System.in);

        System.out.println ("Escreva o nome do seu pai e a idade." );
        System.out.println("Em seguida, escreva o nome do seu avô e o nome da sua avó paterna");
        Pessoa pai =new Pessoa(teclado.next(),teclado.nextInt(),teclado.next(),teclado.next());
        System.out.println (" ");

        System.out.println ("Escreva o nome da sua mãe e a idade." );
        System.out.println("Em seguida, escreva o nome do seu avô e o nome da sua avó materna");
        Pessoa mae= new Pessoa(teclado.next(),teclado.nextInt(),teclado.next(),teclado.next());
        System.out.println (" ");

        System.out.println ("Escreva o seu nome e sua idade." );
        Pessoa filho = new Pessoa(teclado.next(),teclado.nextInt());
        System.out.println (" ");

        System.out.println ("Você tem um irmão ou irmã ? Digite 1 se sim");
        n=teclado.nextInt();
        Pessoa filho2=new Pessoa("",0);
        if (n==1){
            System.out.println ("Digite o nome e a idade.");
            filho2.sets(teclado.next(),teclado.nextInt());
        }
        System.out.println (" ");
    
        System.out.println ("Seus avós paternos são " +pai.getMae() +" e " +pai.getPai() );
        System.out.println ("Seus avós maternos são " +mae.getMae() +" e " +mae.getPai() );
        System.out.println ("Seus pais são " +mae.getNome() +" e " +pai.getNome() );
        System.out.println ("Você se chama " +filho.getNome() );
        if (n==1){
            System.out.println ("Seu irmão é " +filho2.getNome() );
        }

    }

}




