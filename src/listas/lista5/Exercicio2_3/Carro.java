package listas.lista5.Exercicio2_3;
public class Carro implements CarbonFootprint {
    private boolean usoDeArCondicionado;
    private float kmRodadosMensal;
    private float motorDoCarro;
    private String tipoDeCombustivel;
    private double carbonFootprint;

    Carro (boolean usoDeArCondicionado, float kmRodadosMensal, float motorDoCarro, String tipoDeCombustivel){
        this.tipoDeCombustivel=tipoDeCombustivel;
        this.usoDeArCondicionado=usoDeArCondicionado;
        this.kmRodadosMensal=kmRodadosMensal;
        this.motorDoCarro=motorDoCarro;
        this.carbonFootprint=getCarbonoFootprint();
    }

    public float getLitrosDeCombustivel() {
        return kmRodadosMensal;
    }
    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }
    public boolean getUsoDeArCondicionado(){
        return usoDeArCondicionado;
    }
    public float getMotorDoCarro() {
        return motorDoCarro;
    }
    public float getKmRodadosMensal() {
        return kmRodadosMensal;
    }

    @Override
    public double getCarbonoFootprint (){
        if (this.tipoDeCombustivel.equals("Etanol")){
            if ((this.motorDoCarro>=1.0)&&(this.motorDoCarro<=1.5)){
                this.carbonFootprint= ((0.14*this.kmRodadosMensal)/100);
            }

            else if ((this.motorDoCarro>=1.6)&&(this.motorDoCarro<=2.0)){
                this.carbonFootprint= ((0.19*this.kmRodadosMensal)/100);
            }

            else if (this.motorDoCarro>2.0){
                this.carbonFootprint= ((0.29*this.kmRodadosMensal)/100);
            }
        }
        else if (this.tipoDeCombustivel.equals("Gasolina")){
            if ((this.motorDoCarro>=1.0)&&(this.motorDoCarro<=1.5)){
                this.carbonFootprint= ((12.8*this.kmRodadosMensal)/100);
            }

            else if ((this.motorDoCarro>=1.6)&&(this.motorDoCarro<=2.0)){
                this.carbonFootprint= ((16.9*this.kmRodadosMensal)/100);
            }

            else if (this.motorDoCarro>2.0){
                this.carbonFootprint= ((24.7*this.kmRodadosMensal)/100);
            }
        }
        else if (this.tipoDeCombustivel.equals("Diesel")){
            if ((this.motorDoCarro>=1.0)&&(this.motorDoCarro<=2.0)){
                this.carbonFootprint= ((0.5*this.kmRodadosMensal)/100);
            }

            else if (this.motorDoCarro>2.0){
                this.carbonFootprint= ((22.4*this.kmRodadosMensal)/100);
            }
        }
            return carbonFootprint;

    }
}
