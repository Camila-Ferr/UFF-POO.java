package listas.lista6.Exercicio3;

public class ClienteInexistenteException extends Exception {
    private final String mensagem;

    public ClienteInexistenteException(){
        this.mensagem="Esse cliente não existe.";
    }
    public String getMensagem(){
        return mensagem;
    }
}
