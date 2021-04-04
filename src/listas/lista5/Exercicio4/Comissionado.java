package listas.lista5.Exercicio4;
public class Comissionado extends Funcionario {
    
    Comissionado( int horasTrabalhadas, double lucroDasVendas, String nome){
        super( horasTrabalhadas, lucroDasVendas,  nome);
    }

    @Override
    public void calculaSalario(){
        this.setSalario((this.getLucroDasVendas()*40)/100);
    }
    
}
