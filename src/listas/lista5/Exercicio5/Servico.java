package listas.lista5.Exercicio5;

public class Servico implements Recebivel {
    private String descricao;
    private int horas;
    private final double precoHora=15.5;
    
    Servico( String descricao, int horas){
        
        this.descricao=descricao;
        this.horas=horas;
    }

    @Override
    public double totalizarReceita() {
        return (this.horas*precoHora);
    }

    @Override
    public void printar(){
        System.out.println("Descrição do serviço: " +this.descricao +".");
        System.out.println("Horas para realizar: " +this.horas +".");
        System.out.println("Preço: " +this.precoHora*horas +".");
        System.out.println("");
    }
}
