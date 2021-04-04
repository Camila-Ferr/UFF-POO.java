package listas.lista5.Exercicio4;
public class Assalariado extends Funcionario {
    
    Assalariado(int horasTrabalhadas, double lucroDasVendas, String nome){
        super(horasTrabalhadas, lucroDasVendas,  nome);
    }

    @Override
    public void calculaSalario(){
        this.setSalario(this.getSalarioFixo());   
    }
    
}
