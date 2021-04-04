package Ex3Ex7Lista3;
public class Item {
    private String nome;
    private double preco;
    private int quantidade;

    Item (String nome, double preco, int quantidade){
        this.nome=nome;
        this.preco=preco;
        this.quantidade=quantidade;
    }

    Item (){

    }

    public String getNome() {
        return this.nome;
    }
    public Double getPreco() {
        return this.preco;
    }
    public int getQuantidade() {
        return this.quantidade;
    }
    void setPreco (Double preco){
        this.preco=preco;
    }

    void setQuantidade (int quantidade){
        this.quantidade=quantidade;
    }
}
