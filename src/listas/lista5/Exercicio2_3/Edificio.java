package listas.lista5.Exercicio2_3;
abstract class Edificio implements CarbonFootprint {
    
    private double consumoDeEnergia;
    private boolean usoDeEnergiaRenovavel;
    private String tipoDeEdificio;
    
    Edificio(double consumoDeEnergia, boolean usoDeEnergiaRenovavel, String tipoDeEdificio){
        this.consumoDeEnergia=consumoDeEnergia;
        this.usoDeEnergiaRenovavel=usoDeEnergiaRenovavel;
        this.tipoDeEdificio= tipoDeEdificio;
    }

    public double getConsumoDeEnergia() {
        return consumoDeEnergia;
    }
    public String getTipoDeEdificio() {
        return tipoDeEdificio;
    }
    public boolean getUsoDeEnergiaRenovavel(){
        return usoDeEnergiaRenovavel;
    }
    abstract void printa ();
    //O Edificio necessita de classes concretas que extendam dessa classe, pois não é possível instanciar objetos a partir de classe abstratas.
}
