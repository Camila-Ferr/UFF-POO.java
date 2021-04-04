package listas.lista3.Exercicio3.Exercício1.Ex3Ex1Lista3;
public class Contato{
    private String nome;
    private String apelido;
    private String numero;
    private String eMail;

    Contato (String nome, String apelido, String numero, String eMail ){
        this.nome=nome;
        this.apelido=apelido;
        this.numero=numero;
        this.eMail=eMail;

    }

    public String getNome() {
        return this.nome;
    }
    public String getApelido() {
        return this.apelido;
    }
    public String getNumero() {
        return this.numero;
    }
    public String geteMail() {
        return this.eMail;
    }
}