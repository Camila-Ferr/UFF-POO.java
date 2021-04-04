package listas.lista3.Exercicio3.Exercicio2.Ex2Ex3Lista3;
public class Pessoa{
    private String nome;
    private int idade;

    Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade=idade;

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    void setIdade (int idade){
        this.idade=idade;
    } 
}