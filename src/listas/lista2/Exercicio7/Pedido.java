package listas.lista2.Exercicio7;
import java.util.Scanner;
class Pedido {
    Scanner teclado =new Scanner (System.in);
    static Item[] pedido = new Item[100];
    double subtotal;
    String formaDePagamento;
    static int cont = 0;

    static void adicionarIPedido(Item produto) {
        pedido[cont] = produto;
        cont = cont + 1;
    }
    int criarPedido(Supermercado novo){
        Scanner teclado =new Scanner (System.in);
        int p, n,outro;
        outro=1;
        subtotal=0;

        while (outro!=0){
            System.out.println("Digite o número correspondente ao produto desejado:");
            novo.mostrarEstoque();
            n=teclado.nextInt();
            n=n-1;
            System.out.println("Digite o número correspondente a quantidade de produtos desejada:");
            p=teclado.nextInt();
            Main.novoProduto (novo,n,p);
            novo.retirar (n,p);

            System.out.println(" ");
            System.out.println("Para adicionar um novo item, aperte 1.");
            System.out.println("Para ver o seu pedido aperte 2."); 
            System.out.println("Caso queira finalizar seu pedido, digite 0");
            outro=teclado.nextInt();

            if (outro==2){
                printar();
                System.out.println("Para adicionar um novo item, aperte 1.");
                System.out.println("Caso queira finalizar seu pedido, digite 0");
                outro=teclado.nextInt();

            }
            if (outro==0){
                return 0;
            }
        }
        return 1;
    }
    int printar(){
        subtotal=0;
        for (int a=0; a<cont; a++){
            System.out.println(" ");
            System.out.println(pedido[a].nome);
            System.out.println("Quantidade = " +pedido[a].quantidade);
            System.out.println("Valor do item = " +pedido[a].preco);
            subtotal=subtotal+(pedido[a].preco*pedido[a].quantidade);
        }
        System.out.println("Preço total do produto = " +subtotal);
        System.out.println("");
        return 0;
    }
    void pagar(){
        Scanner teclado =new Scanner (System.in);
        int forma,numero;
        System.out.println("Como vai ser a forma de pagamento?");
        System.out.println("Digite 1 para pagar com cartão de crédito.");
        System.out.println("Digite 2 para pagar no dinheiro.");
        System.out.println("Digite 3 para pagar no cheque.");
        forma=teclado.nextInt();

        if (forma==1){
            formaDePagamento="cartão de crédito";
            System.out.println("Digite o número do cartão");
            numero=teclado.nextInt();
        }
        if (forma==2){
            formaDePagamento="Dinheiro";
            System.out.println("Pegue o boleto no site e pague na lotérica mais próxima");
            System.out.println("O pagamento precisa ser efetivado dentro de 2 dias.");  
        }
        if (forma==3){
            formaDePagamento="Cheque";
            System.out.println("O pagamento precisa ser efetivado dentro de 2 dias.");  
        }
        System.out.println("A forma de pagamento escolhida foi " +formaDePagamento +" ." ); 
        
    }
}



