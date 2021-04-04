package listas.lista5.Exercicio2_3;
class Escola extends Edificio {
    
    private String nome;
    private int numeroDeSalas;
    private int funcionarios;
    private double carbonFootprint;

    Escola(String nome, int numeroDeSalas, int funcionarios, double consumoDeEnergia, Boolean usoDeEnergiaRenovavel){
        super(consumoDeEnergia,usoDeEnergiaRenovavel,"comercial");
        this.nome=nome;
        this.numeroDeSalas=numeroDeSalas;
        this.funcionarios=funcionarios;
        this.carbonFootprint=getCarbonoFootprint();
    }

    @Override
    void printa(){
        System.out.println("A escola " +this.nome +" tem " +this.funcionarios +" funcionários e consome " +this.getConsumoDeEnergia() + " kw/h .");
    }

    @Override
    public double getCarbonoFootprint () {
        double soma;
        
        soma=((this.getConsumoDeEnergia()*0.9)/100);
        if (this.getUsoDeEnergiaRenovavel() ){
            this.carbonFootprint= (soma/2);
        }
        else {
            this.carbonFootprint= soma;
        }
        return carbonFootprint;
    }
    
}
