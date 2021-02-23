import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        int n;
        n=1;
        Televisao novaTelevisao=new Televisao ();
        novaTelevisao.adicionar();
        System.out.println("Parabéns pela sua nova TV. No momento, ela está desligada. Aguarde as instruções do menu...");
        
        while (n!=0){
            System.out.println("Aperte 1 para ligar ou desligar a TV.");
            System.out.println("Aperte 2 para mudar o canal da sua TV.");
            System.out.println("Aperte 3 para mudar o volume da sua TV.");
            System.out.println("Aperte 4 para ver como está a sua TV.");
            System.out.println("Digite 0 para fixar na programação.");
            n=teclado.nextInt();

            if (n==1){
                novaTelevisao.mudarEstado();
            }
            
            else if (n==2){
                novaTelevisao.mudarCanal();
            }
            else if (n==3){
                novaTelevisao.mudarVolume();
            }
            else if (n==4){
                novaTelevisao.printar ();
            }
        }
        novaTelevisao.printar ();
    }
}
