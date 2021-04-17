package listas.lista6.Exercicio3;

public class ClienteJaExistenteException extends Exception{
    private final String mensagem;
    ClienteJaExistenteException(){
        this.mensagem="Esse cliente já foi adicionado a lista.";
    }

    public String getMensagem() {
        return mensagem;
    }
}
