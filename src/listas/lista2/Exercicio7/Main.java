package listas.lista2.Exercicio7;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado =new Scanner (System.in);
        Supermercado novo= new Supermercado();
        Pedido um= new Pedido();
        int x;

        novo.produtos();

        System.out.println(" Bem vindo ao mercado virtual, que bom que escolheu comprar com a gente. Estamos carregando os produtos em estoque");
        System.out.println(" Faça seu pedido:");
        x= um.criarPedido(novo);

        while (x!=0){
            System.out.println("Para ver o seu pedido, aperte 1");
            System.out.println("Para finalizar o seu pedido aperte 0");
            x=teclado.nextInt();

            if (x==1){
                x= um.printar();
            }
            if (x==0){
                break;
            }
        }
        um.printar();
        um.pagar();
        System.out.println("Obrigada por comprar conosco! Seu pedido chega em 15 dias.");
    }
    static void novoProduto(Supermercado novo,int n, int p){
        Item produto= new Item();
        produto.nome=novo.lista[n].nome;
        produto.quantidade=p;
        produto.preco=novo.lista[n].preco;
        Pedido.adicionarIPedido(produto);

    }
}