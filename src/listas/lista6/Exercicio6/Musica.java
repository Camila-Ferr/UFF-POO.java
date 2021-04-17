package listas.lista6.Exercicio6;

public class Musica {
    private String artista;
    private String nome;
    private int numero;

    Musica(String artista, String nome,int numero){
        this.artista=artista;
        this.nome=nome;
        this.numero=numero;

    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getArtista() {
        return artista;
    }
}
