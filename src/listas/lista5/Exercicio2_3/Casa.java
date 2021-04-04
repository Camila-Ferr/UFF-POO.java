package listas.lista5.Exercicio2_3;
class Casa extends Edificio{
    
    private int moradores;
    private String endereco;
    private double carbonFootprint;

    Casa(int moradores, String endereco, double consumoDeEnergia, boolean usoDeEnergiaRenovavel){
        super(consumoDeEnergia,usoDeEnergiaRenovavel,"residencial");
        this.moradores=moradores;
        this.endereco=endereco;
        this.carbonFootprint=getCarbonoFootprint();
        
    }
    @Override
    void printa(){
        System.out.println("A casa tem " +this.moradores +" moradores e fica localizada em " +this.endereco + " .");
    }

    @Override
    public double getCarbonoFootprint () {
        double soma;
        
        soma=((this.getConsumoDeEnergia()*0.10)/100);
        if (this.getUsoDeEnergiaRenovavel()){
            this.carbonFootprint= (soma/2);
        }
        else {
            this.carbonFootprint= soma;
        }
        return carbonFootprint;
    }
    
}
