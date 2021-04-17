package listas.lista6.Exercicio1;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem vindo a sua rotina ");
        System.out.println("Nesse app, mandaremos suas medidas para médicos especializados. ");
        System.out.println("A partir delas, será criado uma rotina saudável para você. Vamos nessa");
        System.out.println("");

        boolean finalizado = false;

        String nome = null;
        String peso,numero;
        int idade;
        String altura;
        Float pesofl,alturafl;
        long numerol;

        System.out.println("Digite seu nome");
        nome = teclado.next();
        System.out.println("");

        System.out.println("Digite sua idade");
        try {
            idade = teclado.nextInt();
            if (idade < 0) {
                throw new IllegalArgumentException("Não é possível ter uma idade negativa.");
            }
        }
        catch(IllegalArgumentException i) {
            System.out.println("Digite novamente");
            idade = teclado.nextInt();
        }
        System.out.println("");

        System.out.println("Digite o seu peso:");
        try {
            peso=teclado.next();
            pesofl=Float.parseFloat(peso);

        }
        catch (NumberFormatException e){
            System.out.println("Você digitou no formato errado.");
            System.out.println("Digite novamente:");
            peso=teclado.next();
            pesofl=Float.parseFloat(peso);
        }
        System.out.println("");

        System.out.println("Digite a sua altura:");
        try {
            altura=teclado.next();
            alturafl=Float.parseFloat(altura);

        }
        catch (NumberFormatException e){
            System.out.println("Digite somente números.");
            System.out.println("Digite novamente:");
            altura=teclado.next();
            alturafl=Float.parseFloat(altura);
        }
        System.out.println("");

        System.out.println("Digite o seu número:");
        try {
            numero=teclado.next();
            numerol=Long.parseLong(numero);

        }
        catch (NumberFormatException e){
            System.out.println("Você digitou no formato errado.");
            System.out.println("Digite novamente:");
            numero=teclado.next();
            numerol=Long.parseLong(numero);
        }
        System.out.println("");

        System.out.println("");
        System.out.println("Seus dados foram enviados para um médico especializado. Enviaremos um SMS para o seu telefone");
    }
}