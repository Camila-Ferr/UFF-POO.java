package listas.lista6.Exercicio2;

import java.util.Scanner;

public class TesteContaCorrente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float saldo, valor;
        int n=-10;
        System.out.println("Bem vindo a sua conta corrente");
        System.out.println("Com quanto você vai iniciar sua conta?");
        saldo = teclado.nextFloat();

        ContaCorrente conta = new ContaCorrente(saldo);

        while (n != 0) {
            System.out.println("Digite 1 para sacar");
            System.out.println("Digite 2 para depositar");
            System.out.println("Digite 3 para ver seu saldo");
            System.out.println("Digite 0 para sair.");

            System.out.println("");
            n = teclado.nextInt();

            if (n == 1) {
                System.out.println("Digite o valor desejado:");
                valor = teclado.nextFloat();
                try {
                    conta.sacar(valor);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    System.out.println("");
                }
            }

            else if (n == 2) {
                System.out.println("Digite o valor desejado:");
                valor = teclado.nextFloat();
                try {
                    conta.depositar(valor);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    System.out.println("");
                }
            }
            else if (n==3){
                System.out.println("Seu saldo é " +conta.getSaldo());
            }
        }
    }
}
