package listas.lista6.Exercicio3;

public class DadoInvalidoException extends NumberFormatException{
    private String mensagem;
    public DadoInvalidoException(String mensagem){
        this.mensagem=mensagem;
    }
    public DadoInvalidoException(){
        this.mensagem="Esse dado é inválido, pois ele precisa conter apenas números.";
    }
    @Override
    public String getMessage() {
        return mensagem;

    }

}
