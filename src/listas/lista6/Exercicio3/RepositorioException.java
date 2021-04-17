package listas.lista6.Exercicio3;

public class RepositorioException extends Exception{
    private final String mensagem;
    public RepositorioException(){
        this.mensagem="Seu repositório já está cheio.";
    }

    public String getMensagem() {
        return mensagem;
    }
}
