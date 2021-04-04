package listas.lista4.Exercício1.Ex1Lista4;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        double valor;
        int escolha;
        System.out.println("Escolha a conversão desejada:");
        System.out.println("Digite 1 para passar de metro para pés quadrados.");
        System.out.println("Digite 2 para passar de pés quadrados para centímetros quadrados");
        System.out.println("Digite 3 para passar de milhas quadradas para acres");
        System.out.println("Digite 4 para passar de acres para pés quadrados");
        System.out.println(" ");
        escolha=teclado.nextInt();

        System.out.println("Digite o valor");
        valor=teclado.nextDouble();


        if (escolha==1){
            valor=ConversaoDeUnidadesDeArea.metroPe(valor);
        }
        else if (escolha==2){
            valor=ConversaoDeUnidadesDeArea.peCent(valor);
        }
        else if (escolha==3){
            valor=ConversaoDeUnidadesDeArea.milhasAcre(valor);

        }
        else if (escolha==4){
            valor=ConversaoDeUnidadesDeArea.acrePe(valor);
        }

        System.out.println(valor);



}
}
