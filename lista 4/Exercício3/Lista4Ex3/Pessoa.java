package Lista4Ex3;
class Pessoa {
    private String nome;
    private int idade;
    private String pai;
    private String mae;

    Pessoa (String nome, int idade, String pai, String mae){
        this.nome=nome;
        this.idade=idade;
        this.pai=pai;
        this.mae=mae;
    }
    Pessoa (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    public String getNome(){
        return nome;
    }
    public String getPai(){
        return pai;
    }
    public String getMae(){
        return mae;
    }
    void sets (String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
}
