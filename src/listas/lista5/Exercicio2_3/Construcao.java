package listas.lista5.Exercicio2_3;
class Construcao implements CarbonFootprint {
    private boolean usoDeEnergiaRenovavel;
    private float EnergiaMensal;
    private double carbonFootprint;

    Construcao(boolean usoDeEnergiaRenovavel, float EnergiaMensal){
        this.usoDeEnergiaRenovavel=usoDeEnergiaRenovavel;
        this.EnergiaMensal=EnergiaMensal;
        this.carbonFootprint=getCarbonoFootprint();

    }

    public boolean getUsoDeEnergiaRenovavel() {
        return usoDeEnergiaRenovavel;
    }
    
    public float getEnergiaMensal() {
        return EnergiaMensal;
    }
    
    @Override
    public double getCarbonoFootprint (){
        
        if (this.usoDeEnergiaRenovavel==false){
         this.carbonFootprint=((29.52*this.EnergiaMensal)/100);
        }
        else {
            this.carbonFootprint=(((29.52*this.EnergiaMensal)/100)/2);
        }
        return carbonFootprint;
    }


    
}
