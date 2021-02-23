import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        int n;
        n=0;

        Scanner teclado =new Scanner (System.in);
        Porta um= new Porta();
        recebePorta(um);
            
        while (n!=5){
            System.out.println("Digite 1 para pintar a porta.");
            System.out.println("Digite 2 para abrir ou fechar a porta.");
            System.out.println("Digite 3 para mudar as dimensões da porta.");
            System.out.println("Digite 4 para ver se a porta está do seu agrado.");
            System.out.println("Digite 5 para finalizar as mudanças.");
            n=teclado.nextInt();
            
            if (n==1){
                um.cor=teclado.next();
            }
            else if (n==2){
                um.status=!um.status;
            }
            else if (n==3){
                System.out.println("Digite a largura da porta:");
                um.largura=teclado.nextFloat();
                System.out.println("Digite a altura da porta:");
                um.altura=teclado.nextFloat();
            }
            else if (n==4){
                printar(um);
            }
        }
        printar(um);
    }

    static void printar(Porta porta) {
        System.out.println("Cor da porta=" +porta.cor);
        System.out.println("Dimensões (largura x altura)= (" +porta.largura +"x" +porta.altura +")");
        estaAberta(porta);
        System.out.println(" ");
    }

    static void estaAberta(Porta porta) {
    
        if (porta.status){
            System.out.println("A porta está aberta.");
            return;
        }
        System.out.println("A porta está fechada.");
    }
    static void recebePorta (Porta porta){
        Scanner teclado =new Scanner (System.in);
        int p;
        System.out.println("Digite a cor da porta:");
        porta.cor=teclado.next();
        System.out.println("Digite a largura da porta:");
        porta.largura=teclado.nextFloat();
        System.out.println("Digite a altura da porta:");
        porta.altura=teclado.nextFloat();
        System.out.println("Digite 1 se a porta está aberta e 2 se a porta está fechada:");
        p=teclado.nextInt();
        if (p==1){
            porta.status=true;
        }
        else if (p==2){
            porta.status=false;
        }
        else {
            System.out.println("Erro, a porta irá começar fechada.");
        }

    }
}