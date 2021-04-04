package listas.lista5.Exercicio4;
public class AC extends Funcionario{
    
    AC( int horasTrabalhadas, double lucroDasVendas, String nome){
        super( horasTrabalhadas, lucroDasVendas,  nome);
    }

    @Override
    public void calculaSalario(){
        this.setSalario(((this.getLucroDasVendas()*40)/100)+900);
        System.out.println ("O salário de " +this.getNome() +" antes do aumento: " + getSalario() +" .");
        aumento();

    }

    public void aumento (){
        this.setSalario((900*110)/100+this.getLucroDasVendas());
    }

    
}
