package listas.lista3.Exercicio3.Exercicio3.Ex3Ex3Lista3;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int q,p;
        boolean n=true;
        float larg, alt;

        Scanner teclado =new Scanner (System.in);
        String cor;
        float largura,altura;
        boolean status;
        System.out.println("Digite a cor da porta:");
        cor=teclado.next();
        System.out.println("Digite a largura da porta:");
        largura=teclado.nextFloat();
        System.out.println("Digite a altura da porta:");
        altura=teclado.nextFloat();
        System.out.println("Digite 1 se a porta está aberta e 2 se a porta está fechada:");
        p=teclado.nextInt();
        
        if (p==1){
            status=true;
        }
        else if (p==2){
            status=false;
        }
        else {
            System.out.println("Erro, a porta irá começar fechada.");
            status=false;
        }
        Porta um= new Porta(cor,largura,altura,status);

            
        while (n){
            System.out.println("Digite 1 para pintar a porta.");
            System.out.println("Digite 2 para abrir ou fechar a porta.");
            System.out.println("Digite 3 para mudar as dimensões da porta.");
            System.out.println("Digite 4 para ver se a porta está do seu agrado.");
            System.out.println("Digite 5 para finalizar as mudanças.");
            q=teclado.nextInt();
            
            if (q==1){
                um.setCor(teclado.next());
            }
            else if (q==2){
                um.setStatus();
            }
            else if (q==3){
                System.out.println("Digite a largura da porta:");
                larg=teclado.nextFloat();
                System.out.println("Digite a altura da porta:");
                alt=teclado.nextFloat();
                um.setDimensoes(larg,alt);
            }
            else if (q==4){
                printar(um);
            }
            else if (q==5){
                n=false;
            }
        }
        printar(um);
    }

    static void printar(Porta um) {
        System.out.println("Cor da porta=" +um.getCor());
        System.out.println("Dimensões (largura x altura)= (" +um.getLargura() +"x" +um.getAltura() +")");
        estaAberta(um);
        System.out.println(" ");
    }

    static void estaAberta(Porta um) {
        boolean status=um.getStatus();
        if (status){
            System.out.println("A porta está aberta.");
            return;
        }
        System.out.println("A porta está fechada.");
    }
}