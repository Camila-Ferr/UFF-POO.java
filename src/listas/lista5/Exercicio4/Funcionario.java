package listas.lista5.Exercicio4;
public abstract class Funcionario {
    private String nome;
    private double salario;
    private final double SALARIOFIXO = 1200;
    private int horasTrabalhadas;
    private double lucroDasVendas;


    Funcionario( int horasTrabalhadas, double lucroDasVendas, String nome){
        this.nome=nome;
        this.horasTrabalhadas=horasTrabalhadas;
        this.lucroDasVendas=lucroDasVendas;
        
    }
    
    
    public void calculaSalario(){

    }

    public double getSalarioFixo() {
        return SALARIOFIXO;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getLucroDasVendas() {
        return lucroDasVendas;
    }
    public String getNome() {
        return nome;
    }
    
}
