package listas.lista5.Exercicio4;
public class PorHora extends Funcionario {
    
    PorHora(int horasTrabalhadas, double lucroDasVendas, String nome){
        super( horasTrabalhadas, lucroDasVendas,  nome);
    }
    @Override
    public void calculaSalario(){
        double extras,hora;
        extras=0;
        hora=getSalarioFixo()/40;
        if (this.getHorasTrabalhadas()>40){
            extras=(this.getHorasTrabalhadas()-40)*hora*1.5;

        }
        this.setSalario(this.getSalarioFixo()+extras);
    }
    
}
