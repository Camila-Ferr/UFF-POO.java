package listas.lista6.Exercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        int n, a, tamanho;
        String nome, idade, CPF;
        n = 1;
        tamanho = 0;
        while (n != 0) {
            System.out.println("Digite 1 se quiser adicionar um novo cliente:");
            System.out.println("Digite 2 se quiser buscar um cliente na lista");
            System.out.println("Digite 0 para sair");
            n = teclado.nextInt();
            System.out.println("");

            if (n == 1) {
                System.out.println("Digite o nome do cliente:");
                nome = teclado.next();
                System.out.println("Digite a idade do cliente:");
                idade = teclado.next();
                System.out.println("Digite o CPF do cliente:");
                CPF = teclado.next();

                for (Cliente percorre : clientes) {
                    if (percorre == null) {
                        break;
                    }
                    a = percorre.procuraC(Long.parseLong(CPF));
                    try {
                        if (a == 1) {
                            throw new ClienteJaExistenteException();
                        }
                    } catch (ClienteJaExistenteException e) {
                        System.out.println(e.getMensagem());
                    }
                }
                try {
                    if (tamanho >= 10) {
                        throw new RepositorioException();
                    }
                } catch (RepositorioException e) {
                    System.out.println(e.getMensagem());
                }

                try {
                    Cliente cliente = new Cliente(nome, idade, CPF);
                    clientes.add(cliente);
                    tamanho = tamanho + 1;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println("");

            if (n == 2) {
                a = 0;
                System.out.println("Digite o CPF do cliente:");
                CPF = teclado.next();
                for (Cliente percorre : clientes) {
                    a = percorre.procuraC(Long.parseLong(CPF));
                    if (a == 1) {
                        break;
                    }
                }
                if (a == 0) {
                    try {
                        throw new ClienteInexistenteException();
                    } catch (ClienteInexistenteException e) {
                        System.out.println(e.getMensagem());
                        System.out.println("");
                    }
                }
            }
        }
    }
}
