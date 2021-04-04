package listas.lista5.Exercicio5;

import java.util.Scanner;
public class ItemVenda implements Recebivel {
    
    Scanner teclado =new Scanner (System.in);
    private String produto;
    private int quantidade;
    private double precoUnitario;

    ItemVenda( String produto, int quantidade, double precoUnitario){
        this.produto=produto;
        this.quantidade=quantidade;
        this.precoUnitario=precoUnitario;
    }

    @Override
    public double totalizarReceita() {
        return(this.precoUnitario*this.quantidade);
    }
    @Override
    public void printar(){
        System.out.println("Produto: " +this.produto +".");
        System.out.println("Quantidade do produto: " +this.quantidade +".");
        System.out.println("Preço do produto: " +this.precoUnitario +".");
        System.out.println("");
    }
        

}
